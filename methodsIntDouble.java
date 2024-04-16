package methods;

public class methodsIntDouble {
    static int MethodInt(int x, int y) {
    	return x+y;
    }
    static double MethodDouble(double x, double y) {
    	return x + y;
    }
	public static void main(String[] args) {
		int myNum1 = MethodInt(8,5);
		double myNum2  = MethodDouble(4.3, 6.26);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}
}
