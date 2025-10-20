package com;

import com.sb.A;

public class test {
	
	public static void main(String[]args) {
		Order o=new Order("a",1,2);
		System.out.println("名:"+o.getName()+
				"\n尺:"+o.getRuler()+"把"+
				"\n筆:"+o.getPen()+"隻"+
				"\n共:"+o.getSum()+"元");
		
		A a=new A("123",70);
		
	}

}
