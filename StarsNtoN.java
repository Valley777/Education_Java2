import java.util.Scanner;
public class StarsNtoN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String symbol="*";
        for(int i=0;i<10;i++){
            System.out.println(generateFrom(10,symbol));
        }

        }
    public static String generateFrom(int numberOfStarts, String symbol){
        StringBuffer builder = new StringBuffer();
        for (int i=0; i<10;i++){
            builder.append(symbol);

        }
        return builder.toString();
    }
}
