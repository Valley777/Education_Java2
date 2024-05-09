import java.util.Scanner;
public class squareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Да се напише програма, която въвежда цяло положително число n и чертае на конзолата квадратна
        // рамка с размер n * n.

        //Print the top row +---+
        int n = Integer.parseInt(scan.nextLine());
        System.out.print ("+");
        for (int t = 0; t<n-2; t++){
              System.out.print (" -");
        }
        System.out.println(" +");

        //Print the middle rows:
        for (int m = 0; m<n-2; m++){
            System.out.print("|");
            for (int i=0;i<n-2; i++){
                System.out.print(" -");
            }
            System.out.println(" |");
        }
        //Print the bottom rows: +--+
        System.out.print("+");
        for (int j=0; j<n-2; j++){
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
