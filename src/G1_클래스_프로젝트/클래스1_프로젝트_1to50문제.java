package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

class Game1to50{
	final int SIZE = 9;	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];	
}
public class 클래스1_프로젝트_1to50문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Game1to50 game = new Game1to50();
		int front[] = game.front;
		int back[] = game.back;
		int size = game.SIZE;
		for(int i = 0; i < front.length;) {
			int r = ran.nextInt(9)+1;
			boolean check = false;
			for(int j = 0; j < front.length; j++) {
				if(r == front[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				front[i] = r;
				i += 1;
			}
		}
		//System.out.println(Arrays.toString(front));
		for(int i = 0; i < back.length;) {
			int r1 = ran.nextInt(9)+10;
			boolean check = false;
			for(int j = 0; j < back.length; j++) {
				if(r1 == back[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				back[i] = r1;
				i += 1;
			}
		}
		//System.out.println(Arrays.toString(back));
		int count = 18;
		while(true) {
			System.out.println(Arrays.toString(front));
			if(count == 0) {
				break;
			}
			System.out.println("선택하세요!");
			int n = scan.nextInt();
			int min = 18;
			int index = 0;
			for(int i = 0; i < front.length; i++) {
				if(min > front[i] && front[i] != 0) {
					min = front[i];
					index = i;
				}
			}
			System.out.println(min);
			if(min == n) {
				if(size == 0) {
					front[index] = 0;
					if(front[index] == min) {
						front[index] = 0;
					}
				}else {
					front[index] = back[0];
					for(int i = 0; i < size-1; i++) {
						back[i] = back[i+1];
					}
					back[size-1] = 0;
					System.out.println(Arrays.toString(back));
					size -= 1;
				}
				count -= 1;
			}
			
			
			
		}
		
		
		
		
		

	}
}