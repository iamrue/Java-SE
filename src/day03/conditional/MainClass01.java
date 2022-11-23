package day03.conditional;
/*
 * [[조건문]]
 * 
 * 주어진 조건식의 결과에 따라 별도으 명령을 수행하도록 제어하는 명령문
 * 
 * if문 사용법
 * 
 * if(조건식){
 * 조건식 true 일때 실행명령문
 * }else if (조건식){
 * 		조건식 true 일떄 실행명령문
 * }else{
 * 		 모든 조건식이 false 일때 실행 명령문
 * }
 
 * 홀수는 2로 나누었을 때 나머지가 발생
 * 짝수는 2로 나누었을 때 나머지가 발생 x
 * */
public class MainClass01 {
	public static void main(String[] args) {
		int num =11;
		if (num%2 ==0){
	System.out.println("1.num은 짝수 입니다.");
		}
		if (num%2 !=0) {
			System.out.println("1.num은 홀수 입니다.");
		}
		
		
		if (num%2 ==0){
			System.out.println("2.num은 짝수 입니다.");
				} else if (num%2 !=0) {
			System.out.println("2.num은 홀수 입니다.");
		}
		
		//실행명령문이 한줄일 떄 중괄호 생략가능
		if (num%2 ==0)
			System.out.println("2.num은 짝수 입니다.");
				 else if (num%2 !=0) 
			System.out.println("2.num은 홀수 입니다.");

		
		
		
		
		
		}

}
