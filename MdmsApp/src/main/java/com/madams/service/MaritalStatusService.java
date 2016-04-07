package com.madams.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.madams.model.MaritalStatusList;
import com.madams.model.Status;

@Service
public class MaritalStatusService extends BaseService{
	
	@SuppressWarnings("unchecked")
	public List<Status> findAll(){
		Query query = em.createQuery("Select s from Status s");
		List<Status> list = (List<Status>)query.getResultList( );
		return list;
	}
	
	public MaritalStatusList findById(int id){
		try{
			return em.find(MaritalStatusList.class, id);
		}catch(NoResultException e){
			System.out.println("NOT FOUND: " + e);
			return null;
		}
	}
}
