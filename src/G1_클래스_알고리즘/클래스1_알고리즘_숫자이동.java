package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

class GameMove{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
public class Ŭ����1_�˰���_�����̵� {
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
			System.out.println("����(1) ������(2) ���ı�(3) ����(0)");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(me <= 0) {
					g.game[me] = 0;
					me = g.game.length-1;
					g.game[me] = 2;
				}else {
					if(g.game[me-1] == 1) {
						System.out.println("�̵��Ұ�");
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
						System.out.println("�̵��Ұ�");
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
				System.out.println("�ı�����!");
			}else if(sel == 0) {
				break;
			}
		}
		
		// ���� �ۼ�
//		int index = 0;
//		for(int i = 0; i < gm.game.length; i++) {
//			if(gm.game[i] == 2) {
//				index = i;
//			}
//		}
//		int me = index;
//		while(true) {
//			System.out.println(Arrays.toString(gm.game));
//			System.out.println("���ڸ� �Է��ϼ���");
//			int n1 = scan.nextInt();
//			if(n1 == 1) {
//				if(me > 0 && gm.game[me-1] == 0) {
//					gm.game[me] = 0;
//					me -= 1;
//					gm.game[me] = 2;
//				}
//			}else if(n1 == 2) {
//				if(me < gm.game.length-1 && gm.game[me+1] == 0) {
//					gm.game[me] = 0;
//					me += 1;
//					gm.game[me] = 2;
//				}
//			}else if(n1 == 3) { // ���ı�
//				if(gm.game[me-1] == 1) {
//					gm.game[me-1] = 0;
//				}else if(gm.game[me+1] == 1) {
//					gm.game[me+1] = 0;
//				}
//			}else if(n1 == 0) {
//				break;
//			}
//		}


	}
}