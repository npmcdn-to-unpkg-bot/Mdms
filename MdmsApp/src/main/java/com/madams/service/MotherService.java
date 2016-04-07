package com.madams.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.madams.model.Mother;

@Service
public class MotherService extends BaseService{
	
	public List<Mother> retrieveMother(int id){
		Mother oneMother = null;
		try {  //if part
			Query query = em.createQuery("Select m from Mother m where m.motherId = :id");
			query.setParameter("id", id);
			//oneMother = em.find( Mother.class, id );
		    //use the record from the fetched result.
			return (List<Mother>)query.getResultList( );
		}
		catch(NoResultException e){
			System.out.println("Exception NOT FOUND:"+e);
			return null;
		}
	}
	
	public List<Mother> allMotherList(){
		//Scalar function
		Query query = em.createQuery("Select m from Mother m");
		List<Mother> list=(List<Mother>)query.getResultList( );
		return list;
	}

}
