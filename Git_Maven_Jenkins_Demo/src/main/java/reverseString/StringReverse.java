package reverseString;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println("******* String Reverse ********");
		
		String str = "Java is very easy lanuage";
		String rev = "";
		
		for (int i = str.length()-1; i>=0 ; i--) {
			rev = rev + str.charAt(i);
		}		
		System.out.println("Reverse : "+rev);
	}
}