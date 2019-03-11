package ATMMachine;

public class ATMClass {

    /* Create ten accounts in an array with id
0 , 1 , . . . , 9 , and initial balance $100. The system prompts the user to enter an
id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
is accepted, the main menu is displayed as shown in the sample run. You can
enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
depositing money, and 4 for exiting the main menu. Once you exit, the system
will prompt for an id again. Thus, once the system starts, it will not stop.
     */

    private double balance;
    private double deposit;
    private double withdraw;
    private int id;


    public ATMClass() {
    }

    public ATMClass(double balance, double deposit, double withdraw, int id) {
        this.balance = 100;
        this.deposit = 0;
        this.withdraw = 0;
        this.id=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    /* methods for deposit, withdraw ... */

    public void depositMethod(double deposit) {

        balance += deposit;

        System.out.println("Deposit completed.");
    }

    public void withdrawMethod(double withdraw) {


        if (balance - withdraw < 0) {
            System.out.println("You don't have enough money.");
        } else {

            balance -= withdraw;

            System.out.println("Withdraw completed.");
        }
    }

    public void checkBalance() {

        System.out.println("Your balance is: " + balance);
    }
}