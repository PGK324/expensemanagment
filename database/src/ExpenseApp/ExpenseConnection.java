package ExpenseApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExpenseConnection {
	public Connection getConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.driver");
		Connection con=null;
		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ExpenseApp","root","");
		if(con!=null)
		{
			return con;// TODO Auto-generated method stub
		}
		else
		{
			return null;
		}
	}
			
			
			
			
			
			

}
