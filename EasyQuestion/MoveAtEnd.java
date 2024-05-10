import java.util.*;
public class MoveAtEnd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String: ");
            String str= sc.nextLine();
            System.out.println("Enter the character where you have to move at end : ");
            char e_str= sc.nextLine().charAt(0);
            moveStringEnd(str,e_str,0,0,"");
        }
    }

    private static void moveStringEnd(String str, char e_str,int index,int count,String newStr) {

        if(index==str.length()){
            for(int i=0;i<count;i++){
                newStr+=e_str;
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(index)==e_str){
            count++;
            moveStringEnd(str,e_str,index+1,count,newStr);
        }else{
            newStr +=str.charAt(index);
            moveStringEnd(str,e_str,index+1,count,newStr);
        }
    }
}
