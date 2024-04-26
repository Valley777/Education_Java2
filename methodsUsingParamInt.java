public class methodsUsingParamInt {
    static int methodInt(int x, int y,int num2){
         num2 = x+y;
        System.out.println(num2);
        return num2;
    }
    static double methodDouble(double c, double v,double num1){
        num1 = c+v;
        System.out.println(num1);
        return num1;
    }
    public static void main(String[] args) {
         methodInt(20,30,0);
         methodDouble(1.2,3.2,0.0);
    }
}
