package com.GroupP3.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.GroupP3.model.Tbadmini;
import com.GroupP3.model.Tbperson;
import com.mysql.fabric.Response;

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
	
	public List<Tbperson> lista(){
		List<Tbperson> lista=new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("laboratorio-2");
		em=emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			lista=em.createQuery("from Tbperson").getResultList();
			em.getTransaction().commit();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return lista;
		
	}
	
	public void agregarDatos(Tbperson ag) {
		EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("laboratorio-2");
		em=emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(ag);
		em.flush();
		em.getTransaction().commit();
		
	}
  public void actualizar(Tbperson a) {
	  EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("laboratorio-2");
		em=emf.createEntityManager();
		a.getCmpId();
		a.getCmpNombre();
		a.getCmpApellido();
		a.getCmpDui();
		
		em.getTransaction().begin();
		em.merge(a);
		em.flush();
		em.getTransaction().commit();
		
		
  }
  
  public void eliminar(Tbperson e){
	  EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("laboratorio-2");
		em=emf.createEntityManager();
		e=em.getReference(Tbperson.class, e.getCmpId());
		em.getTransaction().begin();
		em.remove(e);
		em.flush();
		em.getTransaction().commit();
	  
  }
	
}
