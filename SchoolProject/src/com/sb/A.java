package com.sb;

import com.sa.Student;
import com.sa.Student2;

/**
 * @version 1版
 * @author evonne
 * 
 */

public class A extends Student implements Student2
{

	private int chi;
	
	/**
	 * 
	 * @param name 輸入姓名
	 * @param chi 輸入中文分數
	 * 
	 * 
	 * 例如:
	 * A a=new A("teacher,100)
	 */
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	
	/**
	 * 
	 * @return 國文成績
	 */
	public int getChi() {
	return chi;
	}
	
	/**
	 * 
	 * @param chi 取的國文成績
	 */
	public void setChi(int chi) {
	this.chi = chi;
	}
	
	/**
	 * @return輸出A skill
	 */
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+"\t國文:"+chi;
	}
	@Override
	/**
	 * @return 123123123
	 */
	public String skill() {
		// TODO Auto-generated method stub
		return "A skill";
	}
	


}
