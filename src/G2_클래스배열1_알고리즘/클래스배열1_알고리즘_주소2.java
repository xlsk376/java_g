package G2_Ŭ�����迭1_�˰���;


class BB{
	int a;
	int b;
}

public class Ŭ�����迭1_�˰���_�ּ�2 {
	public static void main(String[] args) {
		BB [] bb = new BB[3]; // [] �� �Ӹ��� ������ ����
		for(int i = 0; i < bb.length; i++) {
			bb[i] = new BB(); // () �� ������ ������ �����
			bb[i].a = 10;
			bb[i].b = 20;
		}
		
		// ������ �����ϱ�
		for(int i = 0; i  < bb.length; i++) {
			System.out.println(bb[i].a + bb[i].b);
		}
		
	}
}