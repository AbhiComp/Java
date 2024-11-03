package projectdemo;

import java.util.*;

public class BubbleSortDemo {
	
	
	
	public static void bubbleSort(int[] a) {
		
		int len=a.length;
		for(int i=0;i<len;i++) {
			
			for(int j=0;j<len-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					
					a[j]=a[j+1];
					
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The Sorted Array is : ");
		for(int ele : a) {
			System.out.print(ele+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter in the array: ");
		
		int size=s.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements you want to enter in the array: ");
		
		for(int i=0;i<size-1;i++) {
			arr[i]=s.nextInt();
		}
		
		bubbleSort(arr);
		

	}

}
