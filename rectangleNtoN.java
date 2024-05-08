import java.util.Scanner;
public class rectangleNtoN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Да се начертае на конзолата квадрат от N x N звездички, от конзолата една цифра
        int numbersOfStars = Integer.parseInt(scan.nextLine());
        for (int outer=1; outer<=numbersOfStars;outer++){
            for (int inner=1; inner<=numbersOfStars;inner++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
