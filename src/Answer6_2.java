
public class Answer6_2 {
	
	public static void main(String[] args) {
		
		answerSheet1(10);
		answerSheet2(13);
	}
	
	public static void answerSheet1 (int num) {
		//num�� ������
		System.out.println("������ : " + num);
		
		double area = 3.14 * num * num;
		System.out.println("���� ���� : "+area);
		
		double cir; //���� 
		cir = 2 * num * 3.14;
		System.out.println("���� : " + cir);
		
	}
	
	public static void answerSheet2 (int num) {
		boolean primeNumber = false;
		
		for(int i=2; i<num; i++){
			if( (num%i) == 0) {
				primeNumber = false;
				break;
			} 
			primeNumber = true;
			
		}
		
		
		if(primeNumber == true) 
			System.out.println("�Ҽ���. " + primeNumber);
		else 
			System.out.println("�Ҽ� �ƴϴ�. " + primeNumber);

	}
}
