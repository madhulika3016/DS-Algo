package com.gl.mergeSort;

import java.util.Scanner;

public class Main {

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
		
		MergeSort mergeSort=new MergeSort();
		mergeSort.sort(array, 0, array.length-1);
		
		System.out.println("The Array after Sorting");
		for(int i:array)
		{
			System.out.print(i+"  ");
		}

	}

}
