package com.cdweb.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="user_role")
public class UserRole implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUserRole;
	
	@JoinColumn(name="idUser")
	@ManyToOne
	@JsonIgnore
	private User user;

	@JoinColumn(name="idRole")
	@ManyToOne
	@JsonIgnore
	private Role role;

	public UserRole(User user, Role role) {
		super();
		this.user = user;
		this.role = role;
	}
	
	public UserRole() {
		// TODO Auto-generated constructor stub
	}

	public int getIdUserRole() {
		return idUserRole;
	}

	public void setIdUserRole(int idUserRole) {
		this.idUserRole = idUserRole;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
