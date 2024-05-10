import java.util.*;
public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str= sc.nextLine();
        StringBuilder sb = new StringBuilder(str); 
        System.out.println(sb.reverse());
    }
}
