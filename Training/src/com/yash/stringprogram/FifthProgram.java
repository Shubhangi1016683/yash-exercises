package com.yash.stringprogram;
/*WAP in which name of person is passed to main function and you have arrange all names by 
their length.*/
import java.util.Scanner;
public class FifthProgram {

	public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many names you want to be enter: ");
        int noOfNames = sc.nextInt();
        String[] names = new String[noOfNames];
        System.out.println("Please enter names: ");
        for (int i = 0; i < noOfNames; i++) {
        	names[i] = sc.next();
        }



       for (int i = 0; i < names.length; i++) {
           for (int j = i + 1; j < names.length; j++) {
                if (names[i].toCharArray().length > names[j].toCharArray().length) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }



           }
        }
        for(String sortedNames : names) {
            System.out.println("Sorted names by length: "+sortedNames);
        }
    }
        
        
        
        

}
