package com.Sadiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyData {

	public static void main(String[] args) {
		
		StudD D = new StudD();
		
		D.setId(47847887L);
		D.setName("Sadiq");
		D.setAge(23);
		D.setGraduate(374858D);
		
       StudD D1 = new StudD();
		
		D1.setId(47847887L);
		D1.setName("Saad");
		D1.setAge(26);
		D1.setGraduate(74858D);
		
      StudD D2 = new StudD();
		
		D2.setId(47847L);
		D2.setName("Shaik");
		D2.setAge(29);
		D2.setGraduate(485843D);
		
		List<StudD> Data = new ArrayList<>();
		
//		List<StudD> Data = Arrays.asList();
		
		Data.add(D);
		Data.add(D1);
		Data.add(D2);
		
//		Data.forEach(t->{
//			System.out.println(t);
//		});
		
		System.out.println(Data.stream().count());

	}

}
