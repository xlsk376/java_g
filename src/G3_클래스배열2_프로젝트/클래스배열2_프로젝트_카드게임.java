package G3_Ŭ�����迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;

class Card{
	String shape;
	String number;	
}

public class Ŭ�����迭2_������Ʈ_ī����� {
	public static void main(String[] args) {

		// ī����� 
		// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι� 
		// 2) ����      :  1~10 , j , q , k 
		
		// �� 52���� ī�带 ������
		// ����� ���������� ������ ��������. �ƴϸ� ��¸� �غ�����.
		Card cardList[] = new Card[100];
		String shape = "���̾�,��Ʈ,�����̵�,Ŭ�ι�";
		String number= "1,2,3,4,5,6,7,8,9,10,j,q,k";
		String shapeTo[] = shape.split(",");
		String numberTo[] = number.split(",");
		int index = 0;
		for(int i = 0; i < shapeTo.length; i++) {
			cardList[index] = new Card();
			cardList[i].shape = shapeTo[i];
			index += 1;
		}
		for(int i = 0; i < numberTo.length; i++) {
			cardList[index] = new Card();
			cardList[i].number = numberTo[i];
			index += 1;
		}
		for(int i = 0; i < shapeTo.length; i++) {
			if(cardList[i].shape.equals("���̾�")) {
				System.out.println("��");
			}else if(cardList[i].shape.equals("��Ʈ")) {
				System.out.println("��");
			}else if(cardList[i].shape.equals("�����̵�")) {
				System.out.println("��");
			}else if(cardList[i].shape.equals("Ŭ�ι�")) {
				System.out.println("��");
			}
			for(int j = 0; j < numberTo.length; j++) {
				System.out.print(cardList[j].number + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}