package Sorting;

import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int n = sc.nextInt();

        System.out.println("Enter the array");

        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        quickSort(ar, 0, n-1);

        System.out.println("-------------------");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }

    private static void quickSort(int[] ar, int low, int high) {

        if (low < high) {
            int pIdx = partition(ar, low, high);

            quickSort(ar, low, pIdx-1);
            quickSort(ar, pIdx + 1, high);
        }
    }

    private static int partition(int[] ar, int low, int high) {
        int i = low-1;
        int pivot = ar[high];

        for(int j=low;j<high;j++){
            if(ar[j]<pivot){
                i++;
                int temp= ar[i];
                ar[i]=ar[j];
                ar[j]= temp;
            }
        }

        i++;
        int temp= ar[i];
        ar[i]=ar[high];
        ar[high]= temp;
        return i;
    }
}
