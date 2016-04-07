package com.madams.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.madams.model.CountriesList;

@Service
public class CountriesService extends BaseService{
	
	@SuppressWarnings("unchecked")
	public List<CountriesList> findAll(){
		Query query = em.createQuery("Select c from CountriesList c");
		List<CountriesList> list = (List<CountriesList>)query.getResultList( );
		return list;
	}
	
	public CountriesList findById(String country){
		try{
			return em.find(CountriesList.class, country);
		}catch(NoResultException e){
			System.out.println("NOT FOUND: " + e);
			return null;
		}
	}
}
