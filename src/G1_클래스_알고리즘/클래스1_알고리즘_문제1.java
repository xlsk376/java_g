package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ŭ����1_�˰���_����1 {
	public static void main(String[] args) {
		Test04 t4 = new Test04();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		for(int i = 0; i < 5; i++) {
			t4.scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(t4.scores));

		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i < 5; i++) {
			total += t4.scores[i];
		}
		avg = total/5;
		System.out.println("���� : " + total + " " + "��� : " + avg);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(t4.scores[i] >= 60) {
				count += 1;
			}
		}
		System.out.println("�հݻ� : " + count);

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		int r = ran.nextInt(5);
		System.out.println("�ε��� : " + r);
		System.out.println("���� : "+t4.scores[r]);

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("���� �Է�");
		int n = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(n == t4.scores[i]) {
				index = i;
			}
		}
		System.out.println("�ε��� : " + index);

		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��
		System.out.println("�й� �Է�");
		int n1 = scan.nextInt();
		index = 0;
		for(int i = 0; i < 5; i++) {
			if(n1 == t4.hakbuns[i]) {
				index = i;
			}
		}
		System.out.println("���� : " + t4.scores[index]);

		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("--�й� �Է�--");
		int n2 = scan.nextInt();
		index = 0;
		boolean check = false;
		for(int i = 0; i < 5; i++) {
			if(n2 == t4.hakbuns[i]) {
				check = true;
				index = i;
			}
		}
		if(check == true) {
			System.out.println("�й� : " + n2 + " " + "���� : " + t4.scores[index]);
		}else {
			System.out.println(n2 + " �ش��й��� �������� �ʽ��ϴ�.");
		}

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1003��(92��)
		int max = 0;
		index = 0;
		for(int i = 0; i < 5; i++) {
			if(max < t4.scores[i]) {
				max = t4.scores[i];
				index = i;
			}
		}
		System.out.println(t4.hakbuns[index] +"��" +"(" +t4.scores[index]+"��)");
		
		
		
		
		
		

	}
}