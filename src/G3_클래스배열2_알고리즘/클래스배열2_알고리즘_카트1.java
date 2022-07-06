package G3_Ŭ�����迭2_�˰���;

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
public class Ŭ�����迭2_�˰���_īƮ1 {
	public static void main(String[] args) {
		// [����] qwer �� ������ ������ �ѱݾ�
		String data1 = "qwer/asdf/zxcv";
		String data2 = "�����,1200/���ڱ�,3200/������,2100";
		String data3 = "qwer,�����/qwer,������/asdf,���ڱ�/qwer,�����/zxcv,�����";

		User[]userList; // �Ӹ�
		Item[]itemList;
		Cart[]cartList;
	
		// ���ڿ��� ������ Ŭ�����迭�� ����
		String [] tokens = data1.split("/");
		int userSize = tokens.length;
		userList = new User[userSize];
		for(int i = 0; i < userSize; i++) {
			userList[i] = new User(); // ����
			userList[i].id = tokens[i];
		}
		tokens = data2.split("/");
		int itemSize = tokens.length;
		itemList = new Item[itemSize];
		for(int i = 0; i < itemSize; i++) {
			String[] tokens2 = tokens[i].split(",");
			int price = Integer.parseInt(tokens2[1]);
			itemList[i] = new Item();
			itemList[i].name = tokens2[0];
			itemList[i].price = price;
		}
		
		tokens = data3.split("/");
		int cartSize=  tokens.length;
		cartList = new Cart[cartSize];
		for(int i = 0; i < cartSize; i++) {
			cartList[i] = new Cart();
			
			String[] tokens2 = tokens[i].split(",");
			cartList[i].userId = tokens2[0];
			cartList[i].itemName = tokens2[1];			
		}
		
		int total = 0;
		for(int i = 0; i < cartSize; i++) {
			if(cartList[i].userId.equals("qwer")) {
				for(int j = 0; j < itemSize; j++) {
					if(cartList[i].itemName.equals(itemList[j].name)) {
						total += itemList[j].price;
					}
				}
			}
		}
		System.out.println(total);
		
		
	}

}