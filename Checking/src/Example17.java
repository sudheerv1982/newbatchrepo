import java.util.*;
public class Example17 {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int age;
		double weight;
		System.out.println("Enter first name");
		System.out.println("Enter Age");
		System.out.println("Enter Weight");
		String name = console.next();
		age = console.nextInt();
		weight = console.nextDouble();
		System.out.println("Name:" +name);
		System.out.println("age:" +age);
		System.out.println("weight:" +weight);

	}

}
