import java.util.Arrays;
import java.util.Collections;

public class MaxAndMin {
	public static void main(String [] args) {
		Integer[] array = {2,3,6,5,4,9,1,7};
		int min = Collections.min(Arrays.asList(array));
		int max = Collections.max(Arrays.asList(array));
		System.out.println(min);
		System.out.println(max);


	}

}
