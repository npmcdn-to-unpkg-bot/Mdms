package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the states_list database table.
 * 
 */
@Entity
@Table(name="states_list")
@NamedQuery(name="StatesList.findAll", query="SELECT s FROM StatesList s")
public class StatesList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String code;

	private String state;

	//bi-directional many-to-one association to CountriesList
	/*@ManyToOne
	@JoinColumn(name="COUNTRIES_LIST_country")
	private CountriesList countriesList;*/

	public StatesList() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*public CountriesList getCountriesList() {
		return this.countriesList;
	}

	public void setCountriesList(CountriesList countriesList) {
		this.countriesList = countriesList;
	}*/

}