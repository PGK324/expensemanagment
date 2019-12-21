package shoppingapp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Admin1 {

	public void admin() throws ClassNotFoundException, SQLException {
		Connect c=new Connect();
		Scanner s=new Scanner(System.in);
		int f=0,n,id,qua,price;
		String name;
		System.out.println("enter the user name");
		String user=s.next();
		System.out.println("enter the password");
		String pass=s.next();
		Statement st1=c.getConnection().createStatement();
		ResultSet r=st1.executeQuery("select * from admin_login");
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
		switch(n)
		{
		case 1:
		{
		System.out.println("enter the product id");
		id=s.nextInt();
		System.out.println("enter the product name");
		name=s.next();
		System.out.println("enter the minsellquantity:");
		qua=s.nextInt();
		System.out.println("enter the product price");
		price=s.nextInt();
		PreparedStatement st=c.getConnection().prepareStatement("INSERT INTO `addproduct`"
		+ "(`product_id`, `product_name`, `min_sell_qty`, `price`) VALUES (?,?,?,?);");
		st.setInt(1,id);
		st.setString(2,name);
		st.setInt(3,qua);
		st.setInt(4, price);
		st.executeUpdate();
		break;
		}
		case 2:
		{
		Statement st2=c.getConnection().createStatement();
		ResultSet r1=st2.executeQuery("select * from addproduct");
		System.out.println();
		while(r1.next())
		{
		System.out.println(r1.getString(1)+" \n"+r1.getString(2)+" \n"+r1.getString(3)+"\n"+r1.getString(4));
		}
		break;
		}
		case 3:
		{
		System.out.println("enter the id to be deleted");
		int q=s.nextInt();
		PreparedStatement ste=(PreparedStatement)c.getConnection().prepareStatement("DELETE FROM `addproduct` WHERE id=?");
		ste.setInt(1,q);
		ste.executeUpdate();
		System.out.println("product removed");
		break;

		}
		case 4:{

		}

		}

		}while(n!=5);
		}
		}
