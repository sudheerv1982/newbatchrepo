import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {2,6,5,9,7};
		Integer[] array1 = {1,3,4,5,8};
	      List list = new ArrayList(Arrays.asList(array));
	      list.addAll(Arrays.asList(array1));
	      Object array2 = list.toArray();
	      System.out.println(array2);
		

	}

}
