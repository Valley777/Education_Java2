import java.util.Scanner;
public class building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
    Напишете програма, която извежда на конзолата номерата на стаите в една сграда (в низходящ ред),
    като са изпълнени следните условия:
      • На всеки четен етаж има само офиси
      • На всеки нечетен етаж има само апартаменти
      • Всеки апартамент се означава по следния начин :
     А{номер на етажа}{номер на апартамента}, номерата на апартаментите започват от 0.
      • Всеки офис се означава по следния начин : О{номер на етажа}{номер на офиса}, номерата на офисите също започват от 0.
      • На последният етаж винаги има апартаменти и те са по-големи от останалите, за това пред номера им пише 'L', вместо 'А'.
    Ако има само един етаж, то има само големи апартаменти!
    От конзолата се прочитат две цели числа - броят на етажите и броят на стаите за един етаж.
         */
        int floors = Integer.parseInt(scan.nextLine()); //6
        int numRoomsPerFloor = Integer.parseInt(scan.nextLine()); //4

        for(int i = floors; i >= 1; i--){
          //  System.out.println("floor" + i); //654321 floors
         for(int j = 0 ; j< numRoomsPerFloor; j++)   {
        //   System.out.println( "rooms"+ j); //1234 room
              if(i == floors){                          //last floor > L
                  System.out.print("L"+i+j+ " ");
              }else if(i %2 == 0){                //offices
                  System.out.print("O"+i+j+ " ");
             }else if(i %2 != 0){
                  System.out.print("A"+i+j+ " ");
              }
         }
System.out.println( );
 }

    }
}
