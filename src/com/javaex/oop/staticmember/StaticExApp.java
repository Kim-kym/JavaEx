package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		//	첫 번째 인스턴스가 생성되기 전에 클래스가 먼저 메모리에 로드 
		// 	Static 블록에서 스태틱 영역 초기화 -> 생성자 호출
		StaticEx s1 = new StaticEx();	//	인스턴스 생성 
		System.out.println("refCount:" + StaticEx.refCount);	//	스태틱 영역에 있는 변수이기 때문에 new 선언하지 않아도 불러올 수 있다 
		
		StaticEx s2 = new StaticEx();	//	인스턴스 생성 
		System.out.println("refCount:" + StaticEx.refCount);
		
		//	s1 참조 해제 
		s1 = null;
		
		System.gc();	//	가비지 컬렉터 호출 -> 직접 호출은 사양하자 
		try {
			Thread.sleep(3000); //	3초간 대기
			System.out.println("refCount:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
		
		System.out.println(Calc.PI);
		System.out.println(Calc.getSum(1, 2, 3, 4, 5));
		
	}

}
