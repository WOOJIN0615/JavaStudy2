package com.woojin.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain2 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setName("winter");
		m1.setAge(23);
		
		Member m2 = new Member();
		m2.setName("iu");
		m2.setAge(27);
		
		ArrayList<Member> am = new ArrayList<>();
		
		am.add(m1);
		am.add(m2);
		
		HashSet<Member> hm = new HashSet<>();
		
		hm.add(m2);
		hm.add(m1);
		
		
		Member m3 = new Member();
		m3.setName("winter");
		m3.setAge(23);
		
		am.add(m3);
		hm.add(m3);
		
		System.out.println(am.size());
		System.out.println(hm.size());
		
		System.out.println(am.contains("winter"));

	}

}
