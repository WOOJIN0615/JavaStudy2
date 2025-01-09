package com.woojin.app.utils.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		HashSet<Integer> hashSet = new HashSet<>(); 
		
		while (hashSet.size()<6) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
			
		}
//		int i = hashSet.size();
//		for (i=0; i<6; i++) {
//			int num = random.nextInt(45)+1;
//			boolean check = hashSet.add(num);
		   //if (!check) {
				//i--;
	       //}
//		}

		System.out.println(hashSet);

	}

}
