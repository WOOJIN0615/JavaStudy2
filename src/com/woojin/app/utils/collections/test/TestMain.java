package com.woojin.app.utils.collections.test;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		Medic medic = new Medic();
		Marine marine = new Marine();
		Marine marine2 = new Marine();
		Wraith wraith = new Wraith();
		
		// <? extends T> T타입과 T타입을 상속받는 자손 클래스 타입만을 사용할 수 있음. 
		// <? super T> T타입과 T타입이 상속받은 조상 클래스 타입만을 사용할 수 있음.
		
		ArrayList<? super GroundUnit> ar = new ArrayList<>();
		ar.add(marine);
		ar.add(marine2);
		
		ArrayList<GroundUnit> ar2 = new ArrayList<>();
		ar.add(marine2);
		ar.add(medic);
		
		
		UnitView uv = new UnitView();
		uv.view(ar2);
		uv.view2(ar);
		
		
		
		

	}

}
