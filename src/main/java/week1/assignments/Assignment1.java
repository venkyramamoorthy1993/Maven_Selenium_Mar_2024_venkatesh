package week1.assignments;
import java.util.Scanner;

public class Assignment1 {

	public void evenOrOdd(int number) {
		for (int i = 1; i <= number; i++) {
			if(i%2==0){
				System.out.println(i+" is Even Number");
			}
			else if(i%2==1) {
				System.out.println(i+" is Odd Number");
			}
		}
	}

	public boolean isPrime(int n)
	{
		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public void palindromeString(String val2) {
		int n = val2.length();
		String rev = "";
		for (int i = n - 1; i >= 0; i--) {
			rev = rev + val2.charAt(i);
		}

		// Printing the reversed Number
		System.out.println("Reverse Number = " + rev);

		// Checking Palindrome
		if (val2.equals(rev))
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");
	}
	
	public void Fibonacci(int num) {
		 int num1 = 0, num2 = 1;
	        for (int i = 0; i < num; i++) {
	            // Print the number
	            System.out.print(num1 + " ");
	 
	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	        }
	        System.out.println();

	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int number = scan.nextInt();
		Assignment1 obj = new Assignment1();

		// even or odd number up to max number ( Method 1 : evenOrOdd ) 
		obj.evenOrOdd(number);

		
		System.out.println("ODD OR EVEN PROGRAM COMPLETED");
		
		
		// Prime or not prime number ( Method 2 : isPrime ) 
		boolean res = obj.isPrime(number);
		if (res == true) {
			System.out.println(number+" is a prime Number ");
		}
		else {
			System.out.println(number+" is a not a prime Number");
		}
		

		System.out.println("PRIMENUMBER PROGRAM COMPLETED");
		
		
		// Enter number to find Palindrome or not ( Method 3 : palindromeString ) 
		System.out.println("Enter the Number : ");
		int num = scan.nextInt();
		String convert = Integer.toString(num);
		obj.palindromeString(convert);

		scan = new Scanner(System.in);
		// Enter String to find Palindrome or not ( Method 3 : palindromeString ) 
		System.out.println("Enter the String : ");
		String val = scan.nextLine();
		obj.palindromeString(val);
		
		
		System.out.println("PALINDROME PROGRAM COMPLETED");
		
		// Fibonacci Series ( Method 4 : palindromeString ) 
		
		obj.Fibonacci(number); 
		
		System.out.println("FIBONACCI PROGRAM COMPLETED");

	}
}

