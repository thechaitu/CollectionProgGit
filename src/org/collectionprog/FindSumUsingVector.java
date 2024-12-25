package org.collectionprog;

import java.util.*;

//Q. WAP to create Vector and store 5 values in it and calculate sum of all values.
public class FindSumUsingVector {

	public static void main(String[] args) {
		Vector vc = new Vector();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Add 5 values to store in vector");
		for(int i=0;i<5;i++)
		{
			int val = sc.nextInt();
			vc.addElement(val);
		}
		int sum=0;
		for(int i = 0; i<5;i++) {
			Object obj = vc.elementAt(i);
			sum += (int)obj; 
		}
		System.out.println("Sum of vector:"+sum);
		
		
	}

}
