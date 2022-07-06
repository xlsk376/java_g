package G2_클래스배열1_프로젝트;
import java.util.Scanner;
/*
번호 , 이름
1001 , 김철수 
1002 , 이만수
1003 , 박영희
-------------------------
번호 , 과목 , 점수 , 과목별 등수 
1001 , 수학 , 10 , 3
1001 , 과학 , 32 , 2
1002 , 영어 , 32 , 1
1002 , 국어 , 34 , 1
1002 , 수학 , 54 , 1
1003 , 과학 , 75 , 1
1003 , 수학 , 32 , 2
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

public class 클래스배열1_프로젝트_과목_컨트롤러 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 1000;
		int stSize = max;
		Student [] stList = new Student[stSize]; // 머리 생성
		for(int i = 0; i < stSize; i++) {
			stList[i] = new Student(); // 몸통 생성
		}
		int subSize = max;
		Subject[] subList = new Subject[subSize]; // 머리 생성
		for(int i =0; i < subSize; i++) {
			subList[i] = new Subject(); // 몸통 생성
		}
		int stCnt = 0; // 저장된 학생수
		int subCnt = 0; // 저장된 과목
		while(true) {
			System.out.println("[0] 종료 ");
			System.out.println("[1] 학생저장");
			System.out.println("[2] 학생삭제");
			System.out.println("[3] 과목추가");
			System.out.println("[4] 과목삭제");
			System.out.println("[5] 전체출력");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) { // 학생저장
				System.out.println("학생이름 : ");
				String name = scan.next();
				stList[stCnt].number = max;
				max += 1;
				stList[stCnt].name = name;
				stCnt += 1;
			}else if(sel == 2) { // 학생삭제
				System.out.println("삭제할 이름을 입력하세요.");
				String name = scan.next();
				int index = -1;
				for(int i = 0; i < stCnt; i++) {
					if(name.equals(stList[i].name)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("삭제할 이름이 없습니다.");
				}else {
					for(int i = index; i < stCnt-1; i++) {
						stList[i] = stList[i+1];
					}
					stList[stCnt-1] = null;
					stCnt -= 1;
				}
			}else if(sel == 3) { // 과목추가
				System.out.println("학생번호 입력");
				int number = scan.nextInt();
				System.out.println("과목 입력");
				String subject = scan.next();
				System.out.println("점수 입력");
				int score = scan.nextInt();
				System.out.println("과목별 등수 입력");
				int rank = scan.nextInt();
				subList[subCnt].studentNumber = number;
				subList[subCnt].subject = subject;
				subList[subCnt].score = score;
				subList[subCnt].rank = rank;
				subCnt += 1;
			}else if(sel == 4) { // 과목삭제
				System.out.println("삭제할 과목을 입력하세요");
				String subject = scan.next();
				int index = -1;
				for(int i = 0; i < subCnt; i++) {
					if(subList[i].subject.equals(subject)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("삭제하려는 과목이 없습니다.");
				}else {
					System.out.println("학생번호를 입력하세요");
					int number = scan.nextInt();
					index = -1;
					for(int i = 0; i < subCnt; i++) {
						if(number == subList[i].studentNumber) {
							index = i;
						}
					}
					if(index == -1) {
						System.out.println("일치하는 번호가 없습니다.");
					}else {
						for(int i = index; i < subCnt-1; i++) {
							subList[i] = subList[i+1];
						}
						subList[subCnt-1] = null;
						subCnt -= 1;
					}
				}
			}else if(sel == 5) { // 전체출력
				System.out.println("번호 , 이름");
				for(int i = 0; i < stCnt; i++) {
					System.out.println(stList[i].number + " , " + stList[i].name);
				}
				System.out.println("------------------------------");
				System.out.println("번호 , 과목 , 점수 , 과목별 등수");
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