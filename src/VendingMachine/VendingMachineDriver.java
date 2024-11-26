package VendingMachine;

import VendingMachine.VendingMachine;

public class Main
{
    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();

        // Simulate user actions
        machine.insertMoney(2.00);
        machine.selectSnack("Coke");
        machine.dispenseSnack();

        machine.insertMoney(1.00);
        machine.selectSnack("Snickers");
        machine.dispenseSnack();
    }
}
