package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

class GameMove{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
public class 클래스1_알고리즘_숫자이동 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameMove g = new GameMove();
		int me = 0;
		for(int i = 0; i < g.game.length; i++) {
			if(g.game[i] == 2) {
				me = i;
			}
		}
		while(true) {
			System.out.println(Arrays.toString(g.game));
			System.out.println("왼쪽(1) 오른쪽(2) 벽파괴(3) 종료(0)");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(me <= 0) {
					g.game[me] = 0;
					me = g.game.length-1;
					g.game[me] = 2;
				}else {
					if(g.game[me-1] == 1) {
						System.out.println("이동불가");
					}else {
						g.game[me] = 0;
						me -= 1;
						g.game[me] = 2;
					}
				}
			}else if(sel == 2) {
				if(me >= g.game.length-1) {
					g.game[me] = 0;
					me = 0;
					g.game[me] = 2;
				}else {
					if(g.game[me+1] == 1) {
						System.out.println("이동불가");
					}else {
						g.game[me] = 0;
						me += 1;
						g.game[me] = 2;
					}
				}
			}else if(sel == 3) {
				if(g.game[me-1] == 1) {
					g.game[me-1] = 0;
				}else if(g.game[me+1] == 1) {
					g.game[me+1] = 0;
				}
				System.out.println("파괴성공!");
			}else if(sel == 0) {
				break;
			}
		}


	}
}