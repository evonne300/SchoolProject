package com;

public class Order {
	private String name;
	private int ruler;
	private int pen;
	private int sum;
	public Order(String name, int ruler, int pen) {
		super();
		this.name = name;
		this.ruler = ruler;
		this.pen = pen;
		this.sum =ruler*29+pen*30;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuler() {
		return ruler;
	}
	public void setRuler(int ruler) {
		this.ruler = ruler;
	}
	public int getPen() {
		return pen;
	}
	public void setPen(int pen) {
		this.pen = pen;
	}
	public int getSum() {
		return sum;
	}
	
}
