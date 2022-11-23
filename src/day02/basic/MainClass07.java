package day02.basic;
/*
 * [[참조형 데이터형 (레퍼런스형)]]
 * 
 * 5.String 형(문자열)
 * - 선언 방법
 * 		String 변수명;
 * - 문자열을 저장할 수 있다.
 * 기본형 - boolean, char, byte,short,int,long,float,double
 * */

public class MainClass07 {
	public static void main(String [] args) {
		
		// 변수 선언과 동시에 값 대입하기
		String str ="안녕하세요.";
		System.out.println("str:"+str);
		
		/*
		 * hello
		 * 01234 => 인덱스 번호 (단순한 문자 배열 순서)
		 * */
		String hello ="hello";
		System.out.println("1번 인덱스:"+ hello.charAt(4));
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		if(isContain) {
			System.out.println("addr에는 특별시 라는 문자열이 있어요!");
			
		}
		
		
	}
}
