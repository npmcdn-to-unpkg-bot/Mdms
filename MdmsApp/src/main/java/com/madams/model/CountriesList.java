package com.madams.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the countries_list database table.
 * 
 */
@Entity
@Table(name="countries_list")
@NamedQuery(name="CountriesList.findAll", query="SELECT c FROM CountriesList c")
public class CountriesList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String country;

	//bi-directional many-to-one association to StatesList
	/*@OneToMany(mappedBy="countriesList")
	private List<StatesList> statesLists;*/

	public CountriesList() {
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*public List<StatesList> getStatesLists() {
		return this.statesLists;
	}

	public void setStatesLists(List<StatesList> statesLists) {
		this.statesLists = statesLists;
	}

	public StatesList addStatesList(StatesList statesList) {
		getStatesLists().add(statesList);
		statesList.setCountriesList(this);
		return statesList;
	}

	public StatesList removeStatesList(StatesList statesList) {
		getStatesLists().remove(statesList);
		statesList.setCountriesList(null);
		return statesList;
	}*/

}