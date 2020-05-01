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

TbpersonDao benef=new TbpersonDao();
Tbperson pers=new Tbperson();
		 
		
		 
		 String id=request.getParameter("id");
		 String name=request.getParameter("nombre");
		 String lastname=request.getParameter("apellido");
		 String dui=request.getParameter("dui");
		 
		 
		 
		 
		 String action=request.getParameter("btn");
		
		 
		 try {
			 
			 if(action.equals("save")) {
				 pers.setCmpId(Integer.parseInt(id));
				 pers.setCmpNombre(name);
				 pers.setCmpApellido(lastname);
				 pers.setCmpDui(dui);
				 benef.agregarDatos(pers);
				 response.sendRedirect("index.jsp");
			 }
			 
			 else if(action.equals("update")) {
				 pers.setCmpId(Integer.parseInt(id));
				 pers.setCmpNombre(name);
				 pers.setCmpApellido(lastname);
				 pers.setCmpDui(dui);
				 benef.actualizar(pers);
				 response.sendRedirect("index.jsp");
			 }
			 
			 else if(action.equals("delete")) {
				 response.sendRedirect("crud.jsp");
				 pers.setCmpId(Integer.parseInt(id));
				 
				 benef.eliminar(pers);
			 }
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 
			
			 
			 
			
		
		 
		
	}

}
