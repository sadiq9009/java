package com.Sadiq;

public class StudD {

	long id;
	String name;
	int age;
	double graduate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGraduate() {
		return graduate;
	}
	public void setGraduate(double graduate) {
		this.graduate = graduate;
	}
	@Override
	public String toString() {
		return "StudD [id=" + id + ", name=" + name + ", age=" + age + ", graduate=" + graduate + "]";
	}
	
	
}
