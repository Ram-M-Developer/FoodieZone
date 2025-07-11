package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getconnection {
	
	public static Connection connection() throws ClassNotFoundException, SQLException {
		Connection connection=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		return connection;

	}

}
