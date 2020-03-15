package practise;

public class LeftRotateArray {
	
	public static void main(String[] args) {
		
		int arr[] = {2,7,1,5,3,8};
		print(arr);
		System.out.println();		
		leftRotate(arr, 7);
		print(arr);
		
		System.out.println();
		
		int arr1[] = {2,7,1,5,3,8};
		print(arr1);
		System.out.println();		
		leftRotateOptimised(arr1, 3);
		print(arr1);
		
	}
	
	/**
	 * time complexity: O(n)
	 * space complexity: O(1)
	 * 
	 * @param arr
	 * @param d
	 */
	public static void leftRotateOptimised(int[] arr, int d){
		int n=arr.length;
		int gcd = gcd(n, d);
		int i, j, k, temp;
		
		for (i = 0; i < gcd; i++) {
			temp = arr[i];
			j=i;
			while (true) {
				k=j+d;
				if (k>=n) {
					k=k-n;
				}
				if (k==i) {
					break;
				}
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}		
	}
	
	public static int gcd(int a , int b) {
		if (b==0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	
	/**
	 * time complexity: O(n*d)
	 * space complexity: O(1)
	 * 
	 * @param arr
	 * @param d
	 */
	public static void leftRotate(int [] arr, int d) {
		if (d==arr.length) {
			return;
		}
		if(d>arr.length) {
			d=d%arr.length;
		}
		
		for (int i = 0; i < d; i++) {
			int temp = arr[0];
			int j;
			for (j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		
	}
	
	public static void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
