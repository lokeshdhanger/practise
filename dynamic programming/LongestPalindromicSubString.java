

/**
 * time complexity: O(n^2)
 * space complexity: O(n^2)
 * 
 * @author xarvis
 *
 */
public class LongestPalindromicSubString {
	
	public static void main(String[] args) {
		
		
		longestPalindromicSubString("banana");
		longestPalindromicSubString("allu");
		longestPalindromicSubString("sonos");
		
	}
	
	public static int longestPalindromicSubString(String str){
		
		int n = str.length();
		boolean t[][] = new boolean[n][n];
		
		int maxLength = 1; //all substring of length 1 are palindrome.
		
		for (int i = 0; i < n; ++i) {
			t[i][i]=true;
		}
		
		int start=0;
		//substring with length equal to 2
		for (int i = 0; i < n-1; ++i) {
			if (str.charAt(i)==str.charAt(i+1)) {
				t[i][i+1]=true;
				start=i;
				maxLength=2;
			}
		}
		
		//substring with length more than or equal to 3
		for (int k= 3; k<= n; ++k) {
			for (int i = 0; i < n-k+1; ++i) {
				int j=i+k-1;  //end index
				
				if (t[i+1][j-1] && (str.charAt(i)==str.charAt(j))) {
					t[i][j]=true;
					
					if (k>maxLength) {
						start=i;
						maxLength=k;
					}
				}
			}
		}
				
		String substring = str.substring(start, start+maxLength);
		System.out.println(substring);
		System.out.println(substring.length());
		
		return maxLength;
		
	}

}
