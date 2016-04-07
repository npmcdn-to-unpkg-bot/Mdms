package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the mother_contact database table.
 * 
 */
@Entity
@Table(name="mother_contact")
@NamedQuery(name="MotherContact.findAll", query="SELECT m FROM MotherContact m")
public class MotherContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="mother_contact_id")
	private int motherContactId;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	private String relationship;

	//bi-directional many-to-one association to Mother
	@ManyToOne
	private Mother mother;

	//bi-directional many-to-one association to Phone
	@OneToMany(mappedBy="motherContact")
	private List<Phone> phones;

	public MotherContact() {
	}

	public int getMotherContactId() {
		return this.motherContactId;
	}

	public void setMotherContactId(int motherContactId) {
		this.motherContactId = motherContactId;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Mother getMother() {
		return this.mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Phone addPhone(Phone phone) {
		getPhones().add(phone);
		phone.setMotherContact(this);

		return phone;
	}

	public Phone removePhone(Phone phone) {
		getPhones().remove(phone);
		phone.setMotherContact(null);

		return phone;
	}

}