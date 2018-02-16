package interview_questions;

import java.util.Arrays;

public class InterviewQuestion_1_2_CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	/**
	 * Firstly, we should clarify the problem.  We should ask if the permutation needs to be case sensitive? 
	 * Also, does white space matter?
	 * 
	 * In the below solution, we assume both case sensitive and white space does matter.
	 * 
	 * For a String to be a permutation of another String then they need to be the same length.
	 * A permutation is just a reordering of the items (this case characters) of a set.
	 * Therefore, if we sort both Strings, then they should equal each other if its a permutation.
	 * 
	 * Below is not a runtime optimized solution.  It runs in O(N log N).
	 * 
	 * There is a solution that is O(N)
	 * 
	 * 
	 * @param myStr
	 * @param perStr
	 * @return
	 */
	public static boolean isPermutation(String myStr, String perStr){
		if(myStr.length()!=perStr.length()){
			return false;
		}
		return sortStr(myStr).equals(sortStr(perStr));
	}

	private static String sortStr(String myStr) {
		char[] sortMe = myStr.toCharArray();
		Arrays.sort(sortMe);
		return sortMe.toString();
	}
	
	
	/**
	 * Based on the definition of permutations i.e. two words that have the same character count e.g. abca  and bcaa have the same character count, we know its a permutation
	 * Therefore, we can add and subtract 1 at each character and should end with 0 if its a permutation.  
	 * A char can be translated back to a number, so we use it as the index of our letters
	 * We then add 1 to that index as the value.
	 * We do the same thing in reverse subtracting 1 at each charters index
	 * If we get a negative number, we know that its not a permutation. (we added everything in the first step of the first string, so there is no getting more positive)
	 * if at the end no numbers are negative, we know that its a permutation (e.g. if its a new char then the value would be -1 and its the same legnth
	 * 
	 * 
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isStringAPerm(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		
		int[] letters = new int[128];//Assumes ASCII 
		for(int i = 0; i<s.length(); i++){
			//a char can be converted to a int because its all bits and bytes at the end of the day.  char is smaller than a int.
			letters[s.charAt(i)]++;
		}
		
		for(int i = 0; i<t.length(); i++){
			letters[t.charAt(i)]--;
			if(letters[t.charAt(i)]<0){
				return false;
			}
		}
		
		return true;
	}

}
