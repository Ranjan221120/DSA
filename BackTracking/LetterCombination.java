 // write a code where string containing digit from 2-9 in phone no.,make all possible String using given no. 

 import java.util.*;

 public class LetterCombination {
     static Map<Character,String> phone = new HashMap<>(){{
         put('1', "abc");
         put('2', "def");
         put('3', "ghi");
         put('4', "jkl");
         put('5', "mno");
         put('6', "pqrs");
         put('7', "tu");
         put('8', "vwx");
         put('9', "yz");
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
         String currentStr=phone.get(digitalArray[i]);
         for(char c: currentStr.toCharArray()){
             stack.add(c);
             helper(stack, i+1);
             stack.pop();
         }
 
     }
 }
 