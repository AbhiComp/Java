package projectdemo;

import java.util.*;

public class SelectionSortDemo {
	
	
	public static void selectionSort(int a[]) {
	    
		int n = a.length;
	    	    
	    for (int i = 0; i < n - 1; i++) {
	     
	        int min = i;
	        for (int j = i + 1; j < n; j++) {
	            if (a[j] < a[min]) {
	                min = j;
	            }
	        }

	        int temp = a[min];
	        a[min] = a[i];
	        a[i] = temp;
	    }
	    
	    System.out.println("The Sorted array is : ");
		
	    for(int ele : a) {
			System.out.print(ele+" ");
	    }
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter in the array: ");
		
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements you want to enter in the array: ");
		
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		
		selectionSort(a);
		

	}

}

