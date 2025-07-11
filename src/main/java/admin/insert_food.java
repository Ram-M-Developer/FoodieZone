package admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class insert_food
 */
public class insert_food extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert_food() {
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
		String food=request.getParameter("food_name");		
		String price=request.getParameter("price");
		
		int price1=Integer.parseInt(price);
		
		System.out.println(food+price);
		
		
       insert_food_back ins=new insert_food_back();
		
		boolean ans=false;
		
		try {
			ans=ins.insert(hotel,food,price1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		if(ans) {
			response.sendRedirect("food_success.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}


		
		
	}

}
