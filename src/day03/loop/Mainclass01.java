package day03.loop;
/*
 * [[반복문]]
 * 
 * 특정 부분의 콛가 반복적으로 수행하도록 하는 제어문
 * 
 * 1.while 문
 * while (조건문){}
 * 
 * 
 * */
public class Mainclass01 {
	public static void main(String[] args) {
		//while문을 이용해서 0-99까지 출력
		
		int count =0;
		while(true) {
			System.out.println(count);
			count++;
			if(count==100)break;}
	
		count =0;
		while(count<100) {
			System.out.println(count);
			count++;
			}
		
		count =0;
		boolean isRun =true;
		while(isRun) {
			System.out.println(count);
			count++;
			if(count ==100)isRun =false; 
		}
		while()
		
		}
	}

}
