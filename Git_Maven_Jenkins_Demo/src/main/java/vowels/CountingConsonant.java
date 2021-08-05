package vowels;

public class CountingConsonant {

	public static void main(String[] args) {
		System.out.println("* * * * * * Counting Consonant * * * * * *");
		String s = "My name is khan";
		String str = s.toLowerCase();
		String constt = "bcdfghjklmnprstuvwxyz";
		
		for (int i=0; i<constt.length(); i++) {
			int count = 0;
			for (int j=0; j<str.length(); j++) {
				
				if (constt.charAt(i)==str.charAt(j)) {
					count++;
				}
			}			
			if (count!=0) {
				System.out.println("'"+constt.charAt(i)+"' occurs "+count+" times");
			}
		}
	}

}
