package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Test07{
	int[] seat = new int[7];
	int money = 0;
}

public class 클래스1_알고리즘_예매 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Test07 e = new Test07();
		int cash = 12000;
		while(true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			System.out.println(Arrays.toString(e.seat));
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("좌석을 선택하세요.");
				int n = scan.nextInt();
				if(e.seat[n] == 1) {
					System.out.println("이미 예매된 좌석입니다.");
				}else {
					e.seat[n] = 1;
				}
			}
			else if(sel == 2) {
				int count = 0;
				for(int i = 0; i < e.seat.length; i++) {
					if(e.seat[i] == 1) {
						count += 1;
					}
				}
				e.money = cash*count;
				System.out.println("총금액 : " + e.money + "원");
				break;
			}
		}


	}
}