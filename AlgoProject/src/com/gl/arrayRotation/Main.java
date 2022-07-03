package com.gl.arrayRotation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the size of Array");
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		System.out.println("Enter the Elements in Sorted Order");
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
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
		
		sc.close();

	}

}
