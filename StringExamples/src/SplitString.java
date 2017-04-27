
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "42-49 colden street,Apt 11H,Flushing,New York, 11355";
	String[] parts = s.split("," , 4);//split(string) method and then prints the substrings.
	String part1 = parts[0];
	String part2 = parts[1];
	String part3 = parts[2];
	String part4 = parts[3];
	System.out.println(part1);
	System.out.println(part2);
	System.out.println(part3);
	System.out.println(part4);
	

	}

}
