package G1_Ŭ����_�˰���;

import java.util.Arrays;

class Sample4{
	int arr[][] = new int[4][];
}

public class Ŭ����1_�򰡹���_����4 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {11,12,13,14,15};
		
		
		Sample4 s4 = new Sample4();
	
		s4.arr[0] = arr1;
		s4.arr[1] = arr2;
		s4.arr[2] = arr1;
		s4.arr[3] = arr2;
		
		s4.arr[1][1] = 100;
			
		//����) ���� ������ �ּ� Ǯ�� ����
		for(int i =0; i < s4.arr.length; i++) {
			System.out.println(Arrays.toString(s4.arr[i]));
		}
		
		
	}
}
