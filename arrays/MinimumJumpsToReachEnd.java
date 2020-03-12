package practise;


/**
 * calculate minimum number of jumps one must make to reach the end of the array.
 * the number of jumps at a time are equal to the value at index of the array.
 * if value at any index is 0, it can't move.
 * 
 * @author xarvis
 *
 */
public class MinimumJumpsToReachEnd {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		int arr1[]= {0,1,2,3,5};
		int arr2[] = {5,5,0,2,2,0,1,0,3,2};
		int arr3[]= {5,5,0,4,1,4,5,5,3,2};
		int arr4[]= {1,4,5,1,2,5,1,2,3,2,3,3,2,5,0,5,3,1,3,0};
		int arr5[]= {2,2,9,4,9,1,2,3,4,5};
		int arr6[]= {1,0,2,3,5};
		int arr7[]= {2,1,0,3,5};
		
		System.out.println("arr: "+ minimumJumps(arr));
		System.out.println("arr1: "+minimumJumps(arr1));
		System.out.println("arr2: "+minimumJumps(arr2));
		System.out.println("arr3: "+minimumJumps(arr3));
		System.out.println("arr4: "+minimumJumps(arr4));
		System.out.println("arr5: "+minimumJumps(arr5));
		System.out.println("arr6: "+minimumJumps(arr6));
		System.out.println("arr7: "+minimumJumps(arr7));
		
		
		
	}
	
	public static int minimumJumps(int [] arr) {
		
		int jump=1;
		
		if (arr.length<=1) {
			return 0; // only one element , no jumps required.
		}
		
		if (arr[0]==0) {
			return -1; // very first element is zero, can't move.
		}
		
		int step = arr[0];
		int maxReach = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (i==(arr.length-1)) {
				return jump;  //only 2 elements present in array.
			}
			
			maxReach = Math.max(maxReach, i+arr[i]);
			step--;	
			
			if (step==0) {
				jump++;
				if (i>maxReach) {
					return -1;
				}
				step=maxReach-1;
			}
		}
		
		
		
		return -1;
	}

}
