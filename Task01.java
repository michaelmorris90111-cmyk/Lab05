import java.util.Scanner;
public class Task01
{
    static void main()
    {
        //declarations
        double shippingCost;
        double totalCost;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the price of your item?");
        double itemPrice = in.nextDouble();
        if(itemPrice >= 100)
        {
            System.out.println("Your shipping is free and your total cost is: " + itemPrice);
        }
        else
        {
            shippingCost = itemPrice * .02;
            totalCost = itemPrice + shippingCost;
            System.out.println("Your cost before shipping is: " + itemPrice);
            System.out.println("Your shipping cost is: " + shippingCost);
            System.out.println("Your total cost is: " + totalCost);

        }

    }
}
