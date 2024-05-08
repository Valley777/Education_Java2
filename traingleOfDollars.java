import java.util.Scanner;
public class traingleOfDollars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Да се напише програма, която въвежда число n и печата триъгълник от долари.
        int numberOfSymbols = Integer.parseInt(scan.nextLine());
        for(int row =1; row<=numberOfSymbols; row++){
            System.out.print ("$");
            for (int col=1; col<row; col++){
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
