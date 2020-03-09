package practise;

import java.util.Arrays;

/**
 * this program returns pair whose sum is equal to a given number.
 * 
 * @author xarvis
 *
 */
public class PairsWithGivenSum {
	
	public static void main(String[] args) {
		
		int arr[] = {-2,6,1,4,9,0,3,7};
		int num=4;
		
		print(arr);
		System.out.println();
		Arrays.sort(arr);
		print(arr);
		System.out.println();
		
		int left=0;
		int right=arr.length-1;
		
		while (left<right) {
			if (arr[left]+arr[right]==num) {
				System.out.println("("+arr[left]+", "+arr[right]+")");
				left++;
				right--;
			}  else if(arr[left]+arr[right]>num) {
				right--;
			} else {
				left++;
			}
		}
		print(arr);
		
		
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
