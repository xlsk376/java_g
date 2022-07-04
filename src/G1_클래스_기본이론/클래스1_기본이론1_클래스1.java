package G1_클래스_기본이론;
/*
 * [클래스] 
 * 	1. 내가 직접 자료형을 설정한 배열 : 기존자료형을 조합해서 만든다.
 * 	2. 데이터 : 이름 , 아이디 , 비밀번호 , 번호 , 점수 
 *  3. 순서 : 
 *       (1) 정의 : 내용정의   ==>  class{ 이안에 한다. }
 *  	 (2) 선언 : 데이터 할당 ==>  클래스명 변수명 = new 클래스명();
 *  	 (3) 사용 : 변수명 + . 을 이용해서 사용한다. 
 */
class Data{
	String name;
	String id;
	String pw;
	int number;
	int score;
}

class Test01{
	int x;
	int y;
}

public class 클래스1_기본이론1_클래스1 {

	public static void main(String[] args) {		
		// 클래스 이전 
		String [] data = {"김철수" , "qwer" ,
				"1234" , "1" , "30"};		
		int number = Integer.parseInt(data[3]);	
		System.out.println(number);	
		int score = Integer.parseInt(data[4]);
		System.out.println(score);
		
		//
		Data cData = new Data(); // 데이터 할당 
		cData.name = "이만수";
		cData.pw = "2345";
		cData.id = "asdf";
		cData.number = 2;
		cData.score = 54;


	}
}