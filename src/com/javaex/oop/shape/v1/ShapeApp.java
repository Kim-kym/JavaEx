package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		//	추상 클래스는 부모로서만 존재, 직접 객체화할 수 없다 
		//		Shape s = new Shape();
		
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();

	}

}
