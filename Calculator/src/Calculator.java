
import java.util.Scanner;
public class Calculator {


	public static void main(String[] args) {
		int input1 = 0;
		int input2 = 0;
		
		System.out.println("Hello!");
	    System.out.println("Please type first number to the console:");
		Scanner reader = new Scanner(System.in);
		input1 = reader.nextInt();
		System.out.println("Please type second number to the console:");
		input2 = reader.nextInt();
		reader.close();
		
		writeText(input1, input2);
		add(input1, input2);
		subract(input1, input2);
		multiply(input1, input2);
		divide(input1, input2);
		
	}
	
	  public static void writeText(int input1, int input2) {
	        System.out.println("first number is " + input1 + " and second number is " + input2);
	    }

	  
	  public static void add(int input1, int input2) {
		  int result = 0;
		    result = input1 + input2;
		    System.out.println(input1 + " + " + input2 + " = " + result);
	    }
	  
	  public static void subract(int input1, int input2) {
		  int result = 0;
		    result = input1 - input2;
		    System.out.println(input1 + " - " + input2 + " = " + result);
	    }
	  
	  public static void multiply(int input1, int input2) {
		  int result = 0;
		    result = input1 * input2;
		    System.out.println(input1 + " * " + input2 + " = " + result);
	    }
	  
	  public static void divide(int input1, int input2) {
		  int result = 0;
		    result = input1 / input2;
		    System.out.println(input1 + " / " + input2 + " = " + result);
	    }
	  
}
