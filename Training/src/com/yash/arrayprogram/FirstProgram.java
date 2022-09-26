package com.yash.arrayprogram;

/*WAP to find third minimum number from list of numbers*/
import java.util.Scanner;

public class FirstProgram {
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elemnts");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j]) {
	                    System.out.println("Duplicates Elements Are :" + a[i]);
	                    a[j] = a[size - 1];
	                    size--;
	                }
			}
		}
		int i;
		for( i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		System.out.println("third minimum number :"+a[2]);
	}

}
