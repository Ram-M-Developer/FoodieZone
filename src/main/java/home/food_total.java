package home;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class food_total
 */
public class food_total extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public food_total() {
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
		
		String hotel_name=request.getParameter("hotel_name");
		String food_name=request.getParameter("food_name");
		String quantity=request.getParameter("quantity");
		String price=request.getParameter("price");
		
		
		System.out.println(price+quantity+food_name+hotel_name);
		
		System.out.println("Quantity is:"+quantity);
		
		int prices=Integer.parseInt(price);
		int quantitys=Integer.parseInt(quantity);
		
		total tt=new total();
		
		int total=tt.tot(quantitys,prices);
		
		System.out.println("total is:"+total);
		
		if(total!=0) {
			request.setAttribute("total", total);
			request.setAttribute("hotel_name", hotel_name);
			request.setAttribute("quantity", quantity);
			request.setAttribute("food_name", food_name);
			request.setAttribute("price", price);
		}
		
		if(true) {
			RequestDispatcher dispatch=request.getRequestDispatcher("payment.jsp");
			dispatch.forward(request, response);
		}
		
		
		
		
		
		
		
		
	}

}
