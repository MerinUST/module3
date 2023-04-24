package com.ust.ioc;

public class Login {
	private String userNme;
	private String password;
	DBConnection db;
	
	
	public DBConnection getDb() {
		return db;
	}


	public void setDb(DBConnection db) {
		this.db = db;
	}


	public String getUserNme() {
		return userNme;
	}


	public void setUserNme(String userNme) {
		this.userNme = userNme;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String validate() {
		//obtain connection and writes sql to verify username and password exist in database
		//db= new DBConnection();
		Connection con=db.getConnection();
		//DBConnection connection=DBConnection.getConnection();
	return "login validated...";
	}
	

}
