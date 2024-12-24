package org.collectionprog;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		//TO store and display objects via ArrayList
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator itr = al.iterator();
		
		System.out.println("To display objects of List:");
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.print(obj+" ");
		}
		

	}

}
