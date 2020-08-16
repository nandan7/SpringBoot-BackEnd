package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usertable")

public class User {
	
	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "id", allocationSize=1)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="type")
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
