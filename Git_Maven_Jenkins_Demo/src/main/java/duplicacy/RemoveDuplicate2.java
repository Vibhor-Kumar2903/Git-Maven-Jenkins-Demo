package duplicacy;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		System.out.println("* * * * * * Removing Duplicate Characters * * * * * *");
		String str = "Hello";
		String temp = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (temp.indexOf(str.charAt(i))==-1) {
				temp = temp + str.charAt(i);
			}
		}
		
		System.out.println("Unique characters : "+temp);
	}

}
