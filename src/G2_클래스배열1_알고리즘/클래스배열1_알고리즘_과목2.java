package G2_Ŭ�����迭1_�˰���;

import java.util.Arrays;
import java.util.Scanner;
/*
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
 */
public class Ŭ�����迭1_�˰���_����2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String studentSample = "1001/�̸���\n";
		studentSample += "1002/��ö��\n";		
		studentSample += "1003/������\n";
		
		String subjectSample = "";
		subjectSample += "1001/����/100/0\n";
		subjectSample += "1001/����/32/0\n";
		subjectSample += "1002/����/23/0\n";
		subjectSample += "1002/����/35/0\n";
		subjectSample += "1002/����/46/0\n";
		subjectSample += "1003/����/60/0";
		
		//����1) �� ���ù��ڿ����� ���� �ش� Ŭ�����迭�� ������ ���	
		Student[] stList = null;
		int stSize = 0;
		Subject[] sbList = null;
		int sbSize = 0;
		
		String[] to = studentSample.split("\n");
		stSize = to.length;
		stList = new Student[stSize];
		for(int i = 0; i < stSize; i++) {
			stList[i] = new Student();
			String[] to2 = to[i].split("/");
			stList[i].number = Integer.parseInt(to2[0]);
			stList[i].name = to2[1];
		}
		for(int i = 0; i < stSize; i++) {
			System.out.println(stList[i].number + " " + stList[i].name);
		}
		System.out.println();
		String[] to3 = subjectSample.split("\n");
		sbSize = to3.length;
		sbList = new Subject[sbSize];
		for(int i = 0; i < sbSize; i++) {
			sbList[i] = new Subject();
			String to4[] = to3[i].split("/");
			sbList[i].studentNumber = Integer.parseInt(to4[0]);
			sbList[i].subject = to4[1];
			sbList[i].score = Integer.parseInt(to4[2]);
			sbList[i].rank = Integer.parseInt(to4[3]);
		}
		for(int i = 0; i < sbSize; i++) {
			System.out.println(sbList[i].studentNumber + " " + sbList[i].subject + " " + sbList[i].score + " " + sbList[i].rank);
		}
		System.out.println();
		
		//����2) ������ 59�������� ������ ���� ������ �ٽ� ���ڿ��� ������ ��� 	
		int index = 0;
		for(int i = 0; i < sbSize; i++) {
			if(sbList[i].score <= 59) {
				sbList[i] = null;
			}
		}
		subjectSample = "";
		for(int i = 0; i < sbSize; i++) {
			if(sbList[i] != null) {
				subjectSample += sbList[i].studentNumber + "/";
				subjectSample += sbList[i].subject + "/";
				subjectSample += sbList[i].score + "/";
				subjectSample += sbList[i].rank + "\n";
			}
		}
		subjectSample = subjectSample.substring(0, subjectSample.length()-1);
		System.out.println(subjectSample);
		System.out.println("--------------");
		
	}
}