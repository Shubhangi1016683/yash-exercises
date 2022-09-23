package com.yash.stringprogram;

import java.util.Scanner;

public class ThirdProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();   
        
            char strArr[] = str.toCharArray();
            for (int i = 0; i < strArr.length; i++)
            {
                
                if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                    strArr[i] = (char) ((int) strArr[i] - 32);
                }
                else if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                    strArr[i] = (char) ((int) strArr[i] + 32);
                }
                
            }
            System.out.print("Upper case string is : ");
            
            for (int i = 0; i < strArr.length; i++)
            {
                System.out.print(strArr[i]);
            }

	}

}
