
/**
 * time complexity: O(n^2)
 * space complexity:: O(1)
 * 
 * @author xarvis
 *
 */
public class LongestPalindromicSubstringPart2 {
	
	public static void main(String[] args) {
	
		longestpalindromicSubString("banana");
		longestpalindromicSubString("abcba");
		longestpalindromicSubString("anna");
		
		
	}
	
	public static void longestpalindromicSubString(String str) {
		int len = str.length();
		int low, high;
		int start=0;
		int maxLength=1;
		
		for (int i = 0; i < len; i++) {
			
			//find longest even length palindrome with center points as
			//i-1 and i.
			low=i-1;
			high=i;
			
			while (low>=0 && high<len && (str.charAt(low)==str.charAt(high))) {				
				if (high-low+1 > maxLength) {
					start=low;
					maxLength=high-low+1;
				}
				--low;
				++high;
			}
			
			
			//find longest even length palindrome with center points as
			//i.
			low=i-1;
			high=i+1;
			while (low>=0 && high<len && (str.charAt(low)==str.charAt(high))) {
				if (high-low+1 > maxLength) {
					start=low;
					maxLength=high-low+1;
				}
				--low;
				++high;
			}			
		}
		
		System.out.println(str.substring(start, start+maxLength));
		
	}

}
