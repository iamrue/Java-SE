package day03.operator;
/*
 * 4.논리 연산자
 * 
 * && : And 조건, 교집합 개념, 양쪽 두 true 일떄 true
 * || : Or 조건, 합집합의 개념, 어느 한쪽이 true 이면 true
 * ! : not 조건, 여집합 개념, 논리값을 반전시킨다.
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		boolean result = true&&true;
		System.out.println("&& :"+result);
		
		result = true || false;
		System.out.println("|| :"+result);
		
		result = !false;
		System.out.println("!:"+result);
		
		if(10>20 ||(5 ==4))){
			
			System.out.println("조건 중 하나이상 treu입니다.");
		}
		
	}

}