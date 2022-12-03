package day05.variable;

import day05.pac.*;

/*
 * 변수란?
 * 메모리 공가넹 붙여진 이름.
 * JAVA 프로그램 사용되는 모든 값을 메모리 공간에 저장.
 * 메모리 공간에 이름을 붙여 접근 가능
 * 
 * 변수 선언 및 포기화 
 * 자료형 변수명 = 값
 * 
 * 1. 타입의 따른 변수
 * 		기본형 - (예약어, 소문자로 시작, 값을 가지고 있다)
 *  - boolean, byte, short,int,long,char,float,double
 * 		참조형 - 대문자로 시작을 하고, 주소값을 가지고 있다. 
 * 				기본형 외 나머지 전부!
 * 		EX) String
 * 
 * 2. 선언 위치에 따른 변수
 * 		전역 변수 (global 변수) - 클래쓰 안에 선언 (멤버변수)
 * 		지역 변수 (local 변수) - 메소드 또는 생성자 안에 선언
 *                          중괄호 {} 안에 선언된 변수
 *      - 전역 지역 모두 초기화 해줘야 한다. 안하면  에러남
 * 
 * 3. 정적(static) / 동적 변수
 *  
 * 
 * 
 * 
 * 
 * */

public class MainClass01 {
	//(1) public static String gVar;
	// 전역변수 
	// 객체가 살아있는한 존재함 
	
	public static void main(String[] args) {
		//String lVar =""; //-> 지역변수
		// main 메소드 사라지면 변수도 사라짐
		/*
		System.out.println(gVar);
		-> null 이라고 출력됨 초기화를 안했기 때문에 공간도 안생김
		System.out.println(lVar);
		-> 이건 아예 안됨
		String lVar=""; 이렇게라도 해야함
		*/
		
		Card c1 = new Card();
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		Card c2 =new Card ();
		c2.cardType = "heart";
		c2.number ="K";
		c2.width = 65;
		c2.height = 90;
		
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		System.out.println(c2.cardType);
		System.out.println(c2.number);
		System.out.println(c2.width);
		System.out.println(c2.height);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
