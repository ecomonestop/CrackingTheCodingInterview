package main;

public class Example12CountAllPermutationsOfAStringBigO {

	public static void main(String[] args) {
		permutation("Tom");
	}
	
	public static void permutation(String str)
	{
		permutation(str,"");
	}

	private static void permutation(String str, String prefix) {
		if(str.length()==0){
			System.out.print(prefix);
		}else{
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				permutation(rem, prefix + str.charAt(i));
				
			}
		}
		
	}

}
