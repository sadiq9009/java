package com.Sadiq;

import java.util.ArrayList;
import java.util.List;

public class MyStud {
	
public static void main(String[] args) {
	
	StudD D = new StudD();
	
	D.setId(87435874L);
	D.setName("Sadiq");
	D.setAge(32);
	D.setGraduate(587405879d);
	
	List<StudD> Data = new ArrayList<>();
	
	Data.forEach(t->{
		System.out.println(t);
	});
	
}
}
