package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class studentdetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.driver");
		Connection con=null;
		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
		if(con!=null)
		{
			System.out.printf("sucessfully");// TODO Auto-generated method stub
		}
		else
		{
			System.out.printf("Un sucessfully");
		}
		

	}

}
