package admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import login.loginback;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class add_hotel
 */
public class add_hotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_hotel() {
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
		
		String hotel=request.getParameter("hotel_name");		
		String phone=request.getParameter("phone");
		String loct=request.getParameter("loc");
		
		
		
		
System.out.println(hotel+phone+loct);
		
		add_hotel_back ho=new add_hotel_back();
		
		boolean ans=false;
		
		try {
			ans=ho.add(hotel,phone,loct);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		if(ans) {
			response.sendRedirect("hotel_success.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}

		
		
		
		
		
	}

}
