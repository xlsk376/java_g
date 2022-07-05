package G1_클래스_프로젝트;

import java.util.Arrays;

class Rank{
	int score[] = {10, 30, 100, 30};
	int rank [] = new int[4];
}
public class 클래스1_프로젝트_랭킹문제 {
	public static void main(String[] args) {
		//1) 랭크 클래스를 만든다.
		//2) 점수에 기반해서 rank 에 등수를 저장한다. 
		// [조건] 동점자가 있을경우 등수는 같게 저장하고 다음 점수학생은
		// 동점자만큼 뒤의 등수를 저장한다.
		// 예) 지금 점수가 10 , 30 , 100, 30 
		//     ==> 등수는  4,2,1,2 이다.
		Rank rank = new Rank();
		//내 풀이
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