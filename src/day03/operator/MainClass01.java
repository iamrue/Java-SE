package day03.operator;
/*
 * [[연산자]]
 * 1. 산술 연산자
 * +,-,*,/,%
 * 
 * 
 * */
public class MainClass01 {
	public static void main(String[]args) {
		int num =10;
		int num2 =5;
		// 두 수의 합을 구해서 sum이라는 int형 변수에 대입
		int sum = num1+num2;
		System.out.println(num1+"+"+num2+"="+sum);
		
		// 두 수의 곱을 구해서 multiply라는 변수에 대입
	  int multiply = num1*num2;
	  System.out.println(num1+"*"+num2+"="+multiply);
	  
	  int result =10/3;
	  System.out.println("10/3="+result);
	  //실수 계산 부동소수점 오차 생길 수 있다
	  double dResult =10/3;
	  System.out.println("10/3="+dResult);
	
	  int result2 =9%5;
	  System.out.println("9%5"+result2);
	
	
	}
	

}
