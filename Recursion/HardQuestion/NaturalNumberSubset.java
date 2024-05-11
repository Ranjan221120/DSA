package HardQuestion;
import java.util.*;

public class NaturalNumberSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural no. where you want the Subset: ");
        int n=sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        showSubset(n,ar);
    }

    public static void showSubset(int n, ArrayList<Integer> ar){

        if(n==0){
            for(int i=0;i<ar.size();i++){
                System.out.print(ar.get(i)+" ");
            }
            System.err.println();
            return;
        }

        // on Adding
        ar.add(n);
        showSubset(n-1, ar);


        //on removing
        ar.remove(ar.size()-1);
        showSubset(n-1, ar);
    } 

}
