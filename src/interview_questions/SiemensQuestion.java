package interview_questions;

public class SiemensQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Boggle board. N x N grid of random letters
	// Rules : Words can be formed by joining adjacent letters.
//	       : (Diagonal is considered adjacent as well.)
//	       : For example, on the board below. Letter T's adjacent letters are I, L, and A.

	C E P O    
	L H L E
	I L X H
	T A O H

	// Given this board. Here are some possible words (Notice how the same word can be found multiple times.)
	// Cell. (0, 0), {0, 1}, (1, 2), (2, 1)
	// Cell (again). (0, 0), (0, 1), (1, 0), (2, 2)
	// Hello: (1, 1), (0, 1), (1, 2), (2, 2), (3, 2)
	// ...

	/////////////////////////////////////////////////////////////////////////
	// Goal : Write a function to determine if a word exists on the board. 
	// You are given two parameters, Board and Word. You must return True or False.
	// Assumptions. You may re-use the same letter.

	// Sample input: The board given above. The word "Hello"
	// Result = True

	j++
	j = j + 1

	"o"
	"lo"
	"llo"
	"ello"
	"hello"



	// first constraint = word length = 2
	boolean wordExists(char[][] board, String word, int n) {
	    for(int i = 0; i<n-1; i++){
	        for(int j = 0; j<n-1; i++){
	            if(word.charAt(0)==board[i][j]){
	                 wordExistRecursive(board, word, n, i, j, 1);
	            }
	            
	        }
	    }
	    
	    return false;

	}

	private boolean wordExistRecursive(char[][] board, String word, int n, int i, int j, int wordPosition){
	                boolean found = false;
	                if(j+1 < n && word.charAt(wordPosition).equals(board[i][j+1])){
	                    wordPosition++;
	                    wordExistRecursive(board, word, n, i, j+1, wordPosition);
	                    found = true;

	                }else if(i +1  < n && word.charAt(wordPosition).equals(board[i+1][j])){
	                    wordExistRecursive(board, word, n, i+1, j);
	                    found = true;
	                }else if (j -1 > 0 && word.charAt(wordPosition).equals(board[i][j--])){
	                    wordExistRecursive(board, word, n, i, j--);
	                    found = true;
	                }else if (i > 0 && word.charAt(wordPosition).equals(board[i-1][j])){
	                    wordExistRecursive(board, word, n, i-1, j);
	                    found = true;
	                }else if (i+1 <n && j+1 < n && word.charAt(wordPosition).equals(board[i+1][j+1])){
	                    wordExistRecursive(board, word, n, i+1, j+1);
	                    found = true;
	                }else {
	                	return false;
	                }
	                
	                return found;
	}

}
