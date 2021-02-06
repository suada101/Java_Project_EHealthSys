/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 
 */


public class Patient {

	private String username;
	private String password;
/*	private String firstname;
	private String lastname;
	private String address;
	private String zipCode;
	private String city;
	*/
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username, int ID) {
		this.username = username + Integer.toString(ID);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
