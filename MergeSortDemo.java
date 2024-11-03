package projectdemo;

import java.util.*;

public class MergeSortDemo {

    public static void mergeSort(int a[]) {
        if (a.length < 2) {
            return; 
        }
        
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        mergeSort(left);  
        mergeSort(right); 
        merge(a, left, right); 
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

   
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

       
        while (i < left.length) {
            result[k++] = left[i++];
        }

        
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to enter in the array: ");
        int size = s.nextInt();
        
        int a[] = new int[size];
        
        System.out.println("Enter the elements you want to enter in the array: ");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        mergeSort(a); 
        
        System.out.println("The Sorted array is: ");
        for (int ele : a) {
            System.out.print(ele + " "); 
        }
    }
}
