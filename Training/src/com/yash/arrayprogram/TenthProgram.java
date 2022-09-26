package com.yash.arrayprogram;
/*You are having array of numbers. Now you have to arrange numbers in array on the basis of the 
length of each number. Smallest number length will be first and so on.*/
public class TenthProgram {

	public static void main(String[] args) {

		int [] arr = new int [] {35,34,6,12,56};
		int temp = 0;

		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
		       System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++)
		{
		    for (int j = i+1; j < arr.length; j++)
		   {
		       if(arr[i] > arr[j]) {
		        temp = arr[i];
		        arr[i] = arr[j];
		         arr[j] = temp;
		       }
		      }
		}

		System.out.println();

		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++)
		{
	          	System.out.print(arr[i] + " ");
		}
		}
}
