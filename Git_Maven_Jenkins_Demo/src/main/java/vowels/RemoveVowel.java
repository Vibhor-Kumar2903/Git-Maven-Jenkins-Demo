package vowels;

public class RemoveVowel {

	public static void main(String[] args) {
		System.out.println("* * * * * * Counting Vowels * * * * * *");
		String s = "My name is khan";
		String str = s.toLowerCase();
		
		String desire = str.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "")
							.replaceAll("o", "").replaceAll("u", "");		
		
		System.out.println("After removing Vowel : "+desire);
	}
}