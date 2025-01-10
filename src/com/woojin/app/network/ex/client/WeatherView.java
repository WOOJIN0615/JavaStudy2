package com.woojin.app.network.ex.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.woojin.app.io.files.FileOutput;

public class WeatherView {
	public void view() {
		System.out.println("도시명\t기온\t습도\t날씨");
	}
	public void view (String message) {
		System.out.println(message);
	}
	
	public ArrayList<WeatherDTO> input() throws Exception {
		File file = new File("C:\\test\\sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		FileOutput fo = new FileOutput();
		String data = br.readLine();
		ArrayList<WeatherDTO> list = new ArrayList<>();
		
		data.replace('*', ',');
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while (st.hasMoreTokens()) {
			String d = st.nextToken();
			WeatherDTO w = new WeatherDTO();
			w.setCity(d);
			w.setTem(Integer.parseInt(d));
			w.setHuminity(Double.parseDouble(d));
			w.setStatus(d);
			
			list.add(w);
		}
		return null;
	}
	public void view (ArrayList<WeatherDTO> list) {
		this.view();
		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i).getCity()+"\t");
			System.out.println(list.get(i).getTem()+"\t");
			System.out.println(list.get(i).getHuminity()+"\t");
			System.out.println(list.get(i).getStatus()+"\t");
		}
	}

}
