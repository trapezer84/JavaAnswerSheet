class AnswerSheet5_1 {

	public void One(){
		
		int num = 120; 
		
		if ( num>0 && num%2==0 ) {
			System.out.println("����̸鼭 ¦��");
		}
	}
	
	public void Two(){
		int num = 120;
		
		if( num<0 ) {
			System.out.println("0 �̸�");
		} else if ( num < 100 ) {
			System.out.println("0 �̻� 100 �̸�");
		} else if ( num < 200 ) {
			System.out.println("100 �̻� 200 �̸�");
		} else if ( num < 300 ) { 
			System.out.println("200 �̻� 300 �̸�");
		} else if ( 300 <= num ) {
			System.out.println("300 �̻�");
		}
		
	}
	
}
public class Answer5_1 {
	public static void main(String[] args) {
		
		AnswerSheet5_1 answer = new AnswerSheet5_1();
		answer.One();
		answer.Two();
				
	}

}
