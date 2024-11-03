package projectdemo;

import java.util.*;

public class InsertionSortDemo {

    public static void insertionSort(int a[]) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println("The Sorted array is : ");
        for (int ele : a) {
            System.out.print(ele + " ");
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

        insertionSort(a);
    }
}
