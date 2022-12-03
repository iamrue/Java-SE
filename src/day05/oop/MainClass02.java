package day05.oop;


/*[[객체란]]
 * 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 
 * 정의가능 식별 가능한것! 
 * 
 * 예) 실제 존하는것 -자동차, 휴대폰...
 * 	  추상적인것 - 주문,배송,생산 등
 * 모두 객체가 될 수 있다.
 * 
 * 최소한의 프로그램 단위
 * 
 * 객체를 만들기 위해서 주형,설계도(붕어빵틀)가 필요함 -> 주형은 Class
 * 
 * Class 에 작성된 코드를 읽어 객체화 한다 => 메모리에 올린다(저장)!!  
 * 
 * 클래스 만들기 :
 * class 클래명 {
 * 생산자 => 초기화
 * 변수
 * 메소드
 * 
 * }
 * 
 * 메모리에 올라갔기 때문에 우리는 쓸 수 있음
 * 
 * !!
 * 객체화 하는 방법 :
 * 클래스명 변수명 =new 클래스명(); -> 새로운 클래스를 만들어서 사용 가능
 * -> class가 객채화 되서 메모리에 올라가야 우리는 변수명을 가지고
 * 그 main 창에서 쓸 수 있고 다른곳에도 불러올 수 있다. ( 불러오기 가능
 * !!
 * 
 * 객체화
 * 클래스 만들기 :
 * class 클래명 {
 * 생성자 => 초기화-> 나중에
 * 변수
 * 메소드}
 * 
 * 위치 : 아예 처음에 해도 됨 main 안에다가 하면 안됨
 * 객체 구성요소
 *   생성자 => 초기화
 * 	 변수 (멤버 변수, 멤버 필ㄷ)=> 속성값 -> car1, car2
 * 	 메소드 => 객체가 할 수 있는 기능
 * 
 * */

// 실행하는 메인 클래스


class Car {
	
	String model ="페라리";   // 변수 구성요소
	String color ="red";
	
	
	public void drive() { // 메소드 구성요소
		System.out.println(model+"드라이브를 합니다.");}
		
	public void autopilot() {
		System.out.println(model+"자율주행을 합니다.");}}

public class MainClass02 {	
	public static void main(String[] args) {
	
		//생산자 초기화
	Car car1 = new Car(); // 객체화 완료 -> 메모리 car 공간 생성 완료
	car1.model ="페라리";
	
	System.out.println("car1 모델명 :"+car1.model);
	System.out.println("car1색상:"+car1.color);
	
	// model  과 color 바꾸었을 떄
	Car car2 = new Car();
	car2.model = "테슬라";
	car2.color = "yellow";
	
	System.out.println("car2 모델명 :"+car2.model);
	System.out.println("car2색상:"+car2.color);
	
	
	
	car1.drive();
	// 객체는 모두 () 라고 붙어있고 object 라는 걸 상속받는다. 
	// 자바내에서 객체로써 정의가 되면 다른 곳에서도
	// 사용이 용이하다
	car1.autopilot();
	
	car2.drive();
	car2.autopilot();
	
	// car1 과 car2는 다른 객체 이다. 타입은 같지만 다르다.
	
	// 객체 지향은 모든 기능은 이미 만들어져 있기 때문에 더 용이하다.
	
	}
}





















