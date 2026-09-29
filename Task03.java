import java.util.Scanner;

public class Task03
{
    static void main()
    {
        // declarations
        String affiliation;

        Scanner in =  new Scanner(System.in);

        System.out.print("What is your party affiliation(R,D,I)? ");
        affiliation = in.next();
        if(affiliation.equals("R")) {
            System.out.println("You got a Republican elephant!");
        }
        else if(affiliation.equals("D")) {
            System.out.println("You got a Democratic Donkey!");
        }
        else if(affiliation.equals("I")) {
            System.out.println("You got an Independent Person!");
        }
        else {
            System.out.println("You entered an invalid input: " + affiliation);
        }
    }
}
