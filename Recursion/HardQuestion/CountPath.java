package HardQuestion;
import java.util.*;

public class CountPath {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row n: ");
        int n = sc.nextInt();
        System.out.println("Enter the row m: ");
        int m = sc.nextInt();

        int a = calculatePath(0,0,n,m);
        System.out.println(a);
    }

    private static int calculatePath(int i, int j, int n, int m) {
        
        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }

        
        int movingDownPath= calculatePath(i+1,j,n,m);
        int movingRightPath= calculatePath(i,j+1,n,m);

        return movingDownPath+movingRightPath;
    }
}
