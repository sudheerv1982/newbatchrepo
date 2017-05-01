import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
		array.add(0, "ajay");
		array.add(1, "kumar");
		array.add(2, "india");
		array.add(3, "usa");
		System.out.println("before removal"+ array);
		array.remove(2);
		array.remove("india");
		System.out.println(array);
		array.clear();
		System.out.println(array);
		
		
		
				
				
		
		
	}

}
