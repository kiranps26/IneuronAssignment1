package assignment;

public class SwapNo {

	public static void main(String[] args) {
		
		int a =10, b = 20, temp;
		
		System.out.println("Before swapping the two numbers :" +a+ " " +b);
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping the two numbers :"+a+ " " +b);
		System.out.println("A = "+a);
		System.out.println("B = "+b);

	}

}
