import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      Scanner scan = new Scanner(System.in);
      String command = scan.next();
      String command2 = scan.next();;
      int command3 = scan.nextInt();;
      String command4 = scan.next();;
      boolean command5 = false;
      if (command4 == "yes" || command4 == "y"){
         command5=true;
      }
      physicsTrip trip = new physicsTrip(command,command2,command3,command5);
      System.out.println(trip);
   }
}
