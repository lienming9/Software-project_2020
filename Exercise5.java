//uncomment next line if input required
import java.util.Scanner;

public class Exercise5{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

   int[] x = {20, 30, 40, 50};
   int sum = 0;
   int product = 0;
   double aver = 0;
   for(int i = 0; i < x.length; i++){
	   sum = x[0]+x[1]+x[2]+x[3];
	   product = x[0]*x[1]*x[2]*x[3];
	   aver = sum/4;
	   }
	   System.out.println("Sum of array values is: "+sum);
	   System.out.println("product of array values is: "+product);
	   System.out.println("average of array values is: "+aver);
		System.out.println();
	   Index.main(null);
   }
}