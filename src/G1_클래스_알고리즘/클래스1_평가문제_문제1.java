package G1_클래스_알고리즘;

class Sample1{
	int arr[] = {10,20,30,40,50};
}

public class 클래스1_평가문제_문제1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};	
		Sample1 s1 = null; // null이 들어가서 사용못함, 사용하려면 재지정해줘야함
			
		//문제) 답을 예상후 주석 풀고 실행		
		//System.out.println(s1.arr[0]);
		
		s1 = new Sample1();		// 초기화
		Sample1 t1 = s1;		// t1에 s1.arr을 넣어줌
		s1 = null;				// null이 들어가서 사용못함
		System.out.println(t1.arr[0]); // t1엔 s1.arr 이 들어있음
		
		t1 = null;
		
	}
}