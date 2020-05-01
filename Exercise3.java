//uncomment next line if input required
import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

   	int num1 = 0;
   	System.out.print("Enter a number: ");
    num1 = input.nextInt();

    if(num1 > 20){
		System.out.println("Number entered is greater than my age.");
		}else if(num1 < 20){
			System.out.println("Number entered is less than my age.");
			}else{
				System.out.println("Number entered is equal to my age.");
				}
	System.out.println();
	Index.main(null);
   }
}