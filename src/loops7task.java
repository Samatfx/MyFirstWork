//public class loops {
//    public static void main(String[] args) {
//        int someValue = 4;
//        int factorial = 1;
//        while(someValue > 1) {
//
//            factorial *= someValue;
//            someValue--;
//        }
//        System.out.println(factorial);
//    }
//}





//public class loops {
//    public static void main(String[] args){
//        for(int i = 1; i < 100; i *= 2)
//            System.out.println(i);
//    }
//}



// the first ex

//public class loops {
//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i *= 10;
//        }
//        System.out.println(i);
//    }
//}




// the second ex, with for loop

//public class loops {
//    public static void main(String[] args){
//        for(int i = 1; i <= 1000; i *=10)
//            System.out.println(i);
//    }
//}




//input n, the third ex


//import java.util.Scanner;
//    public class loops{
//        public static void main(String[] args){
//        Scanner counter = new Scanner(System.in);
//        System.out.print("Please enter your number: ");
//        int num = counter.nextInt();
//        int i = 1;
//        while(i < num ) {
//            System.out.println(i);
//            i *= 2;
//        }
//        System.out.println(i);
//    }
//
//}

//import java.util.Scanner;
//public class loops{
//    public static void main(String[] args){
//        Scanner counter = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int a = counter.nextInt();
//        for(int i = 1; i < a; i *=2)
//            System.out.println(i);
//    }
//}



//import java.util.Scanner;
//public class loops{
//    public static void main(String[] args){
//        Scanner counter = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int a = counter.nextInt();
//        int i = 1;
//        do {
//            System.out.println(i);
//            System.out.println(" *2 =");
//            i *= 2;
//            System.out.println(i);
//        }
//        while(i < a );
//    }
//}




// infinite loop

//public class loops {
//    public static void main(String[] args){
//        int i = 1;
//        while(i < 100) {
//            System.out.println(i);
//            i *= 1;
//        }
//    }
//}



// the fifth hw

//import java.util.Scanner;
//public class loops {
//    public static void main(String[] args) {
//        Scanner oneToN = new Scanner(System.in);
//        System.out.print("Please enter the number you wanted to be counted: ");
//        int num = oneToN.nextInt();
//        int i = 0;
//        while (i <= num){
//            System.out.println(i);
//            i++;
//        }
//
//
//    }
//}






//import java.util.Scanner;
//public class loops {
//    public static void main(String[] args) {
//        Scanner oneToN = new Scanner(System.in);
//        System.out.print("Please enter the number you wanted to be counted: ");
//        int num = oneToN.nextInt();
//        for(int i = 0; i <= num; i++ )
//            System.out.println(i);
//
//        }
//
//
//    }




//import java.util.Scanner;
//public class loops{
//    public static void main(String[] args) {
//        Scanner doLoop = new Scanner(System.in);
//        System.out.print("Enter the number you wan to be counted: ");
//        int num = doLoop.nextInt();
//        int i = 0;
//        do {
//            i ++;
//            System.out.println(i);
//        }
//        while( i <= num);
//    }
//}





// 6 home work

//import java.util.Scanner;
//public class loops {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter an odd number!");
//        int num = scanner.nextInt();
//        for (int i= 0; i <= num; i += 2){
//            System.out.println(i);
//        }
//    }
//
//}




//import java.util.Scanner;
//public class loops {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter an odd number!");
//        int num = scanner.nextInt();
//        int i = 0;
//        while(i <= num) {
//            System.out.println(i);
//            i += 2;
//        }
//    }
//
//}






//import java.util.Scanner;
//public class loops {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter an odd number!");
//        int num = scanner.nextInt();
//        int i = 0;
//        do {
//            System.out.println(i);
//            i +=2;
//        }
//        while (i<=num);
//    }
//
//}



// 7 home work

import java.util.Scanner;
public class loops7task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        scanner.close();
    }

}




