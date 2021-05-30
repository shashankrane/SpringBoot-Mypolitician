package com.webapp.mypolitician.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_Details")
public class UserDetailsModule {

	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	
	@Column(name="fathers_name")
	private String middleName;
	
	private String lastName;
	
	
	private int wardNumber;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="add_id")
	private AddressDetailsModule address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="complaint_id")
	private List<ComplaintDetailsModule> complaint = new ArrayList<>();

	public UserDetailsModule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetailsModule(int id, String firstName, String middleName, String lastName, int wardNumber,
			AddressDetailsModule address, List<ComplaintDetailsModule> complaint) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.wardNumber = wardNumber;
		this.address = address;
		this.complaint = complaint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public AddressDetailsModule getAddress() {
		return address;
	}

	public void setAddress(AddressDetailsModule address) {
		this.address = address;
	}

	public List<ComplaintDetailsModule> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<ComplaintDetailsModule> complaint) {
		this.complaint = complaint;
	}
	
	
	
}
