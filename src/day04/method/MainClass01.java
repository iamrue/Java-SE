package day04.method;
/*
 *자바는 maind에서  선언을 안하면 실행 하지 않음
 *method 호출 방법 : 메소드 이름();
 * 
 * [[메소드 (method)]]
 * 어떤 특정 작업을 수향하기 위함 명령문의 집함
 * 
 * 접근제어자 (public)(정적 static: 쓸 수도 있고 안 쓸 수도 있음)
 *반환타입 메소드이름(매개변수타입 매개변수명)
 * {// 선언부 //명령문//구현부 return 반환값} 
 * ex) public void person (int r)// 메소드 선언부{
 *  명령문 (메소드 구현부)
 *  return (반환값)
 * }
 * 
 * 
 * 
 *오버로딩
 *메소드 명이 같아도 타입이 다르면 사용 가능하다
 * */

public class MainClass01 {
	public static String name; //전역 변수 name 선언
	// 전역변수는 어느 메소드 이던지 사용 가능하다.
	// 각가의 메소드 변수, 또는 기능은 메소드에서만 사용가능하다.
	// 전역 변수는 main에서 모두 사용가능하기 때문에 main 밖에서 선언한다
	// 전역 변수 선언 방법 :
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		// main 안에서 실행 시켜야 작동됨
		//자바는 main 틀이 한 번은 실행됨
		
		hello(); 
		//hello 메소드 호출하기
		//System.out.println("Hello, World");
		// 반환값도 없기 때문에 걍 호출 시킴
		
		printName("이지수");
		// printName(); 은 인자 데이터 타입에 맞는 데이터가 없기 때문에 실행이 안됨
		// 인자가 있는 메소드는 무조건 값이 있는 메소드 호출을 해줘야함 
	
		// printName(); 하면 에러가 날것임 
		//-> printName 은 String (문자열 변수)를 매개로 가지고 있기 떄문에
		// 꼭 값을 넣어주어야 함
		// String.valof 
		// 메소드에 있는 (String name)을 ("이지수")를 넣는다고 생각하셈
		//String.valueof +
		
		setName("피카추");
		// 피카추가 메소드 name에 들어갔다가 전역변수 name 에 들어감 
		System.out.println("전역변수 name :"+name);
		// 요 name은 전역 변수 네임이다, 충돌하는 변수 이름이 없기 때문에
		// MainClass.을 안써도 된다.
		// 출력하면 전역변수 name : 피카추 가 나온다.
		
		String strName = getName();
		System.out.println("전역변수 name :"+strName);
		
		String eMon = getEvolution("꼬부기");
		System.out.println(eMon);
		
		
		
		//-------- 메소드 선언 시작
	/* 메소드 선언하는 법
	 * public static 리턴타입 (자료형 또는 void) 메소드명 () {
	 * 	실해할코드 작성;
	 * 	return; //리천 타입 void 일 경우 return 없음
	 * 
	 * - 메소드는 main 안에서만 선언해야되는 건가
	 * - 메소드는 기능이지 값이 아니다 출력하려면 값을 가진 변수가 있어야 함
	 * }
	 *  
	 *  
	 *  */
		
		
		
	} // ()인자 x 리턴 x void -> 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World");
		
	}// 인자 o 리턴 x -> 메소드
	public static void printName(String name) {
		System.out.println("이름 :" +name);
		//호춣할때,String 값을 저장해야함 안하면 안됨
		//String 은 문자열 변수다 !!!!!!!!!!!! 제발
		
	}
	// 인자 두개 선언을 오버로딩메소드 라고 한다 - 매우 중요
	public static void printName(String name, int age) {
	System.out.println("이름:"+name);	
	System.out.println("나이:age"+age);	
	// 
	
	}
	// 인자 두개 선언을 오버로딩메소드 라고 한다 - 매우 중요
	// 매개 변수는 여러가 받을 수 있음 / 메솓  명은 같은데 매개 값이 다르면 에러 안남
	//public static void printName(String name) 하면 에러가 남
	//클래스 명이 같은 메소드를 선언할 수 없음
	// 인자o 리턴 o -> 전역변수 name을 반환한다
	
	
// 인자o 리턴 x -> 매개변수 name을 전역변수 name에 대입
 public static void setName(String name) {
	MainClass01.name=name;
	// setName을 전역변수 name 에 저장하고 싶음
	//name 은 전역 변수
	// 매개변수 안에 있는 name과 충돌하기 때문에 명시해준다.

	
} //전역변수 값을 가져오는 메소드  인자 x, 리턴 o -> 전역 변수 name을 반환한다.
 public static String getName() {
		
	 return MainClass01.name;}
		// name 은 전역 변수
 		// 충돌하는 변수 없기 때문에 MainClass01. 없어도 됨
 		// getName 메소드는 MainClass01.name return  값을 가지고 올라간다.
 		// return 값은 전역변수 name이다. 전역변수 name 은 피카추다(setname 때문에)
 		// 그래서 strName 은 피카추다.

 // 인자0 리턴0
 public static String getEvolution  (String mon){
	String eMon = "";
	 if(mon.equals("꼬부기")) {
		 // equals 는 = 과 같다. 문자열은 equals 를 쓰는게 좋다
		 eMon ="어니부기";}
	 //main 에서 "꼬부기"가 들어오면 eMon 이 어니부기가 되서 return 값은 어니부기
	 else if (mon.equals("어니북")) {
		 eMon ="거북왕";
     //main 에서 "어니부기"가 들어오면 eMon 이 거북왕이 되서 return 값은 거북왕
		 }
	 return eMon; 
 } {
	
}
}













