package admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class food_delete
 */
public class food_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public food_delete() {
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
		
		String food_name=request.getParameter("delete_food");
		String HotelName=request.getParameter("hotel_name");
		
		System.out.println(HotelName);
		  
		   System.out.println(food_name);
		   
		   
		   food_details_back food=new food_details_back();
			
			boolean ans=false;
			
			try {
				ans=food.deleteFood(food_name,HotelName);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block	
				e.printStackTrace();
			}
			
			if(ans) {
				response.sendRedirect("food_details.jsp");
			}
			else {
				response.sendRedirect("error.jsp");
			}

		
	}

}
