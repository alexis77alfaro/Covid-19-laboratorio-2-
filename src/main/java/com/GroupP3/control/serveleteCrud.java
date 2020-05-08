package com.GroupP3.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GroupP3.dao.TbadminiDao;
import com.GroupP3.dao.TbpersonDao;
import com.GroupP3.model.Tbperson;
import com.google.gson.Gson;

/**
 * Servlet implementation class serveleteCrud
 */
public class serveleteCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveleteCrud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());


		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		TbpersonDao benef=new TbpersonDao();
		Tbperson pers=new Tbperson();
				 
				
			Gson json=new Gson();
			
			try {
				response.getWriter().append(json.toJson(benef.lista()));
			}catch(Exception e) {
				System.out.print(e);
				String a;
			}
			//agregando datos 
			
			 
			 String id=request.getParameter("id");
			 String name=request.getParameter("nombre");
			 String lastname=request.getParameter("apellido");
			 String dui=request.getParameter("dui");
			 
			 
			 
			 
			 String action=request.getParameter("btn");
			
			 
			 try {
				 
				 if(action.equals("agregar")) {
					 pers.setCmpId(Integer.parseInt(id));
					 pers.setCmpNombre(name);
					 pers.setCmpApellido(lastname);
					 pers.setCmpDui(dui);
					 benef.agregarDatos(pers);
					
				 }
				 
				 else if(action.equals("actualizar")) {
					 pers.setCmpId(Integer.parseInt(id));
					 pers.setCmpNombre(name);
					 pers.setCmpApellido(lastname);
					 pers.setCmpDui(dui);
					 benef.actualizar(pers);
					
				 }
				 
				 else if(action.equals("eliminar")) {
					 response.sendRedirect("crud.jsp");
					 pers.setCmpId(Integer.parseInt(id));
					 
					 benef.eliminar(pers);
				 }
				 
			 }catch(Exception e) {
				 System.out.print(e);
				 
			 }
//cargar datos
			
			 
			 
			
		
		 
		
	}

}
