import java.util.*;

class PrintNumbers{
    public static void main(String ar[]){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int n= scanner.nextInt();
            printNumber(n);
        }
    }

    private static void printNumber(int n) {
        if(n==0){
            return;
        }else{
            System.out.println(n);
            printNumber(n-1);
        }

    }

}