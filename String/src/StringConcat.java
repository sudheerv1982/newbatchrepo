
public class StringConcat {

	public static void main(String[] args) {
		String s1 = "Welcome";
		s1 = s1.concat("to");
		s1 = s1.concat("java programming");
		System.out.println(s1);
		String s2 = new String("PHP Exercises and");
		String s3 = new String("Python Exercises");
		System.out.println("String s2:" +s2);
		System.out.println("String s3:" +s3);
		String s4 = new String(s2.concat(s3));
		System.out.println("The Concatnated string is:" +s4);

	}

}
