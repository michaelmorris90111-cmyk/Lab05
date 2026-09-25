import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int birthMonth;

        System.out.print("Enter your birth month (1-12): ");
        birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}