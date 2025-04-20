import java.util.Scanner;

public class CardsAgainstHumanity {
    public static void main(String[] args) {
        
        //Variable declaration
        Scanner sc = new Scanner(System.in);
        String [] choice = new String[4];
        int nb;

        //Data initialization
        choice[0] = "The Queen of England";
        choice[1] = "Lasagna";
        choice[2] = "Montparnasse station";
        choice[3] = "My Christmas wish list to Santa Claus";

        //First variable entry
        System.out.println("\nChoose an answer :\n1. " + choice[0] + "\n2. " + choice[1] + "\n3. " + choice[2] + "\n4. " + choice[3]);
        nb = sc.nextInt() - 1;

        //First data processing
        System.out.println("\nFirst answer :\nThe theme of our end-of-year show will be " + choice[nb]);
    
        //Second variable entry
        System.out.println("\nChoose a new answer :\n1. " + choice[0] + "\n2. " + choice[1] + "\n3. " + choice[2] + "\n4. " + choice[3]);
        nb = sc.nextInt() - 1;

        //Second data processing
        System.out.println("\nSecond answer :\nWhile looking at " + choice[nb] + ", my mom said: Like mother, like daughter");

        //Closing the scanner
        sc.close();
    }
}