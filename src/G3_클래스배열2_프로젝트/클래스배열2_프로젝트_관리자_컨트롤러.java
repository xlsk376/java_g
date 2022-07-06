package G3_Ŭ�����迭2_������Ʈ;
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

public class Ŭ�����迭2_������Ʈ_������_��Ʈ�ѷ� {
	public static void main(String[] args) {
		String[] userIdList = {"admin" , "bbb" , "ccc"};
		
		String[] itemNameList = {"���" , "ĭ��" , "��" , "��"};
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
			System.out.println("[0] ���� [1] �α��� [2] ȸ������ ");
			int sel =scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.println("[�α���] ���̵� �Է� : ");				
				String id = scan.next();
				
				boolean idCheck = false;
				for(int i = 0; i < userSize; i++) {
					if(id.equals(userList[i].id)) {
						idCheck = true;
					}
				}
				
				if(idCheck == false) {
					System.out.println("[�α��ν���]");
					continue;
				}
				
				if(id.equals("admin")) {					
					while(true) {
						System.out.println("[�����ڸ޴�]");
						System.out.println("[0] �α׾ƿ� [1] ������ �߰� [2] ������ ����");
						sel = scan.nextInt();
						if(sel == 0) {
							break;
						}else if(sel == 1) { // �������߰�
							System.out.println("�߰��� ������ �Է�");
							String name = scan.next();
							boolean itemCheck = false;
							for(int i = 0; i < itemSize; i++) { // ��ü�˻�� null�� ������ ������ �߻��ϹǷ� �˻����� ����Ȯ���ϱ�
								if(name.equals(itemList[i].name)) {
									itemCheck = true;
								}
							}
							if(itemCheck == true) {
								System.out.println("������ �ִ� �������Դϴ�.");
							}else {
								System.out.println("������ �Է��ϼ���");
								int price = scan.nextInt();
								itemList[itemSize] = new Item();
								itemList[itemSize].name = name;
								itemList[itemSize].price = price;
								itemSize += 1;
							}
						}else if(sel == 2) { // �����ۻ���
							System.out.println("������ ������ �Է�");
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
								System.out.println("������ �������� �����ϴ�.");
							}
						}
					}
				}else {
					while(true) {
						System.out.println("[" + id + " �α���]");
						System.out.println("[���θ޴�]");
						
						System.out.println("[0] �α׾ƿ� [1] ���� [2] �ֹ�Ȯ�� [3] Ż��");
						sel = scan.nextInt();
						if(sel == 0) {
							break;
						}else if(sel == 1) { // ����
							for(int i = 0; i < itemSize; i++) {
								System.out.println(itemList[i].name + " : " + itemList[i].price +"��");
							}
							System.out.println("��ǰ�� ������");
							String name = scan.next();
							int index = -1;
							for(int i = 0; i < itemSize; i++) {
								if(name.equals(itemList[i].name)) {
									index = i;
								}
							}
							if(index == -1) {
								System.out.println("���� ��ǰ�Դϴ�.");
							}else {
								cartList[cartSize] = new Cart();
								cartList[cartSize].itemName = name;
								cartList[cartSize].userId = id;
								cartSize += 1;
							}
						}else if(sel == 2) { // �ֹ�Ȯ��
							for(int i = 0; i < cartSize; i++) {
								if(id.equals(cartList[i].userId)) {
									System.out.println(cartList[i].itemName);
								}
							}
						}else if(sel == 3) { // Ż��
							System.out.println("Ż���Ͻðڽ��ϱ�?");
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
			}else if(sel == 2) { // ȸ������
				System.out.println("������ ���̵� �Է�");
				String id = scan.next();
				boolean idCheck = false;
				for(int i = 0; i < userSize; i++) {
					if(id.equals(userList[i].id)) {
						idCheck = true;
					}
				}
				if(idCheck == true) {
					System.out.println("���̵� �����մϴ�.");
				}else {
					userList[userSize] = new User();
					userList[userSize].id = id;
					userSize += 1;
					System.out.println("���ԵǾ����ϴ�.");
				}
			}
			
		}
		
		
	}
}