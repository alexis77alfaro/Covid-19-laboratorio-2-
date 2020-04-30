package com.GroupP3.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.GroupP3.model.Tbperson;

public class TbpersonDao {

	public List<Tbperson> confirmacionTbPerson(Tbperson p){
		List<Tbperson> resultado = new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("laboratorio-2");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			resultado = em.createQuery("from Tbperson as p where p.cmpDui ='" + p.getCmpDui() +"'").getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return resultado;
	}
}
