package BitManupulation;
import java.util.*;
class ToggleBit{
    public static void main(String ar[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.");
            int n = sc.nextInt();
            System.out.println("Enter the Position");
            int pos = sc.nextInt();

            int mask =1<< pos;

            System.out.println(Integer.toBinaryString(n));
            System.out.println(n^mask);
            System.out.println(Integer.toBinaryString(n^mask));
        }
    }
}