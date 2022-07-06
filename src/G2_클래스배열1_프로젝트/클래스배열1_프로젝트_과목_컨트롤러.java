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
		int stCnt = 0; // ����� �л���
		int subCnt = 0; // ����� ����
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
			}else if(sel == 1) { // �л�����
				System.out.println("�л��̸� : ");
				String name = scan.next();
				stList[stCnt].number = max;
				max += 1;
				stList[stCnt].name = name;
				stCnt += 1;
			}else if(sel == 2) { // �л�����
				System.out.println("������ �̸��� �Է��ϼ���.");
				String name = scan.next();
				int index = -1;
				for(int i = 0; i < stCnt; i++) {
					if(name.equals(stList[i].name)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("������ �̸��� �����ϴ�.");
				}else {
					for(int i = index; i < stCnt-1; i++) {
						stList[i] = stList[i+1];
					}
					stList[stCnt-1] = null;
					stCnt -= 1;
				}
			}else if(sel == 3) { // �����߰�
				System.out.println("�л���ȣ �Է�");
				int number = scan.nextInt();
				System.out.println("���� �Է�");
				String subject = scan.next();
				System.out.println("���� �Է�");
				int score = scan.nextInt();
				System.out.println("���� ��� �Է�");
				int rank = scan.nextInt();
				subList[subCnt].studentNumber = number;
				subList[subCnt].subject = subject;
				subList[subCnt].score = score;
				subList[subCnt].rank = rank;
				subCnt += 1;
			}else if(sel == 4) { // �������
				System.out.println("������ ������ �Է��ϼ���");
				String subject = scan.next();
				int index = -1;
				for(int i = 0; i < subCnt; i++) {
					if(subList[i].subject.equals(subject)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("�����Ϸ��� ������ �����ϴ�.");
				}else {
					System.out.println("�л���ȣ�� �Է��ϼ���");
					int number = scan.nextInt();
					index = -1;
					for(int i = 0; i < subCnt; i++) {
						if(number == subList[i].studentNumber) {
							index = i;
						}
					}
					if(index == -1) {
						System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
					}else {
						for(int i = index; i < subCnt-1; i++) {
							subList[i] = subList[i+1];
						}
						subList[subCnt-1] = null;
						subCnt -= 1;
					}
				}
			}else if(sel == 5) { // ��ü���
				System.out.println("��ȣ , �̸�");
				for(int i = 0; i < stCnt; i++) {
					System.out.println(stList[i].number + " , " + stList[i].name);
				}
				System.out.println("------------------------------");
				System.out.println("��ȣ , ���� , ���� , ���� ���");
				for(int i = 0; i < subCnt; i++) {
					System.out.print(subList[i].studentNumber + " , ");
					System.out.print(subList[i].subject + " , ");
					System.out.print(subList[i].score + " , ");
					System.out.println(subList[i].rank);
				}
				System.out.println("------------------------------");
			}
		}
	
		
	}
}