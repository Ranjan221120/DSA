package BitManupulation;
import java.util.*;
class CountOne{
    public static void main(String ar[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n =sc.nextInt();
        int nn =n;
        System.out.println("");
        
        //M-1(Brian Kernighon's Algorithm) 
        System.out.println("Method- 1");
        int c=0;
        while(n>0){
            n=n &(n-1);
            c++;
        }
        System.out.println("Count the no. of 1 in "+nn+" : "+c);
        System.out.println("");

        System.out.println("Method- 2");
        System.out.println("Count the no. of 1 in "+nn+" : "+Integer.bitCount(nn));



        System.out.println("");
        var x= Integer.toBinaryString(nn);
        System.out.print("Convert "+nn+" Decimal to Binary: ");
        System.out.println(x);
        System.out.print("Convert "+x +" Binary to Decimal: ");
        System.out.println(Integer.parseInt(String.valueOf(x),2));
        

    }
}