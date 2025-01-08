package com.woojin.app.utils.collections;

import java.util.ArrayList;

public class ListMain1 {

	public static void main(String[] args) {
		//ArrayList
		ArrayList ar = new ArrayList();
		
		ar.add(1); //AutoBoxing
		ar.add('2');
		ar.add("3");
		ar.add(true);
		
		ar.add(1, "hello"); //해당 index에 끼워넣고 나머지는 한칸씩 밀림.
		
		ar.set(1, "world"); //해당 index의 값을 수정.
		
		ar.remove(1); //해당 index의 값을 삭제.
		
		boolean check = ar.contains(1);
		
		//ar.clear(); //모든 요소 삭제.
		
		//System.out.println(ar.get(0));
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println(check);
		
		//별개
		//향상된 for문
		int [] nums = {2,3,4,5};
		for (int i : nums) {
			System.out.println(i);
		}

	}

}
