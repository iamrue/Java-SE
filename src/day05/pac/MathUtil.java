package day05.pac;

public class MathUtil {
	public double pi =3.141592;
	// 객체 변수를 모든 패키지에서 사용 가능하게 만들어야 하기 때문에 public 붙임
	/** alt shift j -> 메소드 정의
	 * 원의 넓이를 구하는 메소드 
	 * 
	 * @param r - 반지름 값
	 * @return - 원의 넓이
	 */
	// 메소드 1 : 원의 넣ㅂ이
	public double getArea(int r) // 매개 변수 반지름 메소드 선언
	{double area = pi*r*r; // 원주율 * 반지름 제곱
	 // 원의 area 넓이 변수 선언
	return area; // 원 넓이
	}
	
	// 메소드 2 : 두수 합계
	public int sum (int a, int b) {
		int result = a+b;
		
		return result;}
		
	// 메소드 3 : 세 개의 합께 오버로딩
		public int sum(int a, int b, int c) {
			int result =a+b+c;
			return result;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

