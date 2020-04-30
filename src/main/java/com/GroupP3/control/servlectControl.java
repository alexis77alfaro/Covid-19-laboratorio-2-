package com.GroupP3.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GroupP3.dao.TbpersonDao;
import com.GroupP3.model.Tbperson;
import com.google.gson.Gson;

/**
 * Servlet implementation class servlectControl
 */
public class servlectControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlectControl() {
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

		try {
			
			String duiP = request.getParameter("data");
			System.out.println(duiP);
			
			Tbperson tbp = new Tbperson();
			TbpersonDao tbpDao = new TbpersonDao();
			
			tbp.setCmpDui(duiP);
			
			Gson json = new Gson();
			
			response.getWriter().append(json.toJson(tbpDao.confirmacionTbPerson(tbp)));
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
