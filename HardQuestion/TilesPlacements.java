package HardQuestion;
import java.util.*;

public class TilesPlacements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n(height): ");
        int n = sc.nextInt(); 
        System.out.println("Enter the m(width): ");
        int m = sc.nextInt(); 
        int a = waysOfTileInFloor(n,m);
        System.out.println(a);
    }

    private static int waysOfTileInFloor(int n, int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int horizontalPlacement=waysOfTileInFloor(n-m,m);
        int verticalPlacement=waysOfTileInFloor(n-1,m);
        return horizontalPlacement+verticalPlacement;


    }
}
