package com.GroupP3.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.GroupP3.dao.TbadminiDao;
import com.GroupP3.model.Tbadmini;

/**
 * Servlet implementation class servelAdmin
 */
public class servelAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelAdmin() {
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
		
		
		String user=request.getParameter("usuario");
		String pass=request.getParameter("contra");
		
		
		TbadminiDao d=new TbadminiDao();
		
		Tbadmini e= new Tbadmini();
		
		e.setCmpUsser(user);
		e.setCmpPass(pass);
		
		//d.confirmacionTbadmini(e);
		
int verificar=d.confirmacionTbadmini(e).size();
		
		if(verificar==1) {
			
			response.sendRedirect("crud.jsp");
			
		}else {
			JOptionPane.showMessageDialog(null, "ERRO_MACRO");
			response.sendRedirect("iniciar.jsp");
			String mensaje="USUARIO INCORRRECTO";
			
			JOptionPane.showMessageDialog(null, "+mensaje+");
			

		}
		
	}

}
