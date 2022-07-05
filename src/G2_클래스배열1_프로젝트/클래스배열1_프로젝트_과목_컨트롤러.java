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
			}else if(sel == 1) {			
				System.out.println("학생이름 : ");
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