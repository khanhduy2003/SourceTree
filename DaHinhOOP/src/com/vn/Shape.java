package com.vn;

public class Shape {
	String color;

	double getArea() {
		return 0;
	}

	public String toString() {
		return ("Shape"+ color);
	}
}

class Rectangle extends Shape {
	int length;
	int width;
    String color;
	Rectangle(int length, int width,String color) {
		this.length = length;
		this.width = width;
	    this.color = color;
	}

	double getArea() {
		return length * width;
	}

	public String toString() {
		return ("Rectangle"+" "+ color);
	}
   public void processShape()
   {
	   System.out.println("Hinh Dang va Mau Sac : " + toString()+" "+"Dien Tich : " +getArea());
   }
}

class Triangle extends Shape {
	int base;
	int height;
    String color;
	Triangle(int base, int height,String color) {
		this.base = base;
		this.height = height;
		this.color= color;
	}

	double getArea() {
		return 0.5 * base * height;
	}

	public String toString() {
		return ("triangle"+" " +color);
	}
	public void processShape()
	   {
		   System.out.println("Hinh Dang va Mau sac : " + toString()+" "+ "Dien Tich : " +getArea());
	   }
}
