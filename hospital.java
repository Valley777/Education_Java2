import java.util.Scanner;
public class hospital {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int period = Integer.parseInt(scan.nextLine());
/*За даден период от време, всеки ден в болницата пристигат пациенти за преглед. Тя разполага първоначално със 7 лекари. Всеки лекар може да преглежда само по един пациент на ден, но понякога има недостиг на лекари, затова останалите пациенти се изпращат в други болници. Всеки трети ден болницата прави изчисления и ако броят на непрегледаните пациенти е по-голям от броя на прегледаните, се назначава още един лекар. Като назначаването става преди да започне приемът на пациенти за деня.
Напишете програма, която изчислява за дадения период броя на прегледаните и непрегледаните пациенти.*/
      int treatedPatients =0;
      int untreatedPatients =0;
      int countDoctors = 7;

      for ( int i=1; i<= period; i++){
          int currentPatients =Integer.parseInt(scan.nextLine());
          if((i%3==0)&&(untreatedPatients>treatedPatients)){
              countDoctors++;
          }
          if(currentPatients>countDoctors){
              treatedPatients+=countDoctors;
              untreatedPatients+=currentPatients-countDoctors;
          }else{
              treatedPatients+=currentPatients;
          }
      }
      System.out.printf("Treated patients: %d.\nUntreated patients: %d.",treatedPatients,untreatedPatients);

    }
}
