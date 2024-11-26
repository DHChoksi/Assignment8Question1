package VendingMachine.Handlers;

import VendingMachine.Snacks.Snack;

public class SnackDispenseHandler
{
    public void handleRequest(Snack snack, double moneyInserted)
    {
        if (snack != null)
        {
            if (snack.getQuantity() > 0 && moneyInserted >= snack.getPrice())
            {
                snack.dispense();
                System.out.println("Dispensing " + snack.getName());
                if (moneyInserted > snack.getPrice())
                {
                    System.out.printf("Returning change: $%.2f%n", moneyInserted - snack.getPrice());
                }
            }
            else if (snack.getQuantity() == 0)
            {
                System.out.println(snack.getName() + " is out of stock.");
            }
            else
            {
                System.out.printf("Insufficient funds for %s. Please insert at least $%.2f.%n",
                        snack.getName(), snack.getPrice() - moneyInserted);
            }
        }
        else
        {
            System.out.println("Snack not available.");
        }
    }
}