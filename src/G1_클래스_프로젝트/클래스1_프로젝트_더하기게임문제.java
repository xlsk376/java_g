package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
 */

class GamePlus{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
}

public class 클래스1_프로젝트_더하기게임문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		GamePlus game = new GamePlus();
		for(int i = 0; i < 6;) {
			boolean check = false;
			int r = ran.nextInt(10)+1;
			for(int j = 0; j < 6; j++) {
				if(r == game.game[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				game.game[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(game.game));
		
		for(int i = 0; i < 3;) {
			int r = ran.nextInt(5);
			boolean check = false;
			for(int j = 0; j < 3; j++) {
				if(r == game.idx[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				game.idx[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(game.idx));
		
		for(int i = 0; i < 3; i++) {
			game.total += game.game[game.idx[i]];
		}
		System.out.println(game.total);
		System.out.println("인덱스를 선택하세요.");
		game.myIdx[0] = scan.nextInt();
		game.myIdx[1] = scan.nextInt();
		game.myIdx[2] = scan.nextInt();
		int total = 0;
		for(int i = 0; i < 3; i++) {
			total += game.game[game.myIdx[i]];
		}
		if(game.total == total) {
			System.out.println("정답");
		}else {
			System.out.println("땡");
		}
		
		
	}
}