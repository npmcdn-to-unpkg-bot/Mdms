package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the mother database table.
 * 
 */
@Entity
@NamedQuery(name="Mother.findAll", query="SELECT m FROM Mother m")
public class Mother implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="mother_id")
	private int motherId;

	@Column(name="contact_method")
	private String contactMethod;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	@Column(name="first_name")
	private String firstName;

	private String initials;

	@Column(name="language_service_requested")
	private int languageServiceRequested;

	private String LANGUAGES_LIST_language;

	@Column(name="last_name")
	private String lastName;

	@Column(name="maiden_name")
	private String maidenName;

	@Column(name="medical_record")
	private String medicalRecord;

	@Column(name="middle_name")
	private String middleName;

	private String nickname;

	@Column(name="no_father")
	private int noFather;

	@Lob
	@Column(name="status_notes")
	private String statusNotes;
	
	
	//Commented the address to test rest response
	/*//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="mother")
	private List<Address> addresses;

	//bi-directional many-to-one association to Address
	@ManyToOne
	private Address address;

	//bi-directional many-to-one association to MaritalStatusList
	@ManyToOne
	@JoinColumn(name="MARITAL_STATUS_LIST_marital_status_id")
	private MaritalStatusList maritalStatusList;

	//bi-directional one-to-one association to Status
	@OneToOne
	@JoinColumn(name="status_status_id")
	private Status status;

	//bi-directional many-to-one association to MotherContact
	@OneToMany(mappedBy="mother")
	private List<MotherContact> motherContacts;

	//bi-directional many-to-one association to Phone
	@OneToMany(mappedBy="mother")
	private List<Phone> phones;

	//bi-directional many-to-one association to Pregnancy
	@OneToMany(mappedBy="mother")
	private List<Pregnancy> pregnancies;*/

	public Mother() {
	}

	public int getMotherId() {
		return this.motherId;
	}

	public void setMotherId(int motherId) {
		this.motherId = motherId;
	}

	public String getContactMethod() {
		return this.contactMethod;
	}

	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
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

	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getLanguageServiceRequested() {
		return this.languageServiceRequested;
	}

	public void setLanguageServiceRequested(int languageServiceRequested) {
		this.languageServiceRequested = languageServiceRequested;
	}

	public String getLANGUAGES_LIST_language() {
		return this.LANGUAGES_LIST_language;
	}

	public void setLANGUAGES_LIST_language(String LANGUAGES_LIST_language) {
		this.LANGUAGES_LIST_language = LANGUAGES_LIST_language;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getMedicalRecord() {
		return this.medicalRecord;
	}

	public void setMedicalRecord(String medicalRecord) {
		this.medicalRecord = medicalRecord;
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

	public int getNoFather() {
		return this.noFather;
	}

	public void setNoFather(int noFather) {
		this.noFather = noFather;
	}

	public String getStatusNotes() {
		return this.statusNotes;
	}

	public void setStatusNotes(String statusNotes) {
		this.statusNotes = statusNotes;
	}
	
	//Commented the address to test rest response
	/*public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setMother(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setMother(null);

		return address;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MaritalStatusList getMaritalStatusList() {
		return this.maritalStatusList;
	}

	public void setMaritalStatusList(MaritalStatusList maritalStatusList) {
		this.maritalStatusList = maritalStatusList;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<MotherContact> getMotherContacts() {
		return this.motherContacts;
	}

	public void setMotherContacts(List<MotherContact> motherContacts) {
		this.motherContacts = motherContacts;
	}

	public MotherContact addMotherContact(MotherContact motherContact) {
		getMotherContacts().add(motherContact);
		motherContact.setMother(this);

		return motherContact;
	}

	public MotherContact removeMotherContact(MotherContact motherContact) {
		getMotherContacts().remove(motherContact);
		motherContact.setMother(null);

		return motherContact;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Phone addPhone(Phone phone) {
		getPhones().add(phone);
		phone.setMother(this);

		return phone;
	}

	public Phone removePhone(Phone phone) {
		getPhones().remove(phone);
		phone.setMother(null);

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
		pregnancy.setMother(this);

		return pregnancy;
	}

	public Pregnancy removePregnancy(Pregnancy pregnancy) {
		getPregnancies().remove(pregnancy);
		pregnancy.setMother(null);

		return pregnancy;
	}*/

}