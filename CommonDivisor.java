import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		// TODO: add code to read two integers from the user and print their GCD
		
		// Opening a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nThe Euclidean Algorithm\n");
		
		// Main Program Loop
		do {
			// Prompting the user to enter an integer and storing it within the variable num1.
			System.out.print("\nEnter the first integer: ");
            int num1 = scanner.nextInt();

            // Prompting the user to enter a second integer and storing it within the variable num2.
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            
            // Calculating the GCD of num1 and num2 as well as printing the result.
            int gcd = calculateGCD(num1, num2);
            System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
            
            // Prompting the user if they would like to enter a third integer.
            System.out.print("\nWould you like to include a third integer? (Y/N): ");
            // If the user enters "Y" then the program will continue into the next prompt.
            if (scanner.next().equalsIgnoreCase("Y")) {
            	// Prompting the user to enter a third integer and storing it within the variable num3.
                System.out.print("Enter the third integer: ");
                int num3 = scanner.nextInt();
                // Calculating the GCD of num1, num2, and num3 as well as printing the result.
                gcd = calculateGCD(gcd, num3);
                System.out.println("The greatest common divisor for " + num1 + ", " + num2 + ", and " + num3 + " is " + gcd);
            }

            // Prompting the user if they would like to find the GCD of another set of integers.
            System.out.print("\nWould you like to find the GCD for another set of numbers? (Y/N): ");
			
        // If the user enters anything other than "Y" then the program will exit.
		} while (scanner.next().equalsIgnoreCase("Y"));
		
		// Closing the scanner.
		scanner.close();
	}

	// TODO: add code to compute the GCD of num1 and num2; use of Debugger to assert your variable states is required
	public static int calculateGCD(int num1, int num2) {
		// Euclidean Algorithm
		do {
			// Creating a temporary variable named temp to store num2's current value.
			int temp = num2;
			// Setting num2 to the remainder of num1 divided by num2.
			num2 = num1 % num2;
			// Setting num1 equal to the value of temp.
			num1 = temp;
		// Looping until num2 is equal to 0.
		} while (num2 != 0);
		
		// Returning num1 as the GCD.
		return num1;
	}
	
	// TODO: enhance for GCD on 3 numbers
	public static int calculateGCD(int num1, int num2, int num3) {
		// Overloading calculateGCD to accept 3 integer values.
		return calculateGCD(calculateGCD(num1, num2), num3);
	}
}
