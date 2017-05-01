import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,-5,-4,3,-9,5,8,9};
	     Arrays.sort(array);//Arrays.sort()
		System.out.println(Arrays.toString(array));//Arrays.sort()
		int index = Arrays.binarySearch(array, 3);//used to find postion of the element by enter the element
	      System.out.println("Found 2 @ " + index);
	      printarray();
	      }
		
		
		
	public static void printarray (){//linear search method
		int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      int target = -7;
	      
	      for (int i = 0; i < a.length; i++) {
	         if (a[i] == target) {
	            System.out.println("Element found at index " + i);
	            break;
		
	}

	      }
	}
}

