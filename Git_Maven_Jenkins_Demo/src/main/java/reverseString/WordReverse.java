package reverseString;

public class WordReverse {
	public static void main(String[] args) {
		System.out.println("* * * * * * * * Word Reverse * * * * * * * *");

		String str = "Java is very easy lanuage";
		String rev = "";
		
		String[] word = str.split(" ");
		
		for (int i = 0; i < word.length; i++) {
			String s = word[i];
			
			for (int j = s.length()-1; j>=0 ; j--) {
				rev = rev + s.charAt(j);
			}			
			rev = rev + " ";
		}		
		System.out.println("Reverse : "+rev);	
	}
}
