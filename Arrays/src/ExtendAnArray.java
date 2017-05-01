
public class ExtendAnArray {

	public void extendArraySize() {
	      String[] names = new String[] {"Sai", "Ram", "Krishna"};
	      String[] extended = new String[5];
	      extended[3] = "Prasad";
	      extended[4] = "Mammahe";
	      System.arraycopy(names, 0, extended, 0, names.length);
	      
	      for (String str : extended) 
	    	  System.out.println(str);
	   } 
	
	   public static void main(String[] args) {
	      new ExtendAnArray().extendArraySize();
	   }
	

}
