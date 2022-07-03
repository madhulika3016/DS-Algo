package com.gl.merge.binarySearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the key ");
		Scanner sc=new Scanner(System.in);
		
		int array[]= {12,13,14,9,10,11};
		int key=sc.nextInt();
		
		BinarySearch binarySearch=new BinarySearch();
		int index=binarySearch.pivotedBinarySearch(array, array.length, key);
		System.out.println("Key is present at "+index);
		sc.close();
		

	}

}
