package G1_Ŭ����_�⺻�̷�;

class Sample3 {
	int arr[] = { 10, 20, 30, 40, 50 };
}

public class Ŭ����1_�⺻�̷�2_�޸𸮱���4 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		Sample3 s3 = new Sample3();

		Sample3 temp3 = s3;
		s3 = null;
		s3.arr = arr; // �����߻�

	}
}