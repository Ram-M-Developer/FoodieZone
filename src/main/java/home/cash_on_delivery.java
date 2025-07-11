package home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class cash_on_delivery
 */
public class cash_on_delivery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cash_on_delivery() {
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
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String food_name=request.getParameter("food_name");
		String hotel_name=request.getParameter("hotel_name");
		String total=request.getParameter("total");
		
		
		System.out.println("User:"+food_name+hotel_name+total);
		
		
boolean ans=false;
		
		
			
		  try {
			  try {
				  ans=user_process.order_details(name,phone,address,food_name,hotel_name,total);
			  }catch(ClassNotFoundException e) {
				  e.printStackTrace();
			  }
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  
		
		
		
		if(ans==true) {
			response.sendRedirect("done.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}


	
		
		
	}

}
