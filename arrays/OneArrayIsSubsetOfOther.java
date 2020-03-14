package practise;

public class OneArrayIsSubsetOfOther {
	
	public static void main(String[] args) {
		
		int arr1[] = {4,55,8};
		int arr2[] = {3,8,1,5,9,10,4};
		
		print(arr2);
		System.out.println();
		//sort array 2
		mergeSort(arr2, 0, arr2.length-1);
		print(arr2);
		System.out.println();
		
		int h = arr2.length-1;
		int l=0;
		
		//for each element of arr1 , do a binary search in array 2.
		for (int i = 0; i < arr1.length; i++) {
			if (!binarySearch(arr2, l, h, arr1[i])) {
				System.out.println("NO");
				break;				
			} 
		}
		
	}
	
	public static boolean binarySearch(int [] arr, int l, int h, int num) {
		boolean flag=false;
		if (l<=h) {
			int mid = (l+h)/2;
			
			if (num<arr[mid]) {
				//search in left of sorted array
				return binarySearch(arr, l, mid, num);
			} else if(num>arr[mid]) {
				mid=mid+1;
				return binarySearch(arr, mid, h, num);
			} else if(num==arr[mid]){
				return !flag;
			}					
		}
		return flag;
	}
	
	public static void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void mergeSort(int arr[], int l, int r) {
		if (l<r) {
			int m=(l+r)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);			
		}
	}
	
	public static void merge(int arr[], int l, int m, int r) {
		//get size of left and right subarrays
		int n1=m-l+1;
		int n2 = r-m;
		
		//get two temp arrays to store elements
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//insert elements into these subarrays
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l+i];
		}
		
		for (int i = 0; i < n2; i++) {
			R[i] = arr[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while (i<n1 && j<n2) {
			if (L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			} else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while (i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while (j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}

}
