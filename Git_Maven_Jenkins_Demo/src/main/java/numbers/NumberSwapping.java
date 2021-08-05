package numbers;

public class NumberSwapping {

	public static void main(String[] args) {
		System.out.println("Number swapping");
		
		int a = 10;
		int b = 20;
		
		System.out.println("Value of a :: "+a);
		System.out.println("Value of b :: "+b);
		
		int temp=0;		//temp is empty
		temp = a; 	// temp = 10
		a = b;		// a is empty/copy and a = b //20
		b = temp;	// b is empty/copy and b = temp //10
		
		System.out.println("Value of a :: "+a);
		System.out.println("Value of b :: "+b);		
	}
}
