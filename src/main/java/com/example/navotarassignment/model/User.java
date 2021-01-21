package com.example.navotarassignment.model;

import javax.persistence.*;

@Entity
@Table(name = "userdetail")

//@NamedStoredProcedureQueries({
//	  @NamedStoredProcedureQuery(
//	    name = "userDetail", 
//	    procedureName = "USER_DETAIL", 
//	    resultClasses = { User.class }, 
//	    parameters = { 
//	        @StoredProcedureParameter(
//	          name = "p_year", 
//	          type = Integer.class, 
//	          mode = ParameterMode.IN) }) 
//	})

public class User implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;
	
	@Column(name = "address")
	private String address;

	@Column(name = "address2")
	private String address2;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	

	public User() {

	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

}
