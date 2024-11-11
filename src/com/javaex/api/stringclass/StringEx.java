package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();
	}
	
	private static void stringBasic() {
		String s1 = "Java"; 	//소스코드에 직접 명시된 데이터, = 리터럴 
		String s2 = new String("Java");
		String s3;
		s3 = "Java";	//	리터럴
		
		System.out.println(s1 == s2);	//	주소 비교
		System.out.println(s1 == s3);	//	주소 비교
		
		//	문자열 배열로 string 생성 
		char[] letters = {'j', 'a', 'v', 'a', ' ',
				'p', 'r', 'o', 'g', 'r', 'a', 'm', '!'};
		String s4 = new String(letters);
		System.out.println(s4);
		System.out.println(s4.length());
		
		//	valueOF 메서드 
		//	-> 다른 데이터타입을 문자열로 변환하는 메서드 
		float PI = 3.14159f;
		String s5 = String.valueOf(PI);
		System.out.println(s5);
		}
	}


