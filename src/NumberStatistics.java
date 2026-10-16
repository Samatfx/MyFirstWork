import java.util.Scanner;


public class NumberStatistics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= 10; i++){
            System.out.printf("Enter number %d: ", i);
            int num = scanner.nextInt();

            if (num > 0) {
                positiveCount++;
            }
            else if (num < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }
            if( num % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }

        }

        System.out.println("===Statisctic===");
        System.out.printf("Positive numbers: %d%n", positiveCount);
        System.out.printf("Negative numbers: %d%n", negativeCount);
        System.out.printf("Zero numbers: %d%n", zeroCount);
        System.out.printf("Even numbers: %d%n", evenCount);
        System.out.printf("Odd numbers: %d%n", oddCount);
    }
}
