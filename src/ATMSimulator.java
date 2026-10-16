import java.util.Scanner;


public class ATMSimulator {
    public static void main(String[] args) {
        Scanner ATM = new Scanner(System.in);
        int maxAttempts = 3;
        int attempts = 0;
        boolean truePin = false;
        int pin = 2145;
        double balance = 10000;
        System.out.println("===Simple ATM===");

        while (attempts < maxAttempts && !truePin) {
            System.out.print("Enter your PIN: ");
            int number = ATM.nextInt();
            attempts++;

            if (number != pin) {
                System.out.println("\nIncorrect PIN❌");

            } else {
                System.out.println("Login is successful");
                System.out.println("\n You needed " + attempts + " attempts");
                truePin = true;


            }
            if (attempts == 3 && !truePin) {
                System.out.println("All attempts have been used. Your card is blocked!");
            }


                if (pin == number) {
                    System.out.println("=== ATMMENU ===\n");
                    boolean menuRunning = true;

                    while (true) {
                    System.out.println("Choose the operation:\n1. Check balance.\n2. Deposit money. \n3. Withdraw money. \n4. Exit.");
                    char function = ATM.next().charAt(0);
                    switch (function) {
                        case '1':
                            System.out.println("\nYou have " + balance + " dollars");
                            break;
                        case '2':
                            System.out.println("Enter the amount of money you want to deposit: ");
                            double amount = ATM.nextDouble();
                            if (amount <= 0) {
                                System.out.println("Invalid process!");
                            } else {
                                balance = balance + amount;
                                System.out.println("\nNow your balance is: " + balance + " dollars");
                            }

                            break;
                        case '3':
                            System.out.println("\nPlease write the amount you want to withdraw: ");
                            double withdraw = ATM.nextDouble();
                            if (withdraw > balance) {
                                System.out.println("You don't have that amount of money!");
                                break;
                            } else if (withdraw <= 0) {
                                System.out.println("Invalid process!");
                                break;
                            } else {
                                balance = balance - withdraw;
                                System.out.println("You have withdrawn: " + withdraw);
                                System.out.println("Rewarding balance: " + balance + "dollars");
                            }
                            break;
                        case '4':
                            System.out.println("\nThanks for using this Bank🤗");
                            menuRunning = false;
                            break;
                        default:
                            System.out.println("The wrong operator was chosen!");
                    }
                }


            }


        }
    }
}