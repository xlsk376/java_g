package G1_Ŭ����_�˰���;

import java.util.Arrays;

class Sample5{
	int arr[] = {1,2,3,4,5};
}
class Sample6{
	int arr[] = {5,4,3,2,1};
}

public class Ŭ����1_�򰡹���_����5 {
	public static void main(String[] args) {
		
		Sample5 s5 = new Sample5();
		Sample6 s6 = new Sample6();
		s5.arr = s6.arr;
		s6.arr = s5.arr;
			
		//����) ���� ������ �ּ� Ǯ�� ����
		//System.out.println(Arrays.toString(s5.arr));
		//System.out.println(Arrays.toString(s6.arr));
	}
}