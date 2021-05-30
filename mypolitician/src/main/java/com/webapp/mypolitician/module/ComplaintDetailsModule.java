package com.webapp.mypolitician.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="complain_details")
public class ComplaintDetailsModule {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	private String complaintSubject;
	
	private String complainDescription_1;
	
	private String complainDescription_2;
	
	private String landmark;
	
	private String status;

	public ComplaintDetailsModule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComplaintDetailsModule(int id, String complaintSubject, String complainDescription_1,
			String complainDescription_2, String landmark, String status) {
		super();
		this.id = id;
		this.complaintSubject = complaintSubject;
		this.complainDescription_1 = complainDescription_1;
		this.complainDescription_2 = complainDescription_2;
		this.landmark = landmark;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplaintSubject() {
		return complaintSubject;
	}

	public void setComplaintSubject(String complaintSubject) {
		this.complaintSubject = complaintSubject;
	}

	public String getComplainDescription_1() {
		return complainDescription_1;
	}

	public void setComplainDescription_1(String complainDescription_1) {
		this.complainDescription_1 = complainDescription_1;
	}

	public String getComplainDescription_2() {
		return complainDescription_2;
	}

	public void setComplainDescription_2(String complainDescription_2) {
		this.complainDescription_2 = complainDescription_2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
