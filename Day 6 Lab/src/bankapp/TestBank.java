package bankapp;

import java.util.Scanner;

/*
 * Allow user 1. to choose only a single bank.
 *  Once user chooses the bank , another option : 2. withdraw funds
 * 3. Pay Bills 
 * 4 : Exit
 * 
 */

public class TestBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		Bank ref = null;
		
		while (!exit) {
			System.out.println("1. Create Account in BoB  2. Create Acount in HDFC 3. Withdraw 4. Pay Bills 5.Exit");
			System.out.print("Choose option from the above : ");
			
			switch (input.nextInt()) {
			
			case 1: 
				if (ref == null) {
					ref = new BankOfBaroda();
					System.out.println();
					System.out.println("Enter account No, Name, Mininum Balance :-");
					ref.createAccount(input.nextInt(), input.next(), input.nextDouble());
					System.out.println();
				} else
					System.out.println("You have already chosen a bank!!!!!!!!!!!");
					System.out.println();
				break;
			
			case 2:
				if (ref == null) {
					ref = (Bank) new HDFC();// up casting
					System.out.println();
					System.out.println("Enter account No, Name, Minimum Balance :-");
					ref.createAccount(input.nextInt(), input.next(), input.nextDouble());
					System.out.println();
				} 
				else
					System.out.println("You have already chosen a bank!");
					System.out.println();
				break;
				
			case 3:
				if (ref != null) {
				
					System.out.println("Enter account no and amount to withdraw.");
					ref.withdraw(input.nextInt(), input.nextDouble());
					System.out.println();
				}
				else
					System.out.println("You have not yet chosen a bank!");
					System.out.println();
				break;
				
			case 4:
				if (ref instanceof HDFC)
				{
					 ((HDFC)ref).payBills();
				}
				
				else if (ref instanceof BankOfBaroda)
				{
					System.out.println("You cannot pay bills");
					System.out.println();
				}				
				break;
				
			case 5:
				System.out.println();
				System.out.println("Thank You! visit again.");
				exit = true;

				break;
			default :
				System.out.println("Invalid Choice. Enter a valid Choice.");
				System.out.println();
			}
		}
		
		input.close();
		
	}
}