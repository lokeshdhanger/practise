package practise;

public class TrappingRainWater {
	
	public static void main(String[] args) {
		
		int arr[] = {3,0,0,2,0,4};
		
		int findWater = findWater(arr);
		System.out.println(findWater);
		System.out.println();
		
		//space optimised solution
		int ans = findWaterOptimised(arr, arr.length);
		System.out.println(ans);
		
		
		int arr1[] = {4,0,0,3,2,0};
		int ans1 = findWaterOptimised(arr1, arr1.length);
		System.out.println(ans1);
	}
	
	
	private static int findWaterOptimised(int[] arr, int length) {
		
		int prev_index=0;
		int prev=arr[0];
		
		int temp=0;
		int water = 0;
		
		int size=length-1;
		
		for (int i = 1; i <= size; i++) {
			
			if (arr[i]>prev) {
				prev = arr[i];
				prev_index=i;
				temp=0;
			} else {
				water += prev-arr[i];
				temp += prev - arr[i];
			}
		}
		
		
		if (prev_index<size) {
			water-=temp;
			prev=arr[size];
			
			for (int i = size; i >= prev_index; i--) {
				if (arr[i]>=prev) {
					prev=arr[i];
				} else {
					water+=prev-arr[i];
				}
			}
		}
		
		return water;
	}


	/*
	 * time complexity: O(n)
	 * space complexity: O(n)
	 * 
	 */
	public static int findWater(int []arr) {
		
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		int water = 0;
		
		left[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
		right[arr.length-1]=arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			water+=Math.min(left[i], right[i])-arr[i];
		}
		
		
		return water;
	}

}
