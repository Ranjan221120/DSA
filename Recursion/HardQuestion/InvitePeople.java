package HardQuestion;
import java.util.*;

public class InvitePeople {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No. of people for invitation: ");
        int n= sc.nextInt();
        System.out.println(noOfPeople(n));
    }

    private static int noOfPeople(int n) {

        if(n<=1){
            return 1;
        }

        int singleInvite= noOfPeople(n-1);
        int pairInvite= (n-1)*noOfPeople(n-2);
        return singleInvite+pairInvite;
    }
}
