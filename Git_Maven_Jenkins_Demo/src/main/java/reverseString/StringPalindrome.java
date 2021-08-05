package reverseString;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("* * * * * * Palindrome * * * * * *");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = scan.nextLine();
		System.out.println("Given String :: "+str);
		String rev ="";
		
		for (int i = str.length()-1; i>=0 ; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("* * Given string is a palindrome * *");
		}else {
			System.out.println("! ! Given string is not a palindrome ! !");
		}
	}
}