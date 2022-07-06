package G3_클래스배열2_프로젝트;
import java.util.Arrays;
import java.util.Scanner;
class User{
	String id;
}
class Item{
	String name;
	int price;
}
class Cart{
	String userId;
	String itemName;
}

public class 클래스배열2_프로젝트_관리자_컨트롤러 {
	public static void main(String[] args) {
		String[] userIdList = {"admin" , "bbb" , "ccc"};
		
		String[] itemNameList = {"사과" , "칸초" , "귤" , "감"};
		int [] itemPriceList = {10000, 2000, 6500, 3300};
		
			
		int max =1000;
		User[] userList = new User[max];
		int userSize= 0;
		for(int i = 0; i < userIdList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
			userSize += 1;
		}
		
		Item[] itemList = new Item[max];
		int itemSize= 0;
		for(int i = 0; i < itemNameList.length; i++) {
			itemList[i] = new Item();
			itemList[i].name = itemNameList[i];
			itemList[i].price = itemPriceList[i];
			itemSize += 1;
		}
		Cart[] cartList = new Cart[max];
		int cartSize= 0;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[0] 종료 [1] 로그인 [2] 회원가입 ");
			int sel =scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.println("[로그인] 아이디 입력 : ");				
				String id = scan.next();
				
				boolean idCheck = false;
				for(int i = 0; i < userSize; i++) {
					if(id.equals(userList[i].id)) {
						idCheck = true;
					}
				}
				
				if(idCheck == false) {
					System.out.println("[로그인실패]");
					continue;
				}
				
				if(id.equals("admin")) {					
					while(true) {
						System.out.println("[관리자메뉴]");
						System.out.println("[0] 로그아웃 [1] 아이템 추가 [2] 아이템 삭제");
						sel = scan.nextInt();
						if(sel == 0) {
							break;
						}else if(sel == 1) { // 아이템추가
							System.out.println("추가할 아이템 입력");
							String name = scan.next();
							boolean itemCheck = false;
							for(int i = 0; i < itemSize; i++) { // 전체검사시 null이 있으면 에러가 발생하므로 검색범위 지정확인하기
								if(name.equals(itemList[i].name)) {
									itemCheck = true;
								}
							}
							if(itemCheck == true) {
								System.out.println("기존에 있는 아이템입니다.");
							}else {
								System.out.println("가격을 입력하세요");
								int price = scan.nextInt();
								itemList[itemSize] = new Item();
								itemList[itemSize].name = name;
								itemList[itemSize].price = price;
								itemSize += 1;
							}
						}else if(sel == 2) { // 아이템삭제
							System.out.println("삭제할 아이템 입력");
							String name= scan.next();
							boolean itemCheck = false;
							int index = 0;
							for(int i = 0; i < itemSize; i++) {
								if(name.equals(itemList[i].name)) {
									itemCheck = true;
									index = i;
								}
							}
							if(itemCheck == true) {
								for(int i = index; i < itemSize-1; i++) {
									itemList[i] = itemList[i+1];
								}
								itemList[itemSize-1] = null;
								itemSize -= 1;
							}else {
								System.out.println("삭제할 아이템이 없습니다.");
							}
						}
					}
				}else {
					while(true) {
						System.out.println("[" + id + " 로그인]");
						System.out.println("[쇼핑메뉴]");
						
						System.out.println("[0] 로그아웃 [1] 쇼핑 [2] 주문확인 [3] 탈퇴");
						sel = scan.nextInt();
						if(sel == 0) {
							break;
						}else if(sel == 1) { // 쇼핑
							for(int i = 0; i < itemSize; i++) {
								System.out.println(itemList[i].name + " : " + itemList[i].price +"원");
							}
							System.out.println("상품을 고르세요");
							String name = scan.next();
							int index = -1;
							for(int i = 0; i < itemSize; i++) {
								if(name.equals(itemList[i].name)) {
									index = i;
								}
							}
							if(index == -1) {
								System.out.println("없는 상품입니다.");
							}else {
								cartList[cartSize] = new Cart();
								cartList[cartSize].itemName = name;
								cartList[cartSize].userId = id;
								cartSize += 1;
							}
						}else if(sel == 2) { // 주문확인
							for(int i = 0; i < cartSize; i++) {
								if(id.equals(cartList[i].userId)) {
									System.out.println(cartList[i].itemName);
								}
							}
						}else if(sel == 3) { // 탈퇴
							System.out.println("탈퇴하시겠습니까?");
							System.out.println("yes or no");
							String quit = scan.next();
							int index = 0;
							if("yes".equals(quit)) {
								for(int i = 0; i < userSize; i++) {
									if(id.equals(userList[i].id)) {
										index = i;
									}
								}
								for(int i = index; i < userSize-1; i++) {
									userList[i] = userList[i+1];
								}
								userList[userSize-1] = null;
								userSize -= 1;
								break;
							}else if("no".equals(quit)) {
								continue;
							}
						}
					}
				}			
			}else if(sel == 2) { // 회원가입
				System.out.println("가입할 아이디 입력");
				String id = scan.next();
				boolean idCheck = false;
				for(int i = 0; i < userSize; i++) {
					if(id.equals(userList[i].id)) {
						idCheck = true;
					}
				}
				if(idCheck == true) {
					System.out.println("아이디가 존재합니다.");
				}else {
					userList[userSize] = new User();
					userList[userSize].id = id;
					userSize += 1;
					System.out.println("가입되었습니다.");
				}
			}
			
		}
		
		
	}
}