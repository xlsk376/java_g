package G1_Ŭ����_�⺻�̷�;
class Member{
	int number;
	String name; 
	String position; 
	int superiorNumber;
	String regDate;
	int salary;
	int commission;
	int departmentNumber;
}

public class Ŭ����1_�⺻�̷�1_Ŭ����4 {
	public static void main(String[] args) {		
		//Ŭ������ ��¥�뵵 (�̹��ܿ��� �����ϰ� �����ܿ����� ��¥�� ����)			
		// 1) �迭�� ����ؼ� ���α׷��� ���鶧�� ������ 		
		// 2) �Ʒ��� ���� �����Ͱ� ������ �迭�� ����Ҷ��� �ѹ迭�ȿ� ���� ������ �ڷ��������尡���ϴ�.
		//    - [1] �ᱹ , �������������ʹ� ��� ����ȯ�� ����ؾ��Ѵ�. 
		//    - [2] ���� �����͸� �˻��Ҷ� employeeData[0][0] , employeeData[0][1] ��
		//		       �ε����� ã�ƾ��ϴµ� �����Ͱ� �������� �ε�����ã�Ⱑ �����ϴ�.
		// ----------------------------------------------------------------
		// [�������]
		// [��ȣ,�̸�,��å,����ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
		String[][] memberList = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" }};		
				
		String[] numList = {"7369" , "7499" , "7521"};
		String[] nameList = {"SMITH" , "ALLEN" , "WARD"};
		String[] bossList = {"CLERK" , "SALESMAN" , "SALESMAN"};
		int [] salaryList = { 800 , 1600, 1250};
		
		// 3) �Ʒ��Ͱ��� ���ڿ� , ���� �̷��� ��� �����ϰ���� ���̵��� ���� 
		/*
			{ 7369, "SMITH", "CLERK", 7902, "17-12-1980", 800, 0, 20 }
			{ 7499, "SMITH", "CLERK", 7698, "17-12-1980", 1600, 300, 30 }
			{ 7521, "SMITH", "CLERK", 7698, "17-12-1980", 1250, 500, 30 }
		*/
		// 4) �������͸� Ŭ������ �ٲٸ� ������ ���������� �����͸� �����Ҽ��ִ�.
		Member member = new Member();
		member.number = 7369;
		member.name = "SMITH";
		member.position = "CLERK";
		member.superiorNumber = 7902;
		member.regDate = "17-12-1980";
		member.salary = 800;
		member.commission = 0;
		member.departmentNumber = 20;  
		
		// �� Ŭ������ �迭�� ����� �������� �ȴ�.
	}
}