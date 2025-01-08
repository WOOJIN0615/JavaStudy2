package com.woojin.app.collections;

import java.util.Scanner;

public class StudyStack {
	
	private int [] ar;
	private int [] newar;
	
	public int pop() {
		//ar배열의 0번 값을 리턴하고, 
		//0번의 값을 삭제
		int num=ar[0];
		int[] newar = new int[ar.length-1];
		for (int i=0; i<newar.length; i++) {
			newar[i]=ar[i+1];
		}
		newar=ar;
		return num;
		
	}
	
	public void set(int num) {
		//ar이 null이면 1칸 배열을 만들고 num을 대입
		//아니면 num의 값과 ar의 값들중 일치하는것이 있으면 대입X
		//일치하는게 없으면 ar의 배열에 하나 더 큰 배열을 생성하고
		//마지막에 num을 대입
		if (ar==null) {
			ar = new int [1];
		}for (int i=0; i<ar.length; i++) {
			if (ar[i]==num) {
				num=-1;
			}else {
				int[] newar = new int[ar.length+1];
				newar[i]=num;
				for (int j=0; j<ar.length; j++) {
					newar[j+1]=ar[j];
				}
				newar[i]=num;
				ar=newar;
			}
		}
	}
	
	public void add(int num) {
		//ar이 null이면 1칸 배열을 만들고 num을 대입
		//ar이 null이 아니면 
		//ar의 배열에 하나 더 큰 배열을 생성하고
		//ex) 12, 34 -> num, 12, 34
		//num을 0번 index에 대입
		if (ar==null) {
			ar = new int[1];
			ar[0]=num;
		}else{
			int[] newar = new int[ar.length+1];
			newar[0]=num;
			for (int i=0; i<ar.length; i++) {
				newar[i+1]=ar[i];
			}
			newar[0]=num;
			ar = newar;
		} 
	}
	
	public void info() {
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
