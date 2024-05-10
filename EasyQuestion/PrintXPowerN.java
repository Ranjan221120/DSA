import java.util.*;
public class PrintXPowerN {
    public static void main(String q[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number :"); 
            int x= sc.nextInt();
            System.out.println("Enter the Power of Number :"); 
            int n= sc.nextInt();
            System.out.println(xPowerN(x,n));
        }
    }


    private static int xPowerN(int x, int n) {

        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x * xPowerN(x,n-1);
    }
    
}
