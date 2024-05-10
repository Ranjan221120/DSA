import java.util.*;
public class SumOfNumbers {
    public static void main(String ar[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.");
            int n= sc.nextInt();
            sum(n,1,0);
        }
    }

    private static void sum(int n,int i,int s) {
        if(n<i){
            System.out.println(s);
            return;
        }
        s +=i;
        sum(n,i+1,s);
    }

}
