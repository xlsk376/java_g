package G2_Ŭ�����迭1_�⺻�̷�;
/*
class Member{
	int number; String id; String pw; String name; int score;
}
 */
public class Ŭ�����迭1_�⺻�̷�3_�迭 {
	public static void main(String[] args) {
		
		String dataList[][] ={
				{"1001" , "qwer" , "1234", "��ö��" , "10"},
				{"1002" , "asdf" , "2345", "�̿���" , "30"},
		};	
		
		int size = dataList.length;
		Member[] memberList = new Member[size];
		
		for(int i = 0; i < size; i++) {
			Member m = new Member();
			m.number = Integer.parseInt(dataList[i][0]);
			m.id = dataList[i][1];
			m.pw = dataList[i][2];
			m.name =  dataList[i][3];
			m.score = Integer.parseInt(dataList[i][4]);
			memberList[i] = m;
		}
		
		
	}
}