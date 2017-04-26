
public class MethodOverloading {
	
	void m1(int i)
	{
		System.out.println("in poly");
	}
	void m1(boolean b)
	{
		System.out.println("b");
	}
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.m1(10000);
		m.m1((int) 123.23);
		m.m1(false);
		

	}

}
