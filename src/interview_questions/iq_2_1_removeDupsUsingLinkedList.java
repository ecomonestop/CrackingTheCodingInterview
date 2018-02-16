package interview_questions;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class iq_2_1_removeDupsUsingLinkedList {

	public static void main(String[] args) {
		

	}
	
	public static void removeDupsFromLinkedList(LinkedList<Integer> ll){		
		LinkedList<Integer> newLL = new LinkedList<>(ll.stream()
				.collect(Collectors.toSet()));
		
	}
	
	public static void rotateLeft(int[] a, int rotates, int size){
		int[] temp = {a[0], a[1]};
		int i = temp.length;
	}

}
