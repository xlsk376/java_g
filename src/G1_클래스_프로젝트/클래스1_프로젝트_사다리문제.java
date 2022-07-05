package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 */

class GameLadder{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
}

public class 클래스1_프로젝트_사다리문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		GameLadder game = new GameLadder();
		
		int ladder[][] = game.ladder;
		int x = game.x;
		int y = game.y;
		String[] menu = game.menu;
		
		System.out.println("1~5 선택하세요");
		x = scan.nextInt()-1;
		// x 선택
		// y로 내려감
		for(int i = 0; i < ladder.length; i++) {
			if(ladder[i][x] == 1) {
				if(x == 0) {
					if(ladder[i][x+1] == 1) {
						x += 1;
					}
				}else if(x == 5) {
					if(ladder[i][x-1] == 1) {
						x -= 1;
					}
				}else {
					if(ladder[i][x-1] == 1) {
						x -= 1;
					}else if(ladder[i][x+1] == 1) {
						x += 1;
					}
				}
			}
		}
		System.out.println(menu[x]);
		
		
		
		
		
		

	}
}