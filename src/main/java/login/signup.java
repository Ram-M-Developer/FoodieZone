package login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class signup
 */
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
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
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String vpass=request.getParameter("vpass");
		
		
	       int pass1=Integer.parseInt(pass);
	       int vpass1=Integer.parseInt(vpass);
	       
		System.out.println(name+email+phone+uname+pass1+vpass1);
		
		signupback sign=new signupback();
		
		boolean send=false;
		
		try {
	        try {
	        	send=sign.signup(name,email,uname,pass1,vpass1,phone);
	        }
	        catch(ClassNotFoundException e){
	        	e.printStackTrace();
	        }
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		String send1[]=new String[2];
		String vaultid=null;
		String password=null;
		
		
		try {
	        try {
	        	send1=signupback.send();
	        }catch(ClassNotFoundException e){
	        	e.printStackTrace();
	        }
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		//set the value of vault id and password
		
		vaultid = send1[0];
		password = send1[1];
		
		System.out.println("Vault id and pass :"+vaultid+" "+password);
		
		if(vaultid!=null && password!=null) {
			request.setAttribute("vaultid", vaultid);
			request.setAttribute("password", password);
		}
		
		if(send) {
			RequestDispatcher dispatch=request.getRequestDispatcher("vaultpass.jsp");
			dispatch.forward(request, response);
		}
	
		
	}

}
