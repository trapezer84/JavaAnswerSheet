import java.util.Scanner;

/*
 * [��� �޼ҵ��� ����]
 * 
 * ����1. 
 * ���� N�� ���޹޾Ƽ�, 2�� N���� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 ����� ���·� �����ϰ�,
 * ���� �׽�Ʈ�� ���� main �޼ҵ嵵 �Բ� ��������. 
 * 
 * ����2. 
 * 10���� ������ ���޹޾Ƽ�, ���޹��� ������ �ش��ϴ� 2������ ����ϴ� �޼ҵ��� ����� 
 * ���·� �����ϰ�, ���� �׽�Ʈ�� ���� main �޼ҵ嵵 �Բ� ��������. ����� ������ �پ���
 * ��¹���� �Ұ����� �ʾ�����, ���� �ٿ� ���ļ� ����� �̷������� �޼ҵ带 ��������. 
 * 
 */
public class Answer6_3 {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("���� N�� ���޹޾Ƽ�, 2�� N���� ����ϱ� ���� ���� N�� �Է�: ");
		Scanner userInput = new Scanner(System.in);
		num = userInput.nextInt();
		System.out.println(answerSheet1(num));
		
		System.out.println("10������ 2������ ��ȯ��Ű�� ���� 10������ �Է� :");
		num = userInput.nextInt();
		System.out.println(num+"�� 2������: ");
		answerSheet2(num);
		
		System.out.println("�������");
		toBinary(num);
	}
	
	public static int answerSheet1 (int num) {
		
		if( num == 1 ) 
			return 2;
		else {
			return 2 * answerSheet1(num-1);
		}
	}
	
	public static void answerSheet2 (int num) {
		

		if (num/2 != 1) { //�� ó�� 2�� ������ �� ���� 1�� ������ ���� ��� �� 2,3�� �ƴѰ��
			if( num%2 == 0) //�������� ���ؼ� ������ش�. 
				System.out.print(0);
			else
				System.out.print(1);
			answerSheet2(num/2); //�������� �� ������ 
		}
		else {
			System.out.print(1);
		}
		
		
	}
	
	
	/*
	 * toBinaryCode Solution ver.
	 */
	public static int toBinary (int decimal) {
		
		if(decimal > 0) {
			int bin;
			bin = decimal%2;
			decimal /= 2;
			toBinary(decimal);
			System.out.println(bin);
		}
		return 0;
	}
}
