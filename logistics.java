import java.util.Scanner;
public class logistics {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = Integer.parseInt(scan.nextLine());

       double upTo3tonne = 0.0;
       double from3tonneTo11 = 0.0;
       double above11tonne = 0.0;
       /*До 3 тона – микробус (200 лева на тон).
       От над 3 и до 11 тона – камион (175 лева на тон).
       Над 11 тона – влак (120 лева на тон). */
        double priceMicbus = 200.0;
        double priceTrack = 175.0;
        double priceTrain = 120.0;

        for (int i =1; i<=n;i++){
            double sequence = Double.parseDouble(scan.nextLine());
            if(sequence<=3){
                upTo3tonne+=sequence;
            }
            if(sequence>3 && sequence<=11){
                from3tonneTo11+=sequence;
            }
            if(sequence>11){
                above11tonne+=sequence;
            }
        }
         //System.out.println(upTo3tonne);
        // System.out.println(from3tonneTo11);
        //System.out.println(above11tonne);

        double totalTonn = upTo3tonne+from3tonneTo11+above11tonne;
        double microbus = (double) (upTo3tonne/totalTonn)*100;
        double track = (double)(from3tonneTo11/totalTonn)*100;
        double train = (double) (above11tonne/totalTonn)*100;

        double price =(double)((upTo3tonne*priceMicbus)+(from3tonneTo11*priceTrack)+(above11tonne*priceTrain))/totalTonn;
        //  System.out.println(" ************************************************************");
        System.out.printf("%.2f\n%.2f%%\n%.2f%%\n%.2f%%",price,microbus,track,train);

    }
}
