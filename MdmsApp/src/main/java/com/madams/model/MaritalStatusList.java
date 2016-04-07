package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the marital_status_list database table.
 * 
 */
@Entity
@Table(name="marital_status_list")
@NamedQuery(name="MaritalStatusList.findAll", query="SELECT m FROM MaritalStatusList m")
public class MaritalStatusList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="marital_status_id")
	private int maritalStatusId;

	@Column(name="marital_status")
	private String maritalStatus;

	public MaritalStatusList() {
	}

	public int getMaritalStatusId() {
		return this.maritalStatusId;
	}

	public void setMaritalStatusId(int maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
}