package shoppingapp;

import java.sql.SQLException;
import java.util.Scanner;

public class Home {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Scanner s = new Scanner(System.in);
			int n;
			Connect c = new Connect();
			do {
			System.out.println("1)Admin login\n2)Agent login\n3)Exit");
			System.out.println("Enter the choice");
			n = s.nextInt();
			switch (n) {
			case 1: {
			Admin1 a = new Admin1();
			a.admin();
			}
			case 2: {
			Agent a1 = new Agent();
			//a1.agent();
			}
			case 3: {
			//Exit1 e = new Exit1();
			//e.exit();
			}
			}
			} while (n != 3);

			}

			}// TODO Auto-generated method stub

	


