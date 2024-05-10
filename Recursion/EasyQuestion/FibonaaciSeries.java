import java.util.*;
public class FibonaaciSeries {
    public static void main(String ar[]){
        int a=0,b=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the count you want to print :");
            int n= sc.nextInt();
            System.out.println(a);
            System.out.println(b);
            printFibonaaciSeries(n-2,a,b);
        }
    }

    private static void printFibonaaciSeries(int n, int a, int b) {
        if(n==0)return;
        int f = a+b;
        System.out.println(f);
        printFibonaaciSeries(n-1, b, f);

    }
}
