package G2_Ŭ�����迭1_�⺻�̷�;
import java.util.Scanner;
/*
class Member{
	int number; String id; String pw; String name; int score;
}
 */
public class Ŭ�����迭1_�⺻�̷�5_�迭_��Ʈ�ѷ� {
	public static void main(String[] args) {
		
		int max = 100;
		Member[] memberList = new Member[max]; // �Ӹ�
		
		// Ŭ�����迭�� �̿��ؼ� crud ����
		int size = 0;
		int num = 1000; // ��ȣ�� 1000���� ����	
		Scanner scan = new Scanner(System.in);	
		
		while(true) {
			System.out.println("[1]���� [2]Ż�� [3]���� [4]�˻� [5] ��ü��� [0]����");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				Member member = new Member(); // ��ü - ����(���� ���ý� �������)
				member.number = num;
				num += 1;
				System.out.println("���̵� : ");
				member.id = scan.next();
				System.out.println("��й�ȣ : ");
				member.pw = scan.next();
				System.out.println("�̸� : ");
				member.name = scan.next();
				System.out.println("���� : ");
				member.score = scan.nextInt();
				memberList[size] = member;
				size += 1;
			}
			else if(sel == 2) {
				System.out.println("���̵� : ");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < size; i++) {
					if(memberList[i].id.equals(id)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("����");
				}else {
					for(int i = index; i < size-1; i++) {
						memberList[i] = memberList[i+1];
					}
				}
				memberList[size-1] = null;
				size -= 1;
			}
			else if(sel == 5) {
				for(int i = 0; i < size; i++) {
					System.out.println(memberList[i].number + " " + memberList[i].id);
				}
			}else if(sel == 0) {
				break;
			}
		}	
	}
}