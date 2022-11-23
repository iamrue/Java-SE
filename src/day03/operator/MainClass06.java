package day03.operator;
/*
 * 
 * 6.상황 연산자 (조건문과 비숫)
 * 조건식 ? 조건식이 참인경우 :조건식이 거짓인경우
 * 
 * 
 * 
 * 
 * 
 * */
public class MainClass06 {
	public static void main(String[] args) {
		int num = -10;
		String result =num >0? "num은 양수" :"num은 음수";
		System.out.println(result + "입니다.");
		
		String result2 =null;// null은 아무것도 안넣겠다는 뜻!!
		if (num >0) {
			result2 ="num은 양수";
		}else {result2="num은 음수"};
		
		System.out.println(result2+"입니다.");
			
	} 

}
