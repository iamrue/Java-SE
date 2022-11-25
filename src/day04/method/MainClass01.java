package day04.method;
/*
 * 
 * 
 * [[메소드 (method)]]
 * 어떤 특정 작업을 수향하기 위함 명령문의 집함
 * 
 * 접근제어자(정적)반환타입 메소드이름(매개변수타입 매개변수명)
 * {// 선언부 //명령문//구현부 return 반환값} 
 * 
 * 
 *오버로딩
 *메소드 명이 같아도 타입이 다르면 사용 가능하다
 * */

public class MainClass01 {
	public static String name; {
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		//hello 메소드 호출하기
		hello(); 
		// printName();
		printName("이지수");
		setName("피카추");
		System.out.println("전역변수 name :"+name);
		
	} // ()인자 x 리턴 x void -> 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World");
		
	}// 인자 o 리턴 x 
	public static void printName(String name) {
		System.out.println("이름 :" +name);
		
	}
	// 인자 두개 선언을 오버로딩메소드 라고 한다 - 매우 중요
	public static void printName(String name, int age) {
	System.out.println("이름:"+name);	
	System.out.println("나이:age"+age);	
	}
 public static void setName(String name) {
	MainClass01.name=name;
}
 public static void  (){
	 return name;
 } {
	
}
}
