package day02.basic;

public class MainClass03 {
	public static void main(String[] args) {
		char ch1 ='A';
		System.out.println("char형 변수에 저장된 문자:" + ch1);
		
		/*char c2 ='金';
		char c3 ='뿔';*/
		
		int num = ch1;//
		System.out.println("대문자 A에 해당하는 숫자코드 :"+num);
		
		int num2 =110;
		char ch4 = (char)num2; // int 를 char로 형변환
		System.out.println(ch4);
		
	}

}
