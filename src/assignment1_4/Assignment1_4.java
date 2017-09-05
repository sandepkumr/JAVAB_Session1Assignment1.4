/**
 * 
 */
package assignment1_4;
import java.util.Scanner;
/**
 * 
 * This class will cast and add two smaller data types into a larger data type 
 *
 */
public class Assignment1_4 {


	public static void main(String[] args) {// main method starts
		
		byte byteNumber; 	// Declaring byte variable 
		short shortNumber;	// Declaring short variable
		int integerNumber;		// Declaring integer variable
		long longNumber;		// Declaring long variable
		float floatNumber;	// Declaring float variable
		double doubleNumber;	// Declaring double variable
		
		Scanner sc = new Scanner(System.in); // Creating scanner object to take input
		
		System.out.println("Enter the value for byte variable :");
		byteNumber=sc.nextByte(); // Assigning user input to Byte variable
		
		System.out.println("Enter the value for short variable :");
		shortNumber=sc.nextShort(); // Assigning user input to Short Variable
		
		integerNumber=byteNumber+shortNumber; // Storing addition of short and byte to Integer. Auto type casting 
		System.out.println("Sum of "+byteNumber+" (byte) and "+shortNumber+" (short) is : "+integerNumber+" (integer)");// Printing the Integer result
		
		longNumber=shortNumber+integerNumber; // Storing addition of short and integer to long. Auto type casting
		System.out.println("Sum of "+shortNumber+" (short) and "+integerNumber+" (integer) is : "+longNumber+" (long)");// Printing the long result
		
		floatNumber=integerNumber+longNumber; // Storing addition of integer and long to float. Auto type casting
		System.out.println("Sum of "+integerNumber+" (integer) and "+longNumber+" (long) is : "+floatNumber+" (float)");// Printing the float result
		
		doubleNumber=longNumber+floatNumber; // Storing addition of float and long to double. Auto type casting
		System.out.println("Sum of "+longNumber+" (long) and "+floatNumber+" (float) is : "+doubleNumber+" (double)");// Printing the double result
		
		sc.close();

	}

}//class closed
