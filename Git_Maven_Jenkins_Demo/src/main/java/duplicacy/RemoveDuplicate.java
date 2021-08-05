package duplicacy;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println("* * * * * * Removing Duplicate Characters * * * * * *");
		String str = "Hello";
		char[] ch = str.toCharArray();
			
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		//lhs.add(ch[0]);
		for (int i = 0; i < ch.length; i++) {
			lhs.add(ch[i]);			
		}
		
		for (Character charr : lhs) {
			System.out.print(charr+" ");
		}		
	}
}