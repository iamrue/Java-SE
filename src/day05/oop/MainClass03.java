package day05.oop;

import day05.pac.*;
// 같은 객체 주형이페
// 패키지 안에 없기 때문에 import로 다 끌고 와야함 *은 모두 끌어온다는 뜻
// 없으면

// -> day05.pac/ book.java 에 있는 객체 주형을 가져올 수 있음

public class MainClass03 {
 
	public static void main(String[] args) {
		//import 안쓰면
		//day05.pac.Book book1 = new day05.pac.Book();
		//이거넣어야 함
		
	 Book book1 = new Book();
	 //  book1 이라는 객체가 만들어짐 
	 
	 book1.read();  // Book 안에 있는 메소드 호출
	 book1.pillow(); // 더 정확히 말하면 객체 book1 안에 있는
	 
	 System.out.println("book1 제목:"+book1.subject);
	 System.out.println("book1 저자:"+book1.writter);
	 
	
	}
	
} 