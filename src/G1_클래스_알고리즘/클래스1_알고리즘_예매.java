package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + ����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

class Test07{
	int[] seat = new int[7];
	int money = 0;
}

public class Ŭ����1_�˰���_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Test07 e = new Test07();
		int cash = 12000;
		while(true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			System.out.println(Arrays.toString(e.seat));
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("�¼��� �����ϼ���.");
				int n = scan.nextInt();
				if(e.seat[n] == 1) {
					System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
				}else {
					e.seat[n] = 1;
				}
			}
			else if(sel == 2) {
				int count = 0;
				for(int i = 0; i < e.seat.length; i++) {
					if(e.seat[i] == 1) {
						count += 1;
					}
				}
				e.money = cash*count;
				System.out.println("�ѱݾ� : " + e.money + "��");
				break;
			}
		}


	}
}