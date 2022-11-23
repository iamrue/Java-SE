package day02.basic;
/*
 * [[ 기본 자료형 ]]
 *  1. 논리형 (boolean)
 *  
 *  -선언방법
 * 	boolean 변수명;
 * - 가질 수 있는 범위 ; true, false 두가지 값 저장 가능
 * 
 * */

public class MainClass02 {
	// 요 부분은 전역변수
	public static void main(String[] args) {//여기서 부터 지역 변수 메소드
		// 논리형 지역변수 선언하기
		boolean isWait;
		// 선언한 변수에 값 대입하기
		isWait = true;
		System.out.println("논리형 변수에 저장된 값:"+isWait);;

		// 지역 변수는 일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun = false; 
		//변수 선언과 동시에 값대입
		isWait = false;
		canRun =true;
		
		// 줄복사 컨트롤 알트 방향키 아래
		// 줄삭제 컨트롤 D
		System.out.println("isWait:"+isWait);
		System.out.println("canRun:"+canRun);
		
		//boolean isArea;// 초기화
		
		
		
	
	
	
	
	}
	
	 

}
