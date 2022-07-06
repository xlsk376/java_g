package G3_클래스배열2_알고리즘;
import java.util.Arrays;
import java.util.Scanner;
/*
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
}*/

public class 클래스배열2_알고리즘_카트2 {
	public static void main(String[] args) {
		String[] userIdList = {"aaa" , "bbb" , "ccc"};
		
		String[] itemNameList = {"사과" , "칸초" , "귤" , "감"};
		int [] itemPriceList = {10000, 2000, 6500, 3300};
		
		String[] cartUserIdList = {"aaa" , "ccc" , "aaa" , "bbb" , "aaa" ,"ccc"};
		String[] cartItemNameList = {"칸초" , "귤" , "칸초" , "사과" , "감" ,"사과"};
		
		User[] userList = new User[userIdList.length];
		for(int i =0; i < userList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
		}
		Item[] itemList = new Item[itemNameList.length];
		for(int i =0; i < itemList.length; i++) {
			itemList[i] = new Item();
			itemList[i].name = itemNameList[i];
			itemList[i].price = itemPriceList[i];
		}
		Cart[] cartList = new Cart[cartUserIdList.length];
		for(int i =0; i < cartList.length; i++) {
			cartList[i] = new Cart();
			cartList[i].userId = cartUserIdList[i];
			cartList[i].itemName = cartItemNameList[i];
		}
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[0] 종료\n"
					+ "[1] 전체출력\n"
					+ "[2] 회원 aaa가 주문한 각 아이템이름과 가격들을 출력 \n"
					+ "[3] 카트내용을 전부출력(회원 별 아이템 전체와 아이템 가격을 출력)\n"
					+ "[4] 주문한 아이템 갯수가 가장많은 회원출력\n"
					+ "[5] 주문한 아이템 총액이 가장큰 회원출력");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) { // 전체출력
				for(int i = 0; i < userList.length; i++) {
					System.out.println("회원아이디 : "+userList[i].id + " ");
				}
				System.out.println();
				for(int i = 0; i < itemList.length; i++) {
					System.out.println(itemList[i].name + " : " + itemList[i].price +"원");
				}
				System.out.println();
				for(int i = 0; i < cartList.length; i++) {
					System.out.println(cartList[i].userId + " : " + cartList[i].itemName);
				}
				System.out.println();
			}else if(sel == 2) {
				for(int i = 0; i < cartList.length; i++) {
					if("aaa".equals(cartList[i].userId)) {
						System.out.print(cartList[i].itemName + " : ");
						for(int j = 0; j < itemList.length; j++) {
							if(cartList[i].itemName.equals(itemList[j].name)) {
								System.out.println(itemList[j].price + "원");
							}
						}
					}
				}
				System.out.println();
			}else if(sel == 3) { // 카트내용을 전부출력(회원 별 아이템 전체와 아이템 가격을 출력)
				for(int i = 0; i < userList.length; i++) {
					System.out.println(userList[i].id + " ");
					for(int j = 0; j < cartList.length; j++) {
						if(userList[i].id.equals(cartList[j].userId)) {
							System.out.print(cartList[j].itemName + " : ");
							for(int k = 0; k < itemList.length; k++) {
								if(cartList[j].itemName.equals(itemList[k].name)) {
									System.out.println(itemList[k].price +"원 ");
								}
							}
						}
					}
					System.out.println();
				}
			}else if(sel == 4) { // 주문한 아이템 갯수가 가장많은 회원출력
				int cnt[] = new int[3];
				for(int i = 0; i < userList.length; i++) {
					for(int j = 0; j < cartList.length; j++) {
						if(userList[i].id.equals(cartList[j].userId)) {
							cnt[i] += 1;
						}
					}
				}
				//System.out.println(Arrays.toString(cnt));
				int max = 0;
				int index = 0;
				for(int i = 0; i < cnt.length; i++) {
					if(max < cnt[i]) {
						max = cnt[i];
						index = i;
					}
				}
				//System.out.println(index);
				System.out.println(userList[index].id);
				System.out.println();
			}else if(sel == 5) { // 주문한 아이템 총액이 가장큰 회원출력
				int total[] = new int[3];
				for(int i = 0; i < userList.length; i++) {
					for(int j = 0; j < cartList.length; j++) {
						if(userList[i].id.equals(cartList[j].userId)) {
							for(int k = 0; k < itemList.length; k++) {
								if(cartList[j].itemName.equals(itemList[k].name)) {
									total[i] += itemList[k].price;
								}
							}
						}
					}
				}
				//System.out.println(Arrays.toString(total));
				int max = 0;
				int index = 0;
				for(int i = 0; i < total.length; i++) {
					if(max < total[i]) {
						max = total[i];
						index = i;
					}
				}
				//System.out.println(index);
				System.out.println(userList[index].id);
				System.out.println();
			}
		}
		
		
		
	}
}