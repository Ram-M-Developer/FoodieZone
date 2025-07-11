package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginback {
	static boolean ans=false;
	
	public static boolean log(String username, String password) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
	 Statement state=connect.createStatement();
     state.execute("use fooddelivery");
    
    String check="select * from login where username= '"+username+"' and password= '"+password+"'";

    ResultSet result=state.executeQuery(check);
    
    if(result.next()) {
    	ans=true;
    }
    else {
    	ans=false;
    }
    
	return ans;
    

	}
}
