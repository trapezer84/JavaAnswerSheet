class AnswerSheet5_5 {
	public void One() {
		int i;
		int result=1;
		
		for(i=1; i<10; i++) {
			result *= i;
		}
		System.out.println("1부터 10까지 곱한 값 : " + result);
	}
	
	public void Two() {
		//구구단 5단을 출력하는 프로그램

		System.out.println("구구단 5단을 출력하겠습니다.");
		
		for (int i = 1; i < 10; i++) {
			System.out.println( "5 * " + i + " = " + (5*i));
		}
	}
}
public class Answer5_5 {
	public static void main(String[] args) {
		AnswerSheet5_5 answer = new AnswerSheet5_5();
		answer.One();
		answer.Two();
	}

}
