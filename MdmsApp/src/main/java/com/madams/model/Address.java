package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="address_id")
	private int addressId;

	private int CITIES_LIST_city_id;

	private int HOSPITALS_LIST_hospital_id;

	private String number;

	@Column(name="office_office_id")
	private int officeOfficeId;

	private int PHYSICIAN_CONTACT_physician_contact_id;

	private String street;

	private int unchecked;

	private String zip;

	//bi-directional many-to-one association to CountriesList
	@ManyToOne
	@JoinColumn(name="COUNTRIES_LIST_country")
	private CountriesList countriesList;

	//bi-directional many-to-one association to Father
	@ManyToOne
	private Father father;

	//bi-directional many-to-one association to Mother
	@ManyToOne
	private Mother mother;

	//bi-directional many-to-one association to StatesList
	@ManyToOne
	@JoinColumn(name="STATES_LIST_code")
	private StatesList statesList;

	/*//bi-directional many-to-one association to Mother
	@OneToMany(mappedBy="address")
	private List<Mother> mothers;*/

	public Address() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getCITIES_LIST_city_id() {
		return this.CITIES_LIST_city_id;
	}

	public void setCITIES_LIST_city_id(int CITIES_LIST_city_id) {
		this.CITIES_LIST_city_id = CITIES_LIST_city_id;
	}

	public int getHOSPITALS_LIST_hospital_id() {
		return this.HOSPITALS_LIST_hospital_id;
	}

	public void setHOSPITALS_LIST_hospital_id(int HOSPITALS_LIST_hospital_id) {
		this.HOSPITALS_LIST_hospital_id = HOSPITALS_LIST_hospital_id;
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

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getUnchecked() {
		return this.unchecked;
	}

	public void setUnchecked(int unchecked) {
		this.unchecked = unchecked;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public CountriesList getCountriesList() {
		return this.countriesList;
	}

	public void setCountriesList(CountriesList countriesList) {
		this.countriesList = countriesList;
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

	public StatesList getStatesList() {
		return this.statesList;
	}

	public void setStatesList(StatesList statesList) {
		this.statesList = statesList;
	}

	/*public List<Mother> getMothers() {
		return this.mothers;
	}

	public void setMothers(List<Mother> mothers) {
		this.mothers = mothers;
	}

	public Mother addMother(Mother mother) {
		getMothers().add(mother);
		mother.setAddress(this);

		return mother;
	}

	public Mother removeMother(Mother mother) {
		getMothers().remove(mother);
		mother.setAddress(null);

		return mother;
	}*/

}