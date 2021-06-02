/* 
2. Accept 2 double values from User (using Scanner). Check data type.
   If arguments are not doubles , supply suitable error message & terminate.
   If numbers are double values , print its average. 
*/

import java.util.Scanner;
public class DoubleAverage {

    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        double num1,num2;
        double avg;
        
        //Take input numbers from user
        System.out.print("Enter the First Number of type Double: ");
        
		//using hasNextType() method to Identify if the next input by scanner is of the type defined 
        if(input.hasNextDouble())
        {
            num1=input.nextDouble();
            System.out.print("Enter the Second Number of type Double: ");
            if(input.hasNextDouble())
            {
                num2=input.nextDouble();
                //average calculation
                avg = (num1+num2)/2;
                //result display
                System.out.println("The Average of two double type numbers is :"+avg);
            }
            else
            {
                System.out.println("Error in Datatype. Arguments is not Double");
            }
        }
        else
        {
            System.out.println("Error in Datatype. Arguments is not Double");
        }
  
        input.close();         
    }   
}
