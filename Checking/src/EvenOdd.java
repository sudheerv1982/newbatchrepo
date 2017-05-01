import java.util.*;
public class EvenOdd {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Number");
		num = console.nextInt();
		System.out.println("number:" +num);
		if(num % 2 == 0)
			System.out.println("The given no is even");
		else
			System.out.println("The given no is odd");

	}

}
