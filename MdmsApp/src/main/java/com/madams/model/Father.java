package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the father database table.
 * 
 */
@Entity
@NamedQuery(name="Father.findAll", query="SELECT f FROM Father f")
public class Father implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="father_id")
	private int fatherId;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	private String nickname;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="father")
	private List<Address> addresses;

	//bi-directional many-to-one association to Phone
	@OneToMany(mappedBy="father")
	private List<Phone> phones;

	//bi-directional many-to-one association to Pregnancy
	@OneToMany(mappedBy="father")
	private List<Pregnancy> pregnancies;

	public Father() {
	}

	public int getFatherId() {
		return this.fatherId;
	}

	public void setFatherId(int fatherId) {
		this.fatherId = fatherId;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setFather(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setFather(null);

		return address;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Phone addPhone(Phone phone) {
		getPhones().add(phone);
		phone.setFather(this);

		return phone;
	}

	public Phone removePhone(Phone phone) {
		getPhones().remove(phone);
		phone.setFather(null);

		return phone;
	}

	public List<Pregnancy> getPregnancies() {
		return this.pregnancies;
	}

	public void setPregnancies(List<Pregnancy> pregnancies) {
		this.pregnancies = pregnancies;
	}

	public Pregnancy addPregnancy(Pregnancy pregnancy) {
		getPregnancies().add(pregnancy);
		pregnancy.setFather(this);

		return pregnancy;
	}

	public Pregnancy removePregnancy(Pregnancy pregnancy) {
		getPregnancies().remove(pregnancy);
		pregnancy.setFather(null);

		return pregnancy;
	}

}