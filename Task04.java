import java.util.Scanner;

public class Task04 {
    static void main()
    {
        // declarations
        int age;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
            age = in.nextInt();
            if (age >= 21) {
                System.out.println("You get a wristband!");
            }
    }
}
