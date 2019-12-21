package shoppingapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;//Connection object
		//Create connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root"," ");

		if(con!=null)//Connection checking
		{
		return con;
		}
		else
		{
		return null;
		}
}
}
