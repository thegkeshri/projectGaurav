package com.citi;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
//gauravKeshri
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
		al.add(i);
		}
		System.out.print("Before Replacement:");
		for(Integer j:al) {
			System.out.print(al.get(j)+" ");
		}
		
		al.set(1, 2);
		System.out.print("After Replacement:");
		for(Integer j:al) {
			System.out.print(al.get(j)+" ");
		}
	
		
		

	}

}
