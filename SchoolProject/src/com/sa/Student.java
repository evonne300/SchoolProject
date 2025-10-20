package com.sa;

public class Student {
	
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String show()
	{
		return "名:"+name;
	}

	public String skill() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
