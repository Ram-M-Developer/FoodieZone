package admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class hotel_details
 */
public class hotel_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hotel_details() {
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
		
	   String hotel_name=request.getParameter("delete_hotel");
	  
	   System.out.println(hotel_name);
	
	   
	   hotel_details_back ho=new hotel_details_back();
		
		boolean ans=false;
		
		try {
			ans=ho.delete(hotel_name);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		if(ans) {
			response.sendRedirect("hotel_deleted.jsp");
		}
		
	   
	}

}
