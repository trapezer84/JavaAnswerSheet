class AnswerSheet5_4 {
	public void One() {

		int num2 = 1;
		int sum = 0; 

		while( num2 < 100) {
			sum +=num2;
			num2++;
		}
		System.out.println(sum);
	}
	
	public void Two() {
		
		
		System.out.println("1~100���� ����ϱ�");
		
		int num=1;
		/*
		while(num<100) {
			num++;
			System.out.print(num+ " ");
		}
		System.out.println();
		System.out.println("100~1���� ����ϱ�");
		do {
			System.out.print(num + " ");
			--num;
		} while (num > 0) ;
		*/
		
		while( num <=100 ) {
			System.out.println(num++);
		}
		System.out.println();
		do {
			System.out.println(num--);			
		} while (num > 0);
		
		
		
		
	}
	
	public void Three () {
		//1000 ������ �ڿ��� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ����ϰ�, 
		// �� ���ڵ��� ���� ���ϴ� ���α׷��� while���� �̿��ؼ� �ۼ��غ���. 
		int num = 1;
		int sum = 0;
		System.out.println();
		System.out.println("2�� 7�� ����� ��°� �հ�");
		
		while ( num < 1000 ) {
			if( num%2==0 && num%7==0 ) {
				System.out.print(num+" ");
				sum += num;
			}
			++num;
		}
		System.out.println();
		System.out.println("�հ�� : "+sum);
	}
}

public class Answer5_4 {
	public static void main(String[] args) {
		
		AnswerSheet5_4 answer = new AnswerSheet5_4();
		answer.One();
		answer.Two();
		answer.Three();
	}

}
