class AnswerSheet5_5 {
	public void One() {
		int i;
		int result=1;
		
		for(i=1; i<10; i++) {
			result *= i;
		}
		System.out.println("1���� 10���� ���� �� : " + result);
	}
	
	public void Two() {
		//������ 5���� ����ϴ� ���α׷�

		System.out.println("������ 5���� ����ϰڽ��ϴ�.");
		
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
