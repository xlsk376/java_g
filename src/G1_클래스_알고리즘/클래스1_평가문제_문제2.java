package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Random;

class Sample2{
	int arr[] = {10,20,30,40,50};
}

public class Ŭ����1_�򰡹���_����2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		
		Sample2 s2 = new Sample2();
		s2.arr = arr;
			
		
		
		//����1) ���� ������ �ּ� Ǯ�� ����
		System.out.println(Arrays.toString(s2.arr)); // arr�� �־���
		
		s2.arr = null;	// s2�� �ּҿ� null���� �־ �ʱ�ȭ
		//����2) ���� ������ �ּ� Ǯ�� ����
		System.out.println(Arrays.toString(arr)); // ���� arr���� ���
		
	}
}