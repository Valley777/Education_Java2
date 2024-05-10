import java.util.Scanner;
public class Nto1DecreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        //Да се напише програма, която отпечатва числата от n до 1 в обратен ред (стъпка -1).
        // Например, ако n = 100, то резултатът ще е: 100, 99, 98, …, 3, 2, 1.
        for(int i=n; i>=1;i--){
            System.out.println(i);
        }
    }
}
