package G1_Ŭ����_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + ����
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

class GameMemory{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
}

public class Ŭ����1_������Ʈ_���°��ӹ��� {
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
			System.out.println("ī�带 �����ϼ���.");
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