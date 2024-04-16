package methods;

public class staticIntMethodreturningValues {
       static int myMethod(int x, int y) {
    	   return x + y;
       }
	public static void main(String[] args) {
       int z = myMethod(5, 3);
       System.out.println(z);
       System.out.println(myMethod(5,3));
      
       //Output 8
	}
}
