import java.util.*;

class NQueens{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Chess Board : ");
        int n= sc.nextInt();
        System.out.println((n==0)?
        "You have enter wrong Size"
        :"you have "+n+(n==1?" Queen":" Queens"));
        System.out.println(solveQueen(n));
        
    }

    public static List<List<String>> solveQueen(int n){

        List<List<String>> allBoard= new ArrayList<>();
        char board[][]= new char[n][n];
        helper(allBoard,board,0);
        return allBoard;
    }

    private static void helper(List<List<String>> allBoard, char[][] board, int col) {


        if(col==board.length){
            saveInList(allBoard,board);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(allBoard, board, col+1);
                board[row][col]='.';
            }
        }

    }

    private static void saveInList(List<List<String>> allBoard, char[][] board) {

        String row="";
        List<String> newBoard= new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row +='Q';
                }else{
                    row +='.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        
        //checking queen is safe in horizontal direction
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //checking queen is safe in Vertical direction
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //checking queen is safe in Upper left direction
        int r= row;
        for(int c=col;c>=0&&r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        
        //checking queen is safe in Upper right direction
        r= row;
        for(int c=col;c<board.length&&r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //checking queen is safe in lower left direction
        r= row;
        for(int c=col;c>=0&&r<board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //checking queen is safe in lower right direction
        r= row;
        for(int c=col;c<board.length&&r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }
}