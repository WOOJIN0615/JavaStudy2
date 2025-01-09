package com.woojin.app.utils.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		//List, Set -> Collection이 부모
		//Map
		HashMap<String, Integer> map = new HashMap<>();
		//추가 put
		map.put("k1", 23);
		map.put("k2", 24);
		map.put("k3", 22);
		
		map.put("k2", 24);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("k1"));
		System.out.println(map.containsKey("k1"));
		System.out.println(map.get("k4"));
		
		Iterator<String> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			String k = keys.next();
			Integer v = map.get(k);
			System.out.println("Key : " + k + " " + "Value : " + v);
		}
		
	}

}
