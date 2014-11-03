package model;

import javax.persistence.Entity;

import org.daughter.model.BaseEntity;

@Entity
// @Table(name = "t_user", uniqueConstraints = { @UniqueConstraint(columnNames =
// { "username" }) })
// @Table(name="t_user")
public class User extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7144907559493820517L;
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}