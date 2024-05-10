import java.util.*;
public class RemoveDuplicates {

    public static boolean map[]=new boolean[26];
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String");
            String str= sc.nextLine();
            removeDuplicacy(str,0,"");
        }
    }

    private static void removeDuplicacy(String str,int index,String newStr) {
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar= str.charAt(index);
        if(map[currChar-'a']){
            removeDuplicacy(str,index+1,newStr);
        }else{
            newStr+=currChar;
            map[currChar-'a']=true;
            removeDuplicacy(str,index+1,newStr);
        }

    }
}
