class AnswerSheet5_3 {

	public void One() {
		
		int num = 3;
		
		if ( num == 1 ) {
			System.out.println("Simple Java");
	
		} else if ( num == 2 ) {
			System.out.println("Funny Java");
		
		} else if (num == 3 ) {
			System.out.println("Fantastic Java"); 
		
		} else {
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like coffee?");
		
	}
	
	public void Two() {
		
		int num = 24; 
		boolean check; 
		
		switch ( num / 10 ) {
		case 0 : 
			System.out.println("0�̻� 10�̸��� ��");
			break;
		case 1 :
			System.out.println("10�̻� 20�̸��� ��");
			break;
		case 2 : 
			System.out.println("20�̻� 30�̸��� ��");
			break;
		default :
			System.out.println("���� Ȥ�� 30 �̻��� ��");
		}
		/*
		switch(check) {
			case (num >= 10) : case (num < 10) :
				System.out.println("0�̻� 10�̸��� ��");
				break;
			case (num >= 10) : case (num < 20) :
				System.out.println("10�̻� 20�̸��� ��");
			case 	

		}
		*/
	}
}
public class Answer5_3 {
	public static void main(String[] args) {
		AnswerSheet5_3 answer = new AnswerSheet5_3();
		answer.One();
		answer.Two();
	}

}
