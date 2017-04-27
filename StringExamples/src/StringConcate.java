
public class StringConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s3 = " world";
		s1 = s1.concat(" ajay");//using String.concat()
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer();
		s2.append("this is testing");
		s2.append(" between");
		s2.append(" concat and append");//using StringBuffer.append()
		System.out.println(s2);
		
		System.out.println("string concatanization using + operaator:" + s1 + s3);
		//using + opertaor
		
		

	}

}
