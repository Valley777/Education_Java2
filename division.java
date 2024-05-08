import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double p1 =0.0; // p1 се делят без остатък на 2
        double p2 =0.0; //p2 се делят без остатък на 3
        double p3 =0.0; //p3 се делят без остатък на 4

        //Да се напише програма, която изчислява и отпечатва процентите p1, p2 и p3
        for (int i=1; i<=n; i++){
            int sequence = Integer.parseInt(scan.nextLine());
            if(sequence %2==0){
                p1++;
            }
            if(sequence %3==0){
                p2++;
            }
            if(sequence %4==0){
                p3++;
            }
        }
        //checks
       // System.out.println(p1);
              //  System.out.println(p2);
                     //   System.out.println(p3);

        double a1 = (double)(p1/n)*100; //p1 percentage
        double a2 = (double)(p2/n)*100; //p2 percentage
        double a3 = (double)(p3/n)*100; //p3 percentage

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%",a1,a2,a3);

    }
}
