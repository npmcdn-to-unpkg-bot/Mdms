package com.madams.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.madams.model.StatesList;

@Service
public class StatesService extends BaseService{

	@SuppressWarnings("unchecked")
	public List<StatesList> findAll(){
		Query query = em.createQuery("Select s from StatesList s");
		List<StatesList> list = (List<StatesList>)query.getResultList( );
		return list;
	}
	
	public StatesList findById(String code){
		try{
			return em.find(StatesList.class, code);
		}catch(NoResultException e){
			System.out.println("NOT FOUND: " + e);
			return null;
		}
	}
}
