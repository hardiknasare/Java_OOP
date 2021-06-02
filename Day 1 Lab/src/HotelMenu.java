/*
3. Display food menu to user. User will select items from menu along with the quantity. 
(eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed prices to food items
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/


import java.util.Scanner;

public class HotelMenu{
	
	public static void main(String[] args)
	{	
		int Masala_Dosa = 50, Pav_Bhaji = 60, Pasta = 40, Tea = 10, Samosa = 25, Bhel = 20, Lassi = 20, Badamshake = 25, Fruit_Salad = 25, Pineapple_Juice = 25;
		int total=0,quantity=0,choice;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Order from the list.");
		System.out.println("0.Exit 1.Masala Dosa 2.Pav Bhaji 3.Pasta 4.Tea 5.Samosa 6.Bhel 7.Lassi 8.Badamshake 9.Fruit Salad 10.Pineapple Juice");
		
		do{
			System.out.print("Enter your choice : ");
			choice=input.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println();
					System.out.print("Please enter quantity for Masala Dosa (Rs.50): ");
					quantity=input.nextInt();
					total+=(Masala_Dosa*quantity);
					break;

				case 2:
					System.out.println();
					System.out.print("Please enter quantity for Pav Bhaji (Rs.60): ");
					quantity=input.nextInt();
					total+=(Pav_Bhaji*quantity);
					break;

				case 3:
					System.out.println();
					System.out.print("Please enter quantity for Pasta (Rs. 40) : ");
					quantity=input.nextInt();
					total+=(Pasta*quantity);
					break;

				case 4:
					System.out.println();
					System.out.print("Please enter quantity for Tea(Rs. 10) : ");
					quantity=input.nextInt();
					total+=(Tea*quantity);
					break;

				case 5:
					System.out.println();
					System.out.print("Please enter quantity for Samosa (Rs. 25) : ");
					quantity=input.nextInt();
					total+=(Samosa*quantity);
					break;

				case 6:
					System.out.println();
					System.out.print("Please enter quantity for Bhel (Rs. 20) : ");
					quantity=input.nextInt();
					total+=(Bhel*quantity);
					break;

				case 7:
					System.out.println();
					System.out.print("Please enter quantity for Lassi (Rs. 20) : ");
					quantity=input.nextInt();
					total+=(Lassi*quantity);

					break;

				case 8:
					System.out.println();
					System.out.print("Please enter quantity for Badam Shake (Rs. 25) : ");
					quantity=input.nextInt();
					total+=(Badamshake*quantity);
					break;

				case 9:
					System.out.println();
					System.out.print("Please enter quantity for Fruit Salad (Rs. 25) : ");
					quantity=input.nextInt();
					total+=(Fruit_Salad*quantity);
					break;
					
				case 10:
					System.out.println();
					System.out.print("Please enter quantity for Pineapple (Rs. 25) : ");
					quantity=input.nextInt();
					total+=(Pineapple_Juice*quantity);
					break;

				default:
					System.out.println();
					System.out.println("Invalid input. Please try again.");
					break;
					
				case 0:
					System.out.println();
					System.out.println("Total bill : "+total);
					System.out.println("Thank you for using our program. Hope to see you seen");					
			}
		}while( choice != 0);
		input.close();
	}	
}