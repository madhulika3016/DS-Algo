package com.gl.merge.binarySearch;

import java.util.Scanner;

import com.gl.arrayRotation.ArrayRotation;
import com.gl.mergeSort.MergeSort;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		System.out.println("Enter the Elements");
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Please enter the key to search");
		int key=sc.nextInt();
		
		MergeSort mergesort=new MergeSort();
		mergesort.sort(array, 0, array.length-1);
		System.out.println("The Array after Sorting");
		for(int i:array)
		{
			System.out.print(i+"  ");
		}
		
		int midElement =array.length/2;
		System.out.println(midElement);
		ArrayRotation arrayRotation=new ArrayRotation();
		arrayRotation.leftRotate(array, midElement, array.length);
		System.out.println("Array After Rotation");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+"  ");
		} 
		
		BinarySearch binarySearch=new BinarySearch();
		int index=binarySearch.pivotedBinarySearch(array, array.length, key);
		System.out.println("Key is present at "+index);
		sc.close();

	}

}
