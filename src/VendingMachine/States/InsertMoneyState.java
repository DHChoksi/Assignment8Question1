package VendingMachine.States;

import VendingMachine.VendingMachine;

public class InsertMoneyState implements StateOfVendingMachine
{
    @Override
    public void insertMoney(VendingMachine machine, double amount)
    {
        machine.addMoney(amount);
        System.out.printf("Added $%.2f. Current balance: $%.2f.%n", amount, machine.getBalance());
    }

    @Override
    public void selectSnack(VendingMachine machine, String snackName)
    {
        if (machine.getSnacks().containsKey(snackName))
        {
            machine.setSelectedSnack(machine.getSnacks().get(snackName));
            System.out.println("Snack selected: " + snackName);
            machine.setState(new SelectSnackState());
        }
        else
        {
            System.out.println("Snack not found.");
        }
    }

    @Override
    public void dispenseSnack(VendingMachine machine)
    {
        System.out.println("Please select a snack first.");
    }
}
