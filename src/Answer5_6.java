class AnswerSheet5_6 {
	public void One() {
		//while ���� for������ �ٲ���
		int num = 0; 
		int count = 0;
		int count2 = 0;
		for ( num = 1; num < 100; num++) {
			if(num%5 == 0 && num%7 == 0){
				count ++;
				System.out.println(num);
			}
		}
		
	}
	
	public void Two() {
		int num = 1; 
		int sum=0;
		while (sum < 1000) {
			num++;
			if( num%2 !=0 || (num%3==0 && num%2==0)) {
				sum += num;
			}
		}
		System.out.println(num+ "�� ������ �� 1000�� �Ѿ�� �հ谡 " + sum + "�� �ȴ�.");
	}
}
public class Answer5_6 {
	
	public static void main(String[] args) {
		AnswerSheet5_6 answer = new AnswerSheet5_6();
		answer.One();
		answer.Two();
	}

}
