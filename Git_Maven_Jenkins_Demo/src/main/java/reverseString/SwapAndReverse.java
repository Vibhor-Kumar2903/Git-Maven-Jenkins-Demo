package reverseString;

public class SwapAndReverse {

	public static void main(String[] args) {
		System.out.println("* * * * * * * *  Swap And Reverse * * * * * * * *");

		String str = "Java is very easy lanuage";
		String rev = "";
		
		String[] word = str.split(" ");
		
		String temp = word[0];
		word[0] = word[word.length-1];
		word[word.length-1] = temp; 
		
		for (int i = 0; i < word.length; i++) {
			String s = word[i];
			
			if (i==0 || i==word.length-1) {
				for (int j = s.length()-1; j>=0 ; j--) {
					rev = rev + s.charAt(j);
				}				
			}
			else {
				rev = rev + word[i];
			}
			rev = rev + " ";
		}		
		System.out.println("Reverse : "+rev);
	}
}