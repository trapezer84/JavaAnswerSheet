class AnswerSheet4_2{
	public void One () {
		int num = 7; 
		num = ~num; //
		num += 1; //2�� ���� ���ϱ� .. 
		System.out.println(num);
		
	}
	
	public void Two () {
		int num = 15678;
		
		if ( num>>2 == 1)
			System.out.println("���������� 3��° ��Ʈ�� 1�̴�.");
		else 
			System.out.println("���������� 3��° ��Ʈ�� 1�� �ƴϴ�.");
		
		if ( num>>4 == 1)
			System.out.println("���������� 5��° ��Ʈ�� 1�̴�.");
		else 
			System.out.println("���������� 5��° ��Ʈ�� 1�� �ƴϴ�.");
		
	}
	
	public void Three () {
		
		int num = 7; 
		int bitset = 1 << 30; 
		num |= bitset;
		System.out.println(num);
		System.out.println(num <<= 1);
		
		num = -12;
		bitset = ~0;
		bitset ^= (1<<30); 
		num &= bitset;
		System.out.println(num);
		System.out.println(num <<=1);		
	}
	
}

public class Answer4_2 {
	
	public static void main (String[] args) {
		
		AnswerSheet4_2 answer = new AnswerSheet4_2();
		answer.One();
		answer.Two();
		answer.Three();
	}

}
