package board;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오름차순 
		int arr[] = {4,23,33,15,17,19};		 
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println("["+i+"]");
		}
		
		String arr2[] = {"apple", "orange","banana", "pear","peach","melon"}; 
		Arrays.sort(arr);
		
		for (String i : arr2) {
			System.out.println("["+i+"]");
		}
		
		// 내림차순
		
		Integer arr3[] = {4,23,33,15,17,19};
		Arrays.Test1(arr3,Collections.reverseOrder());
		
		for (int i : arr) {
			System.out.println("["+i+"]");
		}
		
	
		
	}

}
