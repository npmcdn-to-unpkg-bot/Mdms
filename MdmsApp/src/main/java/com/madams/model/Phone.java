package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the phone database table.
 * 
 */
@Entity
@NamedQuery(name="Phone.findAll", query="SELECT p FROM Phone p")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="phone_id")
	private int phoneId;

	private String extension;

	private int HOSPITALS_LIST_hospital_id;

	private int INSURANCE_INFORMATION_insurance_information_id;

	private String number;

	@Column(name="office_office_id")
	private int officeOfficeId;

	private int PHYSICIAN_CONTACT_physician_contact_id;

	private int PHYSICIAN_physician_id;

	private String type;

	private byte unchecked;

	//bi-directional many-to-one association to Father
	@ManyToOne
	private Father father;

	//bi-directional many-to-one association to Mother
	@ManyToOne
	private Mother mother;

	//bi-directional many-to-one association to MotherContact
	@ManyToOne
	@JoinColumn(name="MOTHER_CONTACT_mother_contact_id")
	private MotherContact motherContact;

	public Phone() {
	}

	public int getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getHOSPITALS_LIST_hospital_id() {
		return this.HOSPITALS_LIST_hospital_id;
	}

	public void setHOSPITALS_LIST_hospital_id(int HOSPITALS_LIST_hospital_id) {
		this.HOSPITALS_LIST_hospital_id = HOSPITALS_LIST_hospital_id;
	}

	public int getINSURANCE_INFORMATION_insurance_information_id() {
		return this.INSURANCE_INFORMATION_insurance_information_id;
	}

	public void setINSURANCE_INFORMATION_insurance_information_id(int INSURANCE_INFORMATION_insurance_information_id) {
		this.INSURANCE_INFORMATION_insurance_information_id = INSURANCE_INFORMATION_insurance_information_id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getOfficeOfficeId() {
		return this.officeOfficeId;
	}

	public void setOfficeOfficeId(int officeOfficeId) {
		this.officeOfficeId = officeOfficeId;
	}

	public int getPHYSICIAN_CONTACT_physician_contact_id() {
		return this.PHYSICIAN_CONTACT_physician_contact_id;
	}

	public void setPHYSICIAN_CONTACT_physician_contact_id(int PHYSICIAN_CONTACT_physician_contact_id) {
		this.PHYSICIAN_CONTACT_physician_contact_id = PHYSICIAN_CONTACT_physician_contact_id;
	}

	public int getPHYSICIAN_physician_id() {
		return this.PHYSICIAN_physician_id;
	}

	public void setPHYSICIAN_physician_id(int PHYSICIAN_physician_id) {
		this.PHYSICIAN_physician_id = PHYSICIAN_physician_id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte getUnchecked() {
		return this.unchecked;
	}

	public void setUnchecked(byte unchecked) {
		this.unchecked = unchecked;
	}

	public Father getFather() {
		return this.father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Mother getMother() {
		return this.mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public MotherContact getMotherContact() {
		return this.motherContact;
	}

	public void setMotherContact(MotherContact motherContact) {
		this.motherContact = motherContact;
	}

}