package day03.operator;
/*
 * 3.비교연산자
 * 
 * > :크다
 * >= : 크거다 같다
 * < :
 * <= :
 * == :
 * != :
 * 
 *
 * */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result = 10>20;
		
		System.out.println("10>20:" +result);
		if(result) {
			System.out.println("10은 20보다 작다.");	
		}
		if(10 == 10) {
			System.out.println("10과 10은 같아요.");
		}
		if(10 !=20) {
			System.out.println("10과 20은 달라요");
			
		}
		
	}

}
