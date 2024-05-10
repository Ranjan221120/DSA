package HardQuestion;
import java.util.*;


public class StringPermutation {
    
    public static void main(String[] args) {
        
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner (System.in);
        String s= sc.next();
        System.out.println("--------------");
        permutation(s,"");
    }

    private static void permutation(String str, String permString) {

        if(str.length()==0){
            System.out.println(permString);
            return;
        }

        for(int i=0;i<str.length();i++){
            
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutation(newStr, permString+currChar); 
        }
    }

}
