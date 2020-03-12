package practise;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int [] arr = {10, 7, 8, 9, 1, 5};
		
		//binary search 
		//1. array must be sorted.
		Arrays.sort(arr);
		int num=99;
		boolean binarySearch = binarySearch(arr, 0, arr.length-1, num);
		
		if (binarySearch) {
			System.out.println(num+" is present");
		} else {
			System.out.println(num+" is NOT present");
		}
	}

	private static boolean binarySearch(int[] arr, int low, int high, int num) {
		boolean flag = false;
		if (low<high) {
			
			int mid = (low+high)/2;
			
			if (arr[mid]>num) {
				return binarySearch(arr, low, mid, num);				
			} else if(arr[mid]<num) {
				mid=mid+1;
				return binarySearch(arr, mid, high, num);
			} else if(arr[mid]==num) {
				flag=true;						
			} 
		}
		return flag;
	}

}
