package G1_Ŭ����_�˰���;

import java.util.Arrays;

class Test05{	
	
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  99,   11};

}
public class Ŭ����1_�˰���_����2 {
	public static void main(String[] args) {
		// �޸𸮼���
		int arr[] = new int[3];
		
		Test05 t5;
		
		t5 = new Test05();
		
		arr = t5.arScore;
		arr[1] = 100;
		
		System.out.println(Arrays.toString(t5.arScore));
		
		Test05 t5_1 = t5;
		
		t5_1.arScore[2] = 100;
		
		System.out.println(Arrays.toString(t5.arScore));
		
	}
}