package com.woojin.app.utils.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(3.12);
		//타입이 안전하지 않다
		if (ar.get(0) instanceof Integer) {
		int n = (Integer)ar.get(0);
		}else if (ar.get(0) instanceof Double) {
			double d = (Double)ar.get(0);
		}
	}

}
