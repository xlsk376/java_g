package G1_Ŭ����_�˰���;

class Sample1{
	int arr[] = {10,20,30,40,50};
}

public class Ŭ����1_�򰡹���_����1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};	
		Sample1 s1 = null; // null�� ���� ������, ����Ϸ��� �������������
			
		//����) ���� ������ �ּ� Ǯ�� ����		
		//System.out.println(s1.arr[0]);
		
		s1 = new Sample1();		// �ʱ�ȭ
		Sample1 t1 = s1;		// t1�� s1.arr�� �־���
		s1 = null;				// null�� ���� ������
		System.out.println(t1.arr[0]); // t1�� s1.arr �� �������
		
		t1 = null;
		
	}
}