package G2_Ŭ�����迭1_�˰���;


class CC{
	int a;
	int b;
}

public class Ŭ�����迭1_�˰���_�ּ�3 {
	public static void main(String[] args) {
		CC [] ccList = new CC[3];
		for(int i = 0; i < ccList.length; i++) {
			ccList[i] = new CC();
			ccList[i].a = 10;
			ccList[i].b = 20;
		}
		
		CC cc = ccList[0];
		cc.a = 100;
		
		// ������ �����ϱ�
		for(int i = 0; i  < ccList.length; i++) {
			System.out.println(ccList[i].a + ccList[i].b);
		}
		
	}
}