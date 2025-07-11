package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class food_list_back {
public ResultSet list(String hotel_name) throws SQLException, ClassNotFoundException {
		
		
		Connection connect=getconnection.connection();
		
		Statement state=connect.createStatement();
		
		String query1="select * from "+hotel_name+";";
		System.out.println(query1);
		
		ResultSet rs=state.executeQuery(query1);
		
		
		return rs;
	}
}
