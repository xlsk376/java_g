package G2_Ŭ�����迭1_������Ʈ;
import java.util.Scanner;
/*
��ȣ , �̸�
1001 , ��ö�� 
1002 , �̸���
1003 , �ڿ���
-------------------------
��ȣ , ���� , ���� , ���� ��� 
1001 , ���� , 10 , 3
1001 , ���� , 32 , 2
1002 , ���� , 32 , 1
1002 , ���� , 34 , 1
1002 , ���� , 54 , 1
1003 , ���� , 75 , 1
1003 , ���� , 32 , 2
-------------------------
 */
class Student{
	int number;
	String name;
}

class Subject{
	int studentNumber;
	String subject;
	int score;
	int rank;
}

public class Ŭ�����迭1_������Ʈ_����_��Ʈ�ѷ� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 1000;
		int stSize = max;
		Student [] stList = new Student[stSize]; // �Ӹ� ����
		for(int i = 0; i < stSize; i++) {
			stList[i] = new Student(); // ���� ����
		}
		int subSize = max;
		Subject[] subList = new Subject[subSize]; // �Ӹ� ����
		for(int i =0; i < subSize; i++) {
			subList[i] = new Subject(); // ���� ����
		}		
		while(true) {
			System.out.println("[0] ���� ");
			System.out.println("[1] �л�����");
			System.out.println("[2] �л�����");
			System.out.println("[3] �����߰�");
			System.out.println("[4] �������");
			System.out.println("[5] ��ü���");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {			
				System.out.println("�л��̸� : ");
				String name = scan.next();
				stList[0].number = max;
				max += 1;
				stList[0].name = name;
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}else if(sel == 4) {
				
			}else if(sel == 5) {
				for(int i = 0; i < stSize; i++) {
					System.out.println(stList[i].number + " " + stList[i].name);
				}
			}
		}
	
		
	}
}