package G1_Ŭ����_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
 * 2. 0���� 5������ ���� �� 3���� �ߺ� ���� ������ �� ���� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
 */

class GamePlus{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
}

public class Ŭ����1_������Ʈ_���ϱ���ӹ��� {
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
		System.out.println("�ε����� �����ϼ���.");
		game.myIdx[0] = scan.nextInt();
		game.myIdx[1] = scan.nextInt();
		game.myIdx[2] = scan.nextInt();
		int total = 0;
		for(int i = 0; i < 3; i++) {
			total += game.game[game.myIdx[i]];
		}
		if(game.total == total) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
		
		
	}
}