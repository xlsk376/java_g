package G1_Ŭ����_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
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
	String[] menu = {"�ҽ�������", "CU������", "������", "���õ��", "���θ���"};
}

public class Ŭ����1_������Ʈ_��ٸ����� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		GameLadder game = new GameLadder();
		
		int ladder[][] = game.ladder;
		int x = game.x;
		int y = game.y;
		String[] menu = game.menu;
		
		System.out.println("1~5 �����ϼ���");
		x = scan.nextInt()-1;
		// x ����
		// y�� ������
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