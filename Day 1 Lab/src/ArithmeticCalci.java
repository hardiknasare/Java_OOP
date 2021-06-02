/*
Accept  i/ps from User , till user enters "quit" or any other option.
I/P : operation(add|sub|mult|div) , number1(double) , number2(double) 
Display the result of the operation.
It should be done in a loop , till user enters "quit" 
*/


import java.util.Scanner;



public class ArithmeticCalci

{

	public static void main(String[] args)
	{	
		Scanner input =new Scanner(System.in);
		double num1=0,num2=0;       //Declaration
	 	int choice;
		
		System.out.print("\nPlease enter first number : ");
		num1=input.nextDouble();
		System.out.print("Please enter second number : ");      //AcceptNum
		num2=input.nextDouble();
		
		System.out.println("0. Exit 1. Add  2. Subtract 3. Multiply 4. Division ");
		
		do
		{
			System.out.print("Enter the choice : ");
			choice=input.nextInt();

			switch(choice)

			{
				case 1: 				
					System.out.println();
					System.out.println("Addition : "+(num1+num2));
					break;

				case 2:
					System.out.println();				
					System.out.println("Subtraction : "+(num1-num2));
					break;

				case 3:
					System.out.println();
					System.out.println("Multiplication : "+(num1*num2));
					break;

				case 4:
					System.out.println();
					System.out.println("Division : "+(num1/num2));
					break;
																// choices and Operation
				case 0: 
					System.out.println();
					System.out.println("Thank you !");
					break;
				default : 
					System.out.println();
					System.out.println("Invalid choice. Please enter the correct choice.");
				
			}

		}while( choice != 0 );

	}

}