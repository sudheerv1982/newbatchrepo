
public class InsideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Being physically stronger don't make you stronger";
		int i = s.indexOf("stronger");//indexOf() method which returns a position index of a word within the string if found
		if (i == -1)
			System.out.println("string not found");
		else
			System.out.println("stronger found at position " + i);
		System.out.println(s.contains("stronger"));//contians method gives true or false.

	}

}
