package G3_Ŭ�����迭2_�˰���;

import java.util.Scanner;

class Member{
	int number;
	String id;
	String name;
}
class Account{
	String accountNumber;
	String password;
	int money;
	String memberId;
}

public class Ŭ�����迭2_�˰���_ATM {
	public static void main(String[] args) {
		String[][] memberData = {
				{"1001" , "qwer" , "��ö��"},
				{"1002" , "mmkk11" , "�̿���"},
				{"1003" , "javaking123" , "�ֹμ�"}			
		};	
		String[][] accountData = {
				{"111111111" , "1234" ,"100000" , "qwer"},
				{"222222222" , "1234" ,"200000" , "mmkk11"},
				{"333333333" , "1234" ,"300000" , "mmkk11"},
				{"444444444" , "1234" ,"400000" , "javaking123"},
				{"555555555" , "1234" ,"500000" , "qwer"},
				{"666666666" , "1234" ,"600000" , "qwer"},
		};
		Account[] accountList = new Account[accountData.length];
		Member[] memberList = new Member[memberData.length];
		Scanner scan = new Scanner(System.in);
		while(true) {
			String menu = "";
			menu += "[0] ���� \n";
			menu += "[1] ��data�迭���� ������ Ŭ�����迭�� ������ ��� \n";
			menu += "[2] ȸ�����̵� �Է¹ް� ���º� �ܾ����  \n";
			menu += "[3] 222222222 ���¿��� 444444444 ���·� 5000���۱��� ��ü��� \n";
			System.out.println(menu);
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) { // ��data�迭���� ������ Ŭ�����迭�� ������ ���
				for(int i = 0; i < memberData.length; i++) {
					memberList[i] = new Member();
					memberList[i].number = Integer.parseInt(memberData[i][0]);
					memberList[i].id = memberData[i][1];
					memberList[i].name = memberData[i][2];
				}
				for(int i = 0; i < accountData.length; i++) {
					accountList[i] = new Account();
					accountList[i].accountNumber = accountData[i][0];
					accountList[i].password = accountData[i][1];
					accountList[i].money = Integer.parseInt(accountData[i][2]);
					accountList[i].memberId = accountData[i][3];
				}
				System.out.println("��ȣ , ���̵� , �̸�");
				for(int i = 0; i < memberData.length; i++) {
					System.out.println(memberList[i].number + " " + memberList[i].id + " " + memberList[i].name);
				}
				System.out.println("----------------------------");
				System.out.println("���¹�ȣ, ��й�ȣ, ��, ���̵�");
				for(int i = 0; i < accountData.length; i++) {
					System.out.print(accountList[i].accountNumber + " ");
					System.out.print(accountList[i].password + " ");
					System.out.print(accountList[i].money + " ");
					System.out.println(accountList[i].memberId + " ");
				}
				
			}else if(sel == 2) { // ȸ�����̵� �Է¹ް� ���º� �ܾ����
				System.out.println("���̵� �Է��ϼ���");
				String id = scan.next();
				for(int i = 0; i < accountData.length; i++) {
					if(id.equals(accountList[i].memberId)) {
						System.out.println("���� : "+accountList[i].accountNumber + " " + "�ܾ� : " + accountList[i].money);
					}
				}
				System.out.println();
			}else if(sel == 3) { // 222222222 ���¿��� 444444444 ���·� 5000���۱��� ��ü���
				int index = 0;
				int index1 = 0;
				for(int i = 0; i < accountData.length; i++) {
					if("222222222".equals(accountList[i].accountNumber)) {
						index = i;
					}else if("444444444".equals(accountList[i].accountNumber)) {
						index1 = i;
					}
				}
				accountList[index].money -= 5000;
				accountList[index1].money += 5000;
				for(int i = 0; i < accountData.length; i++) {
					System.out.print(accountList[i].accountNumber + " ");
					System.out.print(accountList[i].password + " ");
					System.out.print(accountList[i].money + " ");
					System.out.println(accountList[i].memberId + " ");
				}
				
			}
		}
		
	}
}