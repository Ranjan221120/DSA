 // write a code where string containing digit from 2-9 in phone no.,make all possible String using given no. 

 import java.util.*;

 public class LetterCombination {
     static Map<Character,String> phone = new HashMap<>(){{
         put('2', "abc");
         put('3', "def");
         put('4', "ghi");
         put('5', "jkl");
         put('6', "mno");
         put('7', "pqrs");
         put('8', "tuv");
         put('9', "wxyz");
     }};
     static char digitalArray[];
     static List<String> letterList = new LinkedList<>();
     public static void main(String[] args){
         
         @SuppressWarnings("resource")
         Scanner sc = new Scanner(System.in);
         StringBuilder digits = new StringBuilder();
         System.out.println("Enter the digits:");
         digits.append(sc.nextLine());
         System.out.println(letterCombinations(digits.toString()));
     }
 
     private static List<String> letterCombinations(String digital) {
 
         if(digital.isEmpty()){
             return letterList;
         }
         digitalArray = digital.toCharArray();
         Stack <Character> stack = new Stack<>();
         helper(stack,0);
         return letterList;
     }
 
     private static void helper(Stack<Character> stack, int i) {
 
         if(i==digitalArray.length){
             Iterator<Character> it = stack.iterator();
             StringBuilder str = new StringBuilder();
             while(it.hasNext()){
                 str.append(it.next());
             }
             letterList.add(str.toString());
             return;
         }

         if(digitalArray[i]=='1'){
            return;
         }
         String currentStr=phone.get(digitalArray[i]);
         for(char c: currentStr.toCharArray()){
             stack.add(c);
             helper(stack, i+1);
             stack.pop();
         }
 
     }
 }
 