//uncomment next line if input required
import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int counter = 1;
    int num1 = 0;
		System.out.print("Enter a number from 1 to 10: ");
       	num1 = input.nextInt();
   while (num1 < 0 || num1 > 10){
		System.out.println("Invalid number entered. Please try again.");
		System.out.println("");
	   	System.out.print("Enter a number from 1 to 10: ");
       	num1 = input.nextInt();
	   }
	while (counter <= num1){
			   System.out.println(counter+" .Enming");
			   counter++;
		   }
	   System.out.println();

	Index.main(null);
   }
}