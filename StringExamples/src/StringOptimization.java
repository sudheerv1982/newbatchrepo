public class StringOptimization {
   public static void main(String[] args) {
      String variables[] = new String[50000];	  
      for( int i = 0;i <50000;i++) {
         variables[i] = "s"+i;
      }
      long startTime0 = System.currentTimeMillis();
      
      for(int i = 0;i<50000;i++) {
         variables[i] = "hello";
      }
      long endTime0 = System.currentTimeMillis();
      System.out.println("Creation time" 
         + " of String literals : "+ (endTime0 - startTime0) 
         + " ms" );
      long startTime1 = System.currentTimeMillis();
      
      for(int i = 0;i<50000;i++) {
         variables[i] = new String("hello");
      }
      long endTime1 = System.currentTimeMillis();
      System.out.println("Creation time of" 
         + " String objects with 'new' key word : " 
         + (endTime1 - startTime1)
         + " ms");
      long startTime2 = System.currentTimeMillis();
      sidhu
      for(int i = 0;i<50000;i++) {
         variables[i] = new String("hello");
         variables[i] = variables[i].intern();	//JVM maintains unique String objects 
         //for String literals internally. Programmers need not bother about String literals 
         //but they should bother about String objects that are created using 'new' keyword
         //and they should use intern() method to avoid duplicate String objects in
         //heap memory which in turn improves java performance. see the following
         //section for more information.	  
      }
      long endTime2 = System.currentTimeMillis();
      System.out.println("Creation time of" 
         + " String objects with intern(): " 
         + (endTime2 - startTime2)
         + " ms");
      System.out.println("hagsggsg")
   }
}
