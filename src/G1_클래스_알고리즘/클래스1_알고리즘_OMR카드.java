package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Random;

class Test06{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}
/*
 * # OMRī�� : Ŭ���� + ����
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

public class Ŭ����1_�˰���_OMRī�� {
	public static void main(String[] args) {
		Random ran = new Random();
		Test06 omr = new Test06();
		
		for(int i = 0; i < 5; i++) {
			omr.hgd[i] = ran.nextInt(5)+1;
			if(omr.answer[i] == omr.hgd[i]) {
				omr.cnt += 1;
				omr.score += 20;
			}
			System.out.println(omr.answer[i] + " " + omr.hgd[i]);
		}
		System.out.println("���� : " + omr.score);
		
	}
}