package practise;

public class SortBinaryArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,0,0,1,1,1,0,1,0,0};
		
		print(arr1);
		System.out.println();
		
		//method 1
		// time complexity: O(n)
		
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]==0) {
				++count;
			}
		}
		
		for (int i = 0; i < count; i++) {
			arr1[i]=0;
		}
		
		for (int i = count; i < arr1.length; i++) {
			arr1[i]=1;
		}
		
		print(arr1);
		System.out.println("\n\n");
		
		
		//method 2
		int arr2[] = {0,1,0,1,1,1,0,1,0,1,};
		print(arr2);
		int first=0;
		int last=arr2.length-1;
		while (first<last) {
			if (arr2[first]>=arr2[last]) {
				int temp=arr2[first];
				arr2[first]=arr2[last];
				arr2[last]=temp;
				first++;
			} else {
				last--;
			}
		}
		System.out.println();
		print(arr2);
		
		
		
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
