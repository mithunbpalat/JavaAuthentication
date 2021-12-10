package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mcq_role",catalog="mcq_database")
public class Role {
	@Id
	@GeneratedValue
	private int role_id;
	private String role;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int role_id, String role) {
		super();
		this.role_id = role_id;
		this.role = role;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
