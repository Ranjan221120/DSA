import java.util.*;
public class FactorialNumbers {
    
    public static void main(String ar[]){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your no.");
            int n= scanner.nextInt();
            printFactorial(n,1,1);
        }
    }

    private static void printFactorial(int n,int i,int prod) {
        if(n<i){
            System.out.println(prod);
            return;
        }
        prod *=i;
        printFactorial(n, i+1, prod);
    }
}
