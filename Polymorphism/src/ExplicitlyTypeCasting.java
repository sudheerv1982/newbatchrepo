
public class ExplicitlyTypeCasting {
	//The concept of representing one premative data type to another pd by JVM according to the programmer spcification.
	//(bigger data type value to small data type value)

	public static void main(String[] args) {
		long l =1000;
		System.out.println(l);
		int i = (int)l;
		System.out.println(i);
		double d = 100.23;
		System.out.println(d);
		int j = (int)d;
		System.out.println(j);
		

	}

}
