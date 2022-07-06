package G3_클래스배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;

class Card{
	String shape;
	String number;	
}

public class 클래스배열2_프로젝트_카드게임 {
	public static void main(String[] args) {

		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버 
		// 2) 숫자      :  1~10 , j , q , k 
		
		// 총 52개의 카드를 만들어보자
		// 만들고 싶은게임이 있으면 만들어보세요. 아니면 출력만 해보세요.
		Card cardList[] = new Card[100];
		String shape = "다이아,하트,스페이드,클로버";
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
			if(cardList[i].shape.equals("다이아")) {
				System.out.println("◇");
			}else if(cardList[i].shape.equals("하트")) {
				System.out.println("♡");
			}else if(cardList[i].shape.equals("스페이드")) {
				System.out.println("♤");
			}else if(cardList[i].shape.equals("클로버")) {
				System.out.println("♧");
			}
			for(int j = 0; j < numberTo.length; j++) {
				System.out.print(cardList[j].number + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}