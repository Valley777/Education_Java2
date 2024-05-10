import java.util.Scanner;
public class step1to3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        //Да се напише програма, която отпечатва числата от 1 до n със стъпка 3.
        // Например, ако n = 100, то резултатът ще е: 1, 4, 7, 10, …, 94, 97, 100.
        for (int i = 1; i<=n; i+=3){
           System.out.println(i);
        }
    }
}
