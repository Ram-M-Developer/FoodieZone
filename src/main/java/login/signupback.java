package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class signupback {
	
	boolean send=false;
	static int loginid=0;
	static String logid=null;
	static String email=null;

	public boolean signup(String name,String email,String uname, int pass1,int vpass1,String phone) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection connect1=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
    Statement state1=connect1.createStatement(); 
	state1.execute("use fooddelivery");
	
       this.email=email;
       
       String query= "select * from login where email = ?";
       PreparedStatement pst=connect1.prepareStatement(query);
       pst.setString(1, email);
       ResultSet rst=pst.executeQuery();
       
       int rows1=0;
       int rows2=0;
       
       loginid=1000 + (int)(Math.random() * 9000);
       logid="US"+loginid;
       

       
       if(!rst.next()) {
    	   
    	   String query1="insert into login(name,email,phone_number,username,password) values(?,?,?,?,?)";
    	   PreparedStatement pst1=connect1.prepareStatement(query1);
    	   pst1.setString(1, name);
    	   pst1.setString(2, email);
    	   pst1.setString(3, phone);
		   pst1.setString(4, uname);
    	   pst1.setInt(5, pass1);
    	   
    	   rows1=pst1.executeUpdate();
    	   
    	   String query2="insert into vault(email,vaultid,password) values(?,?,?)";
    	   PreparedStatement pst2=connect1.prepareStatement(query2);
    	   pst2.setString(1, email);
    	   pst2.setString(2, logid);
    	   pst2.setInt(3, vpass1);
    	   
    	   rows2=pst2.executeUpdate();
    	   
    	   
    	   System.out.println("Data inserted successfully...");
       }
       else {
    	   System.out.println("Data already exist!!");
       }
       
       if(rows1>0 && rows2>0)
    	   send=true;
    	   
       else
    	   send=false;
    	   
       return send;
 
       }
	
	
	   public static String[] send() throws ClassNotFoundException, SQLException{
		   
		   Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		   String query="select vaultid,password from vault where email = ? ";
		   PreparedStatement pst=connect.prepareStatement(query);
		   pst.setString(1, email);
		   
		   ResultSet rst=pst.executeQuery();
		   
		   String send[]=new String[2];
		   
		   if(rst.next()) {
			   send[0]=rst.getString("vaultid");
			   send[1]=rst.getString("password");
		   }
		   return send;
		   
       
       
    	
	}
	
}

