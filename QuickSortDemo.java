package projectdemo;

import java.util.*;

public class QuickSortDemo {

    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

     
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
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

        quickSort(a, 0, a.length - 1);

        System.out.println("The Sorted array is : ");
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
