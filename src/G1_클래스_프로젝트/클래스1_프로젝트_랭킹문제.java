package G1_Ŭ����_������Ʈ;

import java.util.Arrays;

class Rank{
	int score[] = {10, 30, 100, 30};
	int rank [] = new int[4];
}
public class Ŭ����1_������Ʈ_��ŷ���� {
	public static void main(String[] args) {
		//1) ��ũ Ŭ������ �����.
		//2) ������ ����ؼ� rank �� ����� �����Ѵ�. 
		// [����] �����ڰ� ������� ����� ���� �����ϰ� ���� �����л���
		// �����ڸ�ŭ ���� ����� �����Ѵ�.
		// ��) ���� ������ 10 , 30 , 100, 30 
		//     ==> �����  4,2,1,2 �̴�.
		Rank rank = new Rank();
		//�� Ǯ��
//		for(int i = 0; i < rank.score.length; i++) {
//			for(int j = 0; j < rank.score.length; j++) {
//				if(i != j && rank.score[i] > rank.score[j]) {
//					rank.rank[j] += 1;
//				}
//			}
//		}
//		for(int i = 0; i < rank.rank.length; i++) {
//			rank.rank[i] += 1;
//		}
//		System.out.println(Arrays.toString(rank.rank));
		
		int arr[] = rank.score;
		int temp[] = rank.rank;
		
		for(int i = 0; i < arr.length; i++) {
			int count = arr.length;
			for(int j = 0; j < temp.length; j++) {
				if(i != j && arr[i] >= arr[j]) {
					count -= 1;
				}
			}
			temp[i] = count;
		}
		System.out.println(Arrays.toString(temp));
		
		
	}
}