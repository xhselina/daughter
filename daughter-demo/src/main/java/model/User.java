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
	
	private String username;
	private String nickname;
	private String email;
	private String pwd;
	private String phone;
	private String desc;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}