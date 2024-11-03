package projectdemo;
import java.util.*;
public class BinarySearch {
	public static void main(String ... args) {
		Scanner sc=new Scanner(System.in);
			
		int arr[]= {1,3,4,5,7,8,9,11,23,45,67,89,91,94,96};
		
		System.out.println("Enter the element you want to search in the array: ");
		int search=sc.nextInt();
		
		int s=0,e=arr.length-1,mid;
		boolean flag=false;
		while(s<=e) {
			
			mid=(s+e)/2;
			
			if(arr[mid]==search) {
				System.out.println("The element found at index: "+mid);
				flag=true;
				break;
			}
			
			if(arr[mid]<search) {
				s=mid+1;
			}else {
				e=mid-1;
			} 
		}
		
		if(!flag) {
			
			System.out.println("Element not found");
		}
	}
	
}
