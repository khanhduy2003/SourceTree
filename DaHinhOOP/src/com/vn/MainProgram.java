package com.vn;

public class MainProgram {
	public static void main(String args[]) {
		Rectangle HinhChuNhat = new Rectangle(123, 456,"Red");
		HinhChuNhat.getArea();
		HinhChuNhat.toString();
		Triangle HinhTamGiac = new Triangle(567, 789,"Blue");
		HinhTamGiac.getArea();
		HinhTamGiac.toString();
	    HinhChuNhat.processShape();
	    HinhTamGiac.processShape();
	}
}
