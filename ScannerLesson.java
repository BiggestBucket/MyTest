import java.util.*;
public class ScannerLesson {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);//Sets up a new Scanner Class
		// called a to look for input from the System or Keyboard
		System.out.println("What is the square root of? ");
		//asks the user a question for them to provide input
		double square = a.nextDouble();
		//Stores the value of the next double entered by the user in the 
		//console in the variable square
		double root = Math.sqrt(square);
		//Assigns the square root method running on square in the variable root
		System.out.println("The square root of " +square + " is " + root);
		//Displays the input of the user and the calculated square root 
		//in the console
		a.close();//closes your Scanner, it stops looking for input
		
	}

}
