package vowels;

public class CountingVowels {

	public static void main(String[] args) {
		System.out.println("* * * * * * Counting Vowels * * * * * *");
		String s = "My name is khan";
		String str = s.toLowerCase();
		//System.out.println("str : "+str);
		String vowel = "aeiou";
		
		for (int i=0; i<vowel.length(); i++) {
			int count = 0;
			for (int j=0; j<str.length(); j++) {
				
				if (vowel.charAt(i)==str.charAt(j)) {
					count++;
				}
			}			
			if (count!=0) {
				System.out.println("'"+vowel.charAt(i)+"' occurs "+count+" times");
			}
		}		
	}
}