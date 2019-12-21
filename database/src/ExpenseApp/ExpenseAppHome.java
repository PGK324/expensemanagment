package ExpenseApp;

import java.util.Scanner;

public class ExpenseAppHome {
	public static void main(String[]args) {
		ExpenseAppHome obj = new ExpenseAppHome();
		obj.Home();
	}

	public void Home() {
		Scanner s=new Scanner(System.in);
		ExpenseConnection ec=new ExpenseConnection();
		do
		{
			System.out.println("welcome");
			System.out.println("1)Admin \n2)User \n3)Exit");
			System.out.println("choose the option");
			int op = s.nextInt();
			switch(op)
			{
			case 1:
			{
			ExpenseAdmin exad=new ExpenseAdmin();
			exad.admin();
			}
			
			case 2:
			{
			ExpenseUser exus=new ExpenseUser();
			exus.agent();
			}
			
			case 3:
			{
			ExpenseExit exex=new ExpenseExit();
			exex.exit();
			}
			
		}
			while(op!=3);
				
		// TODO Auto-generated method stub
		
	}

}
}
