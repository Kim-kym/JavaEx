package com.javaex.api.objetlass.ex02;

//	object ex01 
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		//	객체 내부 데이터의 문자열 출력 
		return "Point(" + x + ", " + y + ")"; 
		
	}
	
	@Override 
	public boolean equals(Object obj) {
		//	obj가 point ?
		if (obj instanceof Point) {
			//	다운캐스팅
			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	

}
