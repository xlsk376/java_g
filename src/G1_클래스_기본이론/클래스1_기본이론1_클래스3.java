package G1_클래스_기본이론;

class Test03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class 클래스1_기본이론1_클래스3 {
	public static void main(String[] args) {

		Test03 t3 = new Test03();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for(int i = 0; i < t3.arr.length; i++) {
			total += t3.arr[i];
		}
		System.out.println(total);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int total1 = 0;
		for(int i = 0; i < t3.arr.length; i++) {
			if(t3.arr[i] % 4 == 0) {
				total1 += t3.arr[i];
			}
		}
		System.out.println(total1);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int count = 0;
		for(int i = 0; i < t3.arr.length; i++) {
			if(t3.arr[i] % 4 == 0) {
				count += 1;
			}
		}
		System.out.println(count);

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int count1 = 0;
		for(int i = 0; i < t3.arr.length; i++) {
			if(t3.arr[i] % 2 == 0) {
				count1 += 1;
			}
		}
		System.out.println(count1);

	}
}