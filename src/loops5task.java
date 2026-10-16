
    import java.util.Scanner;
public class loops5task {
    public static void main(String[] args) {
        Scanner oneToN = new Scanner(System.in);
        System.out.print("Please enter the number you wanted to be counted: ");
        int num = oneToN.nextInt();
        int i = 0;
        while (i <= num){
            System.out.println(i);
            i+=2;
        }


    }







//import java.util.Scanner;
//public class loops5task {
//    public static void main(String[] args) {
//        Scanner oneToN = new Scanner(System.in);
//        System.out.print("Please enter the number you wanted to be counted: ");
//        int num = oneToN.nextInt();
//        for(int i = 0; i <= num; i+=2 )
//            System.out.println(i);
//
//        }
//
//
//    }




//import java.util.Scanner;
//public class loops5task{
//    public static void main(String[] args) {
//        Scanner doLoop = new Scanner(System.in);
//        System.out.print("Enter the number you wan to be counted: ");
//        int num = doLoop.nextInt();
//        int i = 0;
//        do {
//            i +=2;
//            System.out.println(i);
//        }
//        while( i <= num);
//    }
//}
}
