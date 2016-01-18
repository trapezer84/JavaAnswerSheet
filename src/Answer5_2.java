class AnswerSheet5_2 {
	public void One() {
		int num1 = 50, num2 = 100; 
		int big, diff; 
		
		if(num1 > num2) {
			big = num1;
			System.out.println(big);
			
			diff = num1 - num2;
			System.out.println(diff);
			
		} else {
			big = num2;
			System.out.println(big);
			diff = num2 - num1; 
			System.out.println(diff);
		}
	}
}
public class Answer5_2 {
	public static void main(String[] args) {
		AnswerSheet5_2 answer = new AnswerSheet5_2();
		answer.One();
	}
}
