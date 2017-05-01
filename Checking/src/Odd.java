import java.util.*;
public class Odd {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the value of a");
		a = console.nextInt();
		for(int i = 0;i<=a;i++)
		{
			if(i%2!=0)
			System.out.println("The odd Numbers are:" +i);
		}
	}

}
