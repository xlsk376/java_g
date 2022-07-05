package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class GameMemory{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
}

public class 클래스1_프로젝트_기억력게임문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		GameMemory game = new GameMemory();
		int front[] = game.front;
		int back[] = game.back;
		int cnt = game.cnt;
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		System.out.println(Arrays.toString(front));
		
		while(true) {
			System.out.println(Arrays.toString(back));
			if(cnt == front.length/2) {
				break;
			}
			System.out.println("카드를 선택하세요.");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			if(front[n1] == front[n2] && n1 != n2 && back[n1] == 0 && back[n2] == 0) {
				back[n1] = front[n1];
				back[n2] = front[n2];
				cnt += 1;
			}
			
		}
		


	}
}