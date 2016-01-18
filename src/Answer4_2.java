class AnswerSheet4_2{
	public void One () {
		int num = 7; 
		num = ~num; //
		num += 1; //2의 보수 구하기 .. 
		System.out.println(num);
		
	}
	
	public void Two () {
		int num = 15678;
		
		if ( num>>2 == 1)
			System.out.println("오른쪽으로 3번째 비트는 1이다.");
		else 
			System.out.println("오른쪽으로 3번째 비트는 1이 아니다.");
		
		if ( num>>4 == 1)
			System.out.println("오른쪽으로 5번째 비트는 1이다.");
		else 
			System.out.println("오른쪽으로 5번째 비트는 1이 아니다.");
		
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
