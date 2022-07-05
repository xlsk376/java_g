package G2_클래스배열1_알고리즘;

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
public class 클래스배열1_알고리즘_과목2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String studentSample = "1001/이만수\n";
		studentSample += "1002/김철만\n";		
		studentSample += "1003/오수정\n";
		
		String subjectSample = "";
		subjectSample += "1001/국어/100/0\n";
		subjectSample += "1001/수학/32/0\n";
		subjectSample += "1002/국어/23/0\n";
		subjectSample += "1002/수학/35/0\n";
		subjectSample += "1002/영어/46/0\n";
		subjectSample += "1003/수학/60/0";
		
		//문제1) 위 샘플문자열들을 각각 해당 클래스배열에 저장후 출력	
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
		
		//문제2) 점수가 59점이하인 과목은 전부 삭제후 다시 문자열로 저장후 출력 	
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