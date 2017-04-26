/**
 * 
 */

/**
 * @author ajayk
 *
 */

public class StringComparision {
	
	public static void main (String args[]){
		
	String S1 = "Come on India";
	String S2 = "Go India";
	String S3 = "Come on India";
	String S4 = new String("Go India");
	String S5 = new String("Come on India");
	System.out.println(S1.equals(S2));//   by using equals() method
	System.out.println(S1.equals(S3));//   by using equals() method
	System.out.println(S2.equals(S4));//   by using equals() method
	System.out.println(S1.equals(S5));
	System.out.println(S1==S2);	
	System.out.println(S2==S4);
	System.out.println(S1==S3);// when using == with objects it reference hash code address assigned
	System.out.println(System.identityHashCode(S1));
	System.out.println(System.identityHashCode(S2));
	System.out.println(System.identityHashCode(S3));
	System.out.println(System.identityHashCode(S4));
	System.out.println(System.identityHashCode(S5));
	
	
	}

}
