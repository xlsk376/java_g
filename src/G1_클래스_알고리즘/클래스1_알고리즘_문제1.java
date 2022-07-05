package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class 클래스1_알고리즘_문제1 {
	public static void main(String[] args) {
		Test04 t4 = new Test04();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for(int i = 0; i < 5; i++) {
			t4.scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(t4.scores));

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i < 5; i++) {
			total += t4.scores[i];
		}
		avg = total/5;
		System.out.println("총점 : " + total + " " + "평균 : " + avg);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(t4.scores[i] >= 60) {
				count += 1;
			}
		}
		System.out.println("합격생 : " + count);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		int r = ran.nextInt(5);
		System.out.println("인덱스 : " + r);
		System.out.println("성적 : "+t4.scores[r]);

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println("성적 입력");
		int n = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(n == t4.scores[i]) {
				index = i;
			}
		}
		System.out.println("인덱스 : " + index);

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점
		System.out.println("학번 입력");
		int n1 = scan.nextInt();
		index = 0;
		for(int i = 0; i < 5; i++) {
			if(n1 == t4.hakbuns[i]) {
				index = i;
			}
		}
		System.out.println("성적 : " + t4.scores[index]);

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("--학번 입력--");
		int n2 = scan.nextInt();
		index = 0;
		boolean check = false;
		for(int i = 0; i < 5; i++) {
			if(n2 == t4.hakbuns[i]) {
				check = true;
				index = i;
			}
		}
		if(check == true) {
			System.out.println("학번 : " + n2 + " " + "성적 : " + t4.scores[index]);
		}else {
			System.out.println(n2 + " 해당학번은 존재하지 않습니다.");
		}

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1003번(92점)
		int max = 0;
		index = 0;
		for(int i = 0; i < 5; i++) {
			if(max < t4.scores[i]) {
				max = t4.scores[i];
				index = i;
			}
		}
		System.out.println(t4.hakbuns[index] +"번" +"(" +t4.scores[index]+"점)");
		
		
		
		
		
		

	}
}