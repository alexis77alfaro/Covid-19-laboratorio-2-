package com.GroupP3.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.GroupP3.model.Tbadmini;

public class TbadminiDao {

	public List<Tbadmini> confirmacionTbadmini(Tbadmini a){
		List<Tbadmini> result = new ArrayList();
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("laboratorio-2");
		em = emf.createEntityManager();
			
		try {
			em.getTransaction().begin();
			result = em.createQuery("from Tbadmini as a where a.cmpPass='"+a.getCmpPass()+"' and a.cmpUsser = '"+a.getCmpUsser()+"'").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error" + e.getMessage());
		}  
		 
		
		return result;
	}
}
