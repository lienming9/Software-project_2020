//uncomment next line if input required
import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int num1 = 0;
    System.out.print("Enter first number: ");
    num1 = input.nextInt();
    int num2 = 0;
    System.out.print("Enter second number: ");
    num2 = input.nextInt();
    System.out.println("");

    System.out.println(num1+" + "+num2+" = "+(num1+num2));
    System.out.println(num1+" - "+num2+" = "+(num1-num2));
    System.out.println(num1+" * "+num2+" = "+(num1*num2));
	System.out.println();
	Index.main(null);
   }
}