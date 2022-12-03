package day05.pac;

// 객체 틀 만들기,  이 앞에 만들어진 public은 컴퓨터가 붙여줌
public class Book {
	// 변수 만들기,  public 접근제어자 - 모든 패키지에 접근가능하다는 제어자
	public String subject = "JAVA PROGRAMING";
	// 전역 변수 subject,writter 같은 클래스 안 다른 메소드에서도 사용 가능
	public String writter ="김태호";
	
	//메소드 만들기
	public void read () {
	         int page =10;
	         //  지역 변수는  같은 메소드 안에서만 사용 가능하다.
		System.out.println(subject+ ""+page + "페이지 읽어요.");}
	public void pillow () {
		System.out.println("베개로 사용해요!");}
}


	
