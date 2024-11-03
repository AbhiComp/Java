package projectdemo;
import java.util.*;
public class MergeSortDemo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter in the array: ");
		
		int size=s.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements you want to enter in the array: ");
		
		for(int i=0;i<=size-1;i++) {
			arr[i]=s.nextInt();
		}
		
		mergeSort(arr,0,size-1);
		
		for(int x: arr)
		System.out.print(x +" ");
		

	}
	
	static void mergeSort(int arr[],int low,int high){
		
		if(low==high) {
			return;
		}
		
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
				
	}
	
	
	static void merge(int [] arr,int low,int mid,int high) {
		
		Vector<Integer> vec=new Vector<Integer>();
		
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
			vec.add(arr[left]);
			left++;
			}else {
			vec.add(arr[right]);
			right++;
			}
		}
		
		while(right<=high) {
			vec.add(arr[right]);
			right++;
			}
				
		while(left<=mid) {
			vec.add(arr[left]);
			left++;
		}
		
		for(int i=low;i<=high;i++) {
			arr[i]=vec.get(i-low);
		}
		
		
	 }
	
	
}

