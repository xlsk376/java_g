package G2_클래스배열1_알고리즘;


class BB{
	int a;
	int b;
}

public class 클래스배열1_알고리즘_주소2 {
	public static void main(String[] args) {
		BB [] bb = new BB[3]; // [] 는 머리만 생성한 상태
		for(int i = 0; i < bb.length; i++) {
			bb[i] = new BB(); // () 의 몸통을 생성해 줘야함
			bb[i].a = 10;
			bb[i].b = 20;
		}
		
		// 실행전 예상하기
		for(int i = 0; i  < bb.length; i++) {
			System.out.println(bb[i].a + bb[i].b);
		}
		
	}
}