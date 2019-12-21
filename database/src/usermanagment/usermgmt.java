package usermanagment;

import java.sql.SQLException;
import java.util.Scanner;

public class usermgmt {

	public static void main(String[] args) {
User us=new User();
us.choice();
ConnectionManagement c=new ConnectionManagement();
}
public void choice  ()throws ClassNotFoundException,SQLException {
Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("1) InsertUser");
System.out.println("2) InsertAdmin");
System.out.println("3)  Login");
        System.out.println("4) Exit");
        System.out.println("Enter the choice");
int c=s.nextInt();
switch(c)
{
case 1:
InsertUser insertobj=new InsertUser();
insertobj.insertData();
break;

case 2:
InsertAdmin insertobj1=new InsertAdmin();
insertobj1.insertData();
break;
case 3:
Loginlog login1=new Loginlog();
login1.loginData();
break;
case 4:
System.out.println("exit");
}
}
}// TODO Auto-generated method stub
