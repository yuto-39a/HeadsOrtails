import java.util.Random;
import java.util.Scanner;

public class task3{
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Who are you?");
      System.out.print("> ");
      String name = sc.nextLine();
      System.out.println("Hello, "+name+"!");
        System.out.println("Tossing a coin...");
        Random rand = new Random();
        int heads = 0;
        int tails = 0;

        for(int i=0;i<3;i++){
            boolean coin = rand.nextBoolean();
            String result = coin ? "Heads" : "Tails";
            System.out.println("Round "+(i+1)+": "+result);
            if(coin){
                heads++;
            } else {
                tails++;
            }
        }
            System.out.println("Heads: "+heads+", Tails: "+tails);
}

}