package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/daughter?useUnicode=true&characterEncoding=utf-8", "root", "root");
			connection.setAutoCommit(false);
			connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO 'daughter.user'('id','count','createDate','creator','updateDate','updater','email','password') VALUES ( '','1',NULL,'jeffrey',NULL,'jeffrey','jeffrey@163.com','jeffrey');";
			statement.execute(sql);
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
