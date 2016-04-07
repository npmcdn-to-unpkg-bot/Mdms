package com.madams.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.madams.model.Status;

@Service
public class StatusService extends BaseService{
	
	@SuppressWarnings("unchecked")
	public List<Status> findAll(){
		Query query = em.createQuery("Select s from Status s");
		List<Status> list = (List<Status>)query.getResultList( );
		return list;
	}
	
	public List<Status> findByType(String type){
		try{
			Query q = em.createQuery("from Status s where s.type = :type");
			q.setParameter("type", type);
			return (List<Status>)q.getResultList( );
		}catch(NoResultException e){
			System.out.println("NOT FOUND: " + e);
			return null;
		}
	}
}
