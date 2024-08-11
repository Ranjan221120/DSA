package Sorting;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        System.out.println("Enter the Array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == arr.length) {
            divide(arr, 0, n - 1);
            System.out.println("-------------");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("You haven't enter all elements");
        }
    }

    private static void divide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); //it divided the half left side of array
        divide(arr, mid + 1, ei);//it divided the other half side of array
        conquer(arr, si, mid, ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {

        int mergedArray[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // It compare 2 array which is divided equally by indexing
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArray[x++] = arr[idx1++];
            } else {
                mergedArray[x++] = arr[idx2++];
            }
        }

        // when 1st half array already sorted no need comparison only add on merge array
        // at start
        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }

        // when 2nd half array already sorted no need comparison only add on merge array
        // at end
        while (idx2 <= ei) {
            mergedArray[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < mergedArray.length; j++, i++) {
            arr[j] = mergedArray[i];
        }

    }

}
