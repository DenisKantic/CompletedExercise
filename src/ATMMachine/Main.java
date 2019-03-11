package ATMMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int id;
        double deposit;
        double withdraw;

        ATMClass atm = new ATMClass();

        Scanner s = new Scanner(System.in);


        do {

            System.out.print("Enter your ID:");

            id = s.nextInt();

            if (isValidID(id)) {
                int choise;
                do {
                    System.out.println("Enter your choise: " +
                            "\n1. check balance" +
                            "\n2. withdraw" +
                            "\n3. deposit" +
                            "\n4. exit");
                    choise = s.nextInt();
                    if (isValidChoise(choise)) {
                        mainMenu(choise, atm);

                    }
                }
                while (choise != 4);
            }
        } while (true);
    }


    private static boolean isValidID(int id) {

        for (int i = 0; i < 10; i++) {
            if (id == i) {
                return true;
            }
        }

        return false;
    }

    public static void mainMenu(int choise, ATMClass atm) {


        Scanner s = new Scanner(System.in);
        switch (choise) {

            case 1:
                System.out.print("Your balance is: " + atm.getBalance());
                break;

            case 2:
                System.out.print("Enter an amount for withdraw: ");
                double withdraw = s.nextDouble();
                atm.withdrawMethod(withdraw);
                break;

            case 3:
                System.out.print("Enter an amount for deposit: ");
                double deposit = s.nextDouble();
                atm.depositMethod(deposit);
                break;

            case 4:
                exitMenu();
                break;

            default:

                System.out.println("Please enter a valid choise.");

        }
    }

    public static void exitMenu() {

        System.out.println("Thank you for using our service.");
    }

    public static boolean isValidChoise(int choise) {

        return choise > 0 && choise < 4;
    }
}

