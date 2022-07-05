package G2_Ŭ�����迭1_�˰���;

import java.util.Scanner;

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

public class Ŭ�����迭1_�˰���_����1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = {1001,1002,1003};
		String nameList[] = {"�̸���" , "��ö��" , "������"};
		
		int studentNumberList[] = {1001,1001,1002,1002,1002,1003};
		String subjectList[] = {"����" , "����" , "����" , "����" ,"����" , "����"};
		int scoreList [] = {100,32,23,35,46,60};
		int rankList[]  = {0,0,0,0,0,0};
		
		//����1) �� �迭�� Ŭ���� �迭�� ���� 
				
		int stSize = numberList.length;
		Student [] stList = new Student[stSize]; // �Ӹ�����
		for(int i = 0; i < stSize; i++) {
			stList[i] = new Student(); // ��ü(����) ����
			stList[i].name = nameList[i];
			stList[i].number = numberList[i];
		}
		
		int subSize = studentNumberList.length;
		Subject[] subList = new Subject[subSize]; // �Ӹ�����
		for(int i =0; i < subSize; i++) {
			subList[i] = new Subject(); // ��ü(����) ����
			subList[i].studentNumber = studentNumberList[i];
			subList[i].subject = subjectList[i];
			subList[i].score = scoreList[i];
			subList[i].rank = rankList[i];
									
		}		
		while(true) {
			System.out.println("[0] ���� ");
			System.out.println("[1] �л� ���� ��� ");
			System.out.println("[2] ���� ���� ��� ");
			System.out.println("[3] ���� ��ŷ ���� ");
			System.out.println("[4] ���� ��ŷ + �̸� ���");
			System.out.println("[5] ���� ��ŷ 1���� �̸� ���� ���� ��� ");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {			
				for(int i = 0; i < stSize; i++) {
					System.out.println(stList[i].number + " " + stList[i].name);
				}
				System.out.println("---------------------------------------");	
			}else if(sel == 2) { // ���� ���� ���
				for(int i =0; i < subSize; i++) {
					System.out.print(subList[i].studentNumber + " ");
					System.out.print(subList[i].subject + " ");
					System.out.print(subList[i].score + " ");
					System.out.print(subList[i].rank + " ");
					System.out.println();
				}
				System.out.println("---------------------------------------");	
			}else if(sel == 3) { // ���� ��ŷ ����              
				for(int i = 0; i <subSize; i++ ) {
					int rank = 1;
					for(int j = 0 ; j < subSize; j++) {
						if(subList[i].subject.equals(subList[j].subject)) {
							if(subList[i].score < subList[j].score) {
								rank += 1;
							}
						}
					}
					subList[i].rank = rank;		
				}
				
			}else if(sel == 4) { // ���� ��ŷ + �̸� ���
				for(int i = 0; i < stSize; i++) {
					for(int j =0; j < subSize; j++) {
						if(stList[i].number == subList[j].studentNumber) {
							System.out.print(subList[j].studentNumber + " ");
							System.out.print(subList[j].subject + " ");
							System.out.print(subList[j].score + " ");
							System.out.print(subList[j].rank + " ");
							System.out.print(stList[i].name + " ");
							System.out.println();
						}
					}
				}
			}else if(sel == 5) { // ���� ��ŷ 1���� �̸� ���� ���� ���
				for(int i = 0; i <subSize; i++ ) {
					int rank = 1;
					for(int j = 0 ; j < subSize; j++) {
						if(subList[i].subject.equals(subList[j].subject)) {
							if(subList[i].score < subList[j].score) {
								rank += 1;
							}
						}
					}
					subList[i].rank = rank;		
				}
				for(int i = 0; i < stSize; i++) {
					for(int j = 0; j < subSize; j++) {
						if(stList[i].number == subList[j].studentNumber) {
							if(subList[j].rank == 1) {
								System.out.print(subList[j].studentNumber + " ");
								System.out.print(subList[j].subject + " ");
								System.out.print(subList[j].score + " ");
								System.out.print(subList[j].rank + " ");
								System.out.print(stList[i].name + " ");
								System.out.println();
								
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
	}
}