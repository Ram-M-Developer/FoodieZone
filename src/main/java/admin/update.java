package admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
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
		
		String HotelName=request.getParameter("hotel_name");
		String FoodName=request.getParameter("food_name");
		String new_price=request.getParameter("new_price");
		
		int NewPrice=Integer.parseInt(new_price);
		
        update_back ho=new update_back();
		
		boolean ans=false;
		
		System.out.println("Update :"+HotelName+FoodName+NewPrice);
		
		try {
			ans=ho.update(HotelName,FoodName,NewPrice);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		if(ans) {
			response.sendRedirect("update.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}


				
	}

}
