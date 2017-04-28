
public class RemoveChar {

	
		   public static void main(String args[]) {
		      String S = "my country";
		      System.out.println(removeCharAt(S, 3));
		   }
		   public static String removeCharAt(String s, int i) {
		      return s.substring(0, i) + s.substring(i + 1);
		   }
		}
