package G2_Ŭ�����迭1_�˰���;


class DD {
	int a;
	int b;
}

public class Ŭ�����迭1_�˰���_�ּ�4 {
	public static void main(String[] args) {
		
		DD[] ddList = new DD[3];
		
		DD d1 = new DD();
		d1.a = 100;	
		ddList[0] = d1;
		
		d1 = new DD();
		d1.a = 200;
		ddList[1] = d1;
		
		d1 = new DD();
		d1.a = 300;
		ddList[2] = d1;
		
		// ������ �����ϱ�
		for(int i = 0; i < ddList.length; i++) {
			System.out.println(ddList[i].a);
		}
	}
}