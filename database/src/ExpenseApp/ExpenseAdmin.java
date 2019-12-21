package ExpenseApp;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExpenseAdmin {

	public void admin() throws ClassNotFoundException,SQLException {
		Scanner s=new Scanner(System.in);
		ExpenseConnection ec=new ExpenseConnection();
		int f=0,n,id,qua,price,qw,quan;
				String name;
		System.out.println("enter the user name");
		String user=s.next();
		System.out.println("enter the password");
		String pass=s.next();
		Statement st1=ec.getConnection().createStatement();
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
			System.out.println("Welcome Admin");
			System.out.println("enter the Id");
			id=s.nextInt();
			System.out.println("enter the category");
			String cat = s.next();
			PreparedStatement st=ec.getConnection().prepareStatement("INSERT INTO `option`"+"(`ID`,`productname`,`quality`,`price`)VALUES(?,?);");
			st.setInt(1,id);
			st.setString(2,cat);
			st.executeUpdate();
			break;
		}
		
		
		case 2:
		{
			System.out.println("~~~~~~list of product~~~~~~\n");
			Statement st2=ec.getConnection().createStatement();
			ResultSet r1=st2.executeQuery("select* from `options`");
			while(r1.next())
			{
				System.out.println("#########$$$$$##########");
				System.out.println("Id :"+ r1.getString(1)+ " \nCategory :" + r1.getString(2));
				
			}
		}
			break;
			
		case 3:
		{
			System.out.println("enter the id to be removed");
			int q=s.nextInt();
			PreparedStatement ste=(PreparedStatement)ec.getConnection().prepareStatement("DELETE FROM `options` WHERE id=?");
			ste.setInt(1,q);
			ste.executeUpdate();
			System.out.println("category removed");
			break;
		}
		
		case 4:
		{
			System.out.println("~~~~~~list of product~~~~~~\n");
			Statement st2=ec.getConnection().createStatement();
			ResultSet r1=st2.executeQuery("select* from `options`");
			while(r1.next())
			{
				System.out.println("#########$$$$$##########");
				System.out.println("Id :"+ r1.getString(1)+ " \nCategory :" + r1.getString(2));
					System.out.println();
			}
			System.out.println("enter the id to be updated");
			id=s.nextInt();
			System.out.println("enter the category to be updated");
			String cat1=s.next();
			
			PreparedStatement st=ec.getConnection().prepareStatement("UPDATE `options` SET"+"`NAME`=? WHERE id=?;");
			st.setString(1,cat1);
			st.setInt(2,id);
			st.executeUpdate();
			System.out.println("sucessfully updated");
			break;
			
			}
		}
		}while(n!=3);
		}
	}
