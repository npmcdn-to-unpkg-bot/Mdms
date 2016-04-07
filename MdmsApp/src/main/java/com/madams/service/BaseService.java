package com.madams.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseService {
	protected EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "MdmsApp" );
	protected EntityManager em = emfactory.createEntityManager();
}
