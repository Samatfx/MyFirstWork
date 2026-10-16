import java.util.Scanner;
public class ATMPINVerification {
    public static void main(String[] args) {
        Scanner ATM = new Scanner(System.in);
        System.out.println("Please enter your PIN for ATM!: ");
        int pin = ATM.nextInt();
        String password = "5555";
        if( pin == 5555) {
            System.out.println("Access granted!");
        }
        else {
            System.out.println("Incorrect PIN! You have two chances");
        }
        System.out.println("Please enter your PIN!");
        int pin1 = ATM.nextInt();
        if( pin1 == 5555) {
            System.out.println("Access Granted!");
        }
        else {
            System.out.println("Incorrect PIN. You have one more chance");
        }
        System.out.println("Please enter your PIN: ");
        int pin2 = ATM.nextInt();
        if( pin2 == 5555) {
            System.out.println("Access Granted!");
        }
        else {
            System.out.println("Incorrect PIN! Your card is Blocked!");
        }

    }

}

