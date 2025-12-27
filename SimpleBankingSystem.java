import java.util.*;

class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice, amount;

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount:");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Deposited!");
                    break;

                case 2:
                    System.out.println("Enter amount:");
                    amount = sc.nextInt();
                    System.out.println(amount > balance ? "Not enough money!" : "Withdrawn!");
                    if (amount <= balance) balance -= amount;
                    break;

                case 3:
                    System.out.println("Current balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the bank.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
