import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add(5);
		array.add(9);
		System.out.println("before reverse:" + array);
		Collections.reverse(array);
		System.out.println("after reverse operation:" + array);
		

	}

}
