package shoppingapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Agent {


	public void Agent() throws ClassNotFoundException, SQLException {
		Connect c=new Connect();
		Scanner s=new Scanner(System.in);
		int f=0,n,id,qua,price;
		String name;
		System.out.println("enter the user name");
		String user=s.next();
		System.out.println("enter the password");
		String pass=s.next();
		Statement st1=c.getConnection().createStatement();
		ResultSet r=st1.executeQuery("select * from ajent_login");
		while(r.next())
		{
		String a=r.getString(1);
		String b=r.getString(2);
		if(a.contentEquals(user)&&b.contentEquals(pass))
		{
		f=1;
		break;
		}
		}
		if(f==1) {
		System.out.println("successfully verified");
		}
		else
		{
		System.out.println("data is invalid");
		}
		do {
		System.out.println("1)Add product\n2)Display\n3)Remove\n4)Update product\n5)Exit");
		System.out.println("enter the choice");
		n=s.nextInt();
		int co;
		switch(n)
		{
		case 1:
			System.out.println("enter the id");
			id=s.nextInt();
			System.out.println("enter the quantity");
			qua=s.nextInt();
			int z,sub=0;
			Statement st2=c.getConnection().createStatement();
			ResultSet r1=st2.executeQuery("select * from addproduct");
			while(r1.next())
			{
				int x = r1.getInt(1);
				r1.getString(2);
				z=r1.getInt(3);
				int y = r1.getInt(4);
				if(x==id) {
					co =y *qua;
					sub =z - qua;
				}
			}
			System.out.println("enter 1 to comfirm booking");
			int cb=s.nextInt();
			if(cb==1) {
				System.out.println("cost is:"+ co);
				
				PreparedStatement st=(PreparedStatement) c.getConnection()
						.prepareStatement("UPDATE `addproduct` SET `quantity`=? WHERE id=?");
				st.setInt(1,sub);
				st.setInt(2,id);
				st.executeUpdate();
				System.out.println("Thank you for purchasing");
			}
			break;
		
		case 2:{
			
			System.out.println("~~~~list of product~~~~~");
					Statement st2=c.getConnection().createStatement();
					ResultSet r1=st2.executeQuery("select * from addproduct");
					System.out.println();
					while(r1.next()) {
						
						System.out.println("######$$$$$######");
						System.out.println();
						System.out.println("product id:"+r1.getString(1)+;);
					
				
			}
				}
				
				
		}}
			
		}

}
