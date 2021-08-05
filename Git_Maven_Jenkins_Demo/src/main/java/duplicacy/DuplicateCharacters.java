package duplicacy;

public class DuplicateCharacters {
	public static void main(String[] args) {
		System.out.println("* * * * * * Printing and Counting Duplicate Characters * * * * * *");
		//String str = "Java is very easy language";
		String str = "Hello";
		for (int i=0; i<str.length(); i++) {
			int count = 0;
			
			for (int j=0; j<str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
				if (str.charAt(i) == str.charAt(j) && (i>j)) {
					break;
				}
			}
			if (count>1) {
				System.out.println("'"+str.charAt(i)+"' occur "+count+" times.");				
			}
		}
	} 
}
