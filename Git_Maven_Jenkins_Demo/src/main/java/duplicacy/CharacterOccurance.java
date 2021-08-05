package duplicacy;

public class CharacterOccurance {
	public static void main(String[] args) {
		System.out.println("******** Character Ocurrance ********");
		String str = "Java is very easy lanuage";
		
		int[] count = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			count[(int) str.charAt(i)]++;
		}
		
		for (int i = 0; i < 256; i++) {
			if(count[i]!=0) {
				System.out.println("'"+(char)i+"' ocurr '"+count[i]+"' times.");
			}
		}		
	}
}