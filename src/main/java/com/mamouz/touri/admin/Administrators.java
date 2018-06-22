package com.mamouz.touri.admin;


public class Administrators {

	private Long id;
	private String name;
	private String role;
	/**
	 * 
	 */
	public Administrators() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param role
	 */
	public Administrators(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
