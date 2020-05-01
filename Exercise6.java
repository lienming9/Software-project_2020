//uncomment next line if input required
import java.util.Scanner;

public class Exercise6{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
   	String symbol = "";
   	System.out.print("Enter a symbol(e.g. +,&,* etc): ");
   	symbol = input.next();
   	int x = 0;
   	System.out.print("Enter number of rows: ");
   	x = input.nextInt();
   	int y =0;
   	System.out.print("Enter number of columns: ");
   	y = input.nextInt();
	int rows = 1;
	int columns = 1;
   	while(rows <= x){
		while(columns <= y){
			System.out.print(symbol+" ");
			columns++;
			}
			System.out.println();
			columns = 1;
			rows++;
		}
	System.out.println();
	Index.main(null);
   }
}