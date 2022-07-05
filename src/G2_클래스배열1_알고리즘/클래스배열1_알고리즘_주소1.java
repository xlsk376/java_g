package G2_클래스배열1_알고리즘;


class AA{
	int a;
	int b;
}

public class 클래스배열1_알고리즘_주소1 {
	public static void main(String[] args) {
		// new 로 만들어진것은 숫자면 0 , 문자면 null 로 초기화됨
		AA aa = new AA(); 
		aa.a = 10;
		aa = new AA();
		aa.b = 20;
		
		// 실행전 예상하기
		// System.out.println(aa.a + aa.b);
	}
}