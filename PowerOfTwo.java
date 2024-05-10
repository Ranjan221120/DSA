import java.util.*;

class PowerOfTwo{
    public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		if(isPowerTwo(n)){
		 System.out.println(n+" is Power of 2");
		}else{
		 System.out.println(n+" is not Power of 2");
		}
	}

	/* static boolean isPowerTwo(int n){
			while(n%2==0){
				n/=2;
				if(n==1)return true;
			  }
		return false;
	} */

	static boolean isPowerTwo(int n){		
	return (n > 0) && ((n & (n - 1)) == 0);
}
} 