package sumin.summer.model;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable{

	private static final long serialVersionUID = 1L;

	private String userId;
	private String password;
	private String name;
	private String deptName;
	private String email;
	private Date regDate;
	private Date logDate;


	public Member() {
		super();
	}
	public Member(String userId, String password, String name,
			String deptName, String email, Date regDate, Date logDate) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.deptName = deptName;
		this.email = email;
		this.regDate = regDate;
		this.logDate = logDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
}
