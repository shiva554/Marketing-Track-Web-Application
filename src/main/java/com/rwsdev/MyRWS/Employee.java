package com.rwsdev.MyRWS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Entity
@Table(name="employee")
@XmlRootElement(name = "employee")
@XmlType(propOrder={"id","eName","street","city","state","zipcode"})
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
   	private int id;
	@Column(name = "ename")
	private String eName;
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zipcode")
	private int zipcode;
	
	public Employee(){
		
	}
	
	/*public Employee(int id,String eName,String street,String city,String state,int zipcode){
		
		this.id = id;
		this.eName = eName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}*/
	@XmlElement
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement
	public String geteName() {
		return eName;
	}
	
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	@XmlElement
	public String getStreet() {
		return street;
	}
	
	
	public void setStreet(String street) {
		this.street = street;
	}
	@XmlElement
	public String getCity() {
		return city;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
	@XmlElement
	public String getState() {
		return state;
	}
	
	
	public void setState(String state) {
		this.state = state;
	}
	@XmlElement
	public int getZipcode() {
		return zipcode;
	}
	
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
