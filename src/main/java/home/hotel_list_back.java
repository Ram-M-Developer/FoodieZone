package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class hotel_list_back {

	public ResultSet list(String hotel_name) throws SQLException, ClassNotFoundException {
		
		
		Connection connect=getconnection.connection();
		
		Statement state=connect.createStatement();
		
		String query="select * from hotel_list ";
		
		PreparedStatement pst=null;
		ResultSet rs=null;
		if(hotel_name!=null) {
			query += "where hotelname = ? ";
			pst=connect.prepareStatement(query);
			pst.setString(1, hotel_name);
			rs=pst.executeQuery();
		}
		else {
			pst=connect.prepareStatement(query);
			rs=state.executeQuery(query);
		}
		
		
		return rs;
	}
	
	
	
}
