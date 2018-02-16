package interview_questions;

import java.util.HashSet;
import java.util.Set;

public class InterviewQuestion_1_1_Is_Unique {

	public static void main(String[] args) {
		boolean b = isStringUniqueChars("hel1231");
		boolean bb = isStringUniqueCharsWithNoExtraDS("hel");

	}

	private static boolean isStringUniqueCharsWithNoExtraDS(String s) {
		for (int i=0; i<s.length(); i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Space complexity of N and Time Complexity of N where N is the length of the String s
	 * 
	 * This could have been done in a more optimal runtime / space complexity way
	 * First we should ask if we are using ASCII or Unicode String.  This tells us the character size and shows intention to detail
	 * Next, we cound of created an array of booleans at a fixed (constant) size.  itterate over each character updating the array to true if the char was seen already
	 * return false if you see it twice, at the end of the loop return true bc no matches were found.  You could argue that the Space / time complexity of this algorithm
	 * is O(1) because your storing your booleans in a fixed array size (constant) and loop thru the String which is also a fixed sized bc of the known ASCII / Unicode size
	 * 
	 *
	 * 
	 * 
	 * @param s
	 * @return
	 */
	private static boolean isStringUniqueChars(String s) {
		Set<Character> mySet = new HashSet<>();
		for (char c : s.toCharArray()) {
			if(mySet.contains(c))
				return false;
			mySet.add(c);
		}
		return true;
	}

}
