
public class ReplaceAll {

	public static void main(String[] args) {
		String s6 = "He is good";
		System.out.println(s6.replaceFirst("He", "she"));
      String s7 = new String("Think twice code once");
		System.out.println(s7.replaceAll("twice", "thrice"));
		String s8 = "The quick brown fox jumps over the lazy dog.";
		String  s9 = s8.replaceAll("fox", "cat");
		System.out.println("original string is:" +s8);
		System.out.println("New String is:" +s9);

	}

}
