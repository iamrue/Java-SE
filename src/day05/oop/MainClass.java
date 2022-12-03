package day05.oop;

import day05.pac.MathUtil; // 객체 안에 있는 메소드 모두 소환가능



public class MainClass {
	public static void main(String[] args) {
		int r =5;
		MathUtil mu = new MathUtil();
        double area = mu.getArea(r); 
        // mu 클래스 안에 있는 getAread에 지금 현자 r 값인 5를 넣는거야
		// area 원의 넓이 값을 저장하는 변수고
        // int r 을 5로 선언했기 문에 mathutil 리턴값이 5 로 들어가서
        //계산됨
		
		/* 컨트롤 시프트 o 누르면 import 뜸
		 * r에 두고 컨트롤 누르고 마우스 누르면 객체 틀 만듬 메모로 넘어감
		 * 
		 */
		
	     System.out.println("원의 넓이는 :"+area);
		
	     int result=mu.sum (6,4);
	     // 선언을 안해도 값을 넣을 수 있음
	     // mu.sum() = {6,4}; 안해도 됨
	     
	     System.out.println("6+4="+result);
		
	     System.out.println("5+9+1 ="+mu.sum(5,9,1));
		// system 이라는 객체에 out 이라는 변수에 println이라는 메소드를 
	    //실행한것  system, console 등등 OS (운영체제임)
		
}

}
