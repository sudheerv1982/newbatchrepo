
public class Format {

	public static void main(String[] args) {
	String name = "Hello World";
	String s1 = String.format("name %s",name);
	String s2 = String.format("value %d",32);
	String s3 = String.format("value %f", 35.00);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);

	}

}
