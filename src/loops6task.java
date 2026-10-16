
    import java.util.Scanner;
public class loops6task {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an odd number!");
        int num = scanner.nextInt();
        for (int i= 0; i <= num; i += 2){
            System.out.println(i);
        }
    }

}




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