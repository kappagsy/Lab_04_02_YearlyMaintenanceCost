public class Main
{
    public static void main(String[] args)
    {
        double summerCost = 299.99;
        double fallCost = 50.15;
        double winterCost = 75.65;
        double springCost = 199.99;
        double totalCost = summerCost + fallCost + winterCost + springCost;

        System.out.println("Your summer maintenance cost is: " + summerCost + ".");
        System.out.println("Your fall maintenance cost is: "+ fallCost + ".");
        System.out.println("Your winter maintenance cost is: " + winterCost + ".");
        System.out.println("Your spring maintenance cost is: " + springCost + ".");
        System.out.println("Your total yearly maintenance cost is: " + totalCost + ".");
    }
}