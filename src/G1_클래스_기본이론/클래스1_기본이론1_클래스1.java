package G1_Ŭ����_�⺻�̷�;
/*
 * [Ŭ����] 
 * 	1. ���� ���� �ڷ����� ������ �迭 : �����ڷ����� �����ؼ� �����.
 * 	2. ������ : �̸� , ���̵� , ��й�ȣ , ��ȣ , ���� 
 *  3. ���� : 
 *       (1) ���� : ��������   ==>  class{ �̾ȿ� �Ѵ�. }
 *  	 (2) ���� : ������ �Ҵ� ==>  Ŭ������ ������ = new Ŭ������();
 *  	 (3) ��� : ������ + . �� �̿��ؼ� ����Ѵ�. 
 */
class Data{
	String name;
	String id;
	String pw;
	int number;
	int score;
}

class Test01{
	int x;
	int y;
}

public class Ŭ����1_�⺻�̷�1_Ŭ����1 {

	public static void main(String[] args) {		
		// Ŭ���� ���� 
		String [] data = {"��ö��" , "qwer" ,
				"1234" , "1" , "30"};		
		int number = Integer.parseInt(data[3]);	
		System.out.println(number);	
		int score = Integer.parseInt(data[4]);
		System.out.println(score);
		
		//
		Data cData = new Data(); // ������ �Ҵ� 
		cData.name = "�̸���";
		cData.pw = "2345";
		cData.id = "asdf";
		cData.number = 2;
		cData.score = 54;


	}
}