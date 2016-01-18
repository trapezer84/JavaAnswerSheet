class AnswerSheet5_1 {

	public void One(){
		
		int num = 120; 
		
		if ( num>0 && num%2==0 ) {
			System.out.println("양수이면서 짝수");
		}
	}
	
	public void Two(){
		int num = 120;
		
		if( num<0 ) {
			System.out.println("0 미만");
		} else if ( num < 100 ) {
			System.out.println("0 이상 100 미만");
		} else if ( num < 200 ) {
			System.out.println("100 이상 200 미만");
		} else if ( num < 300 ) { 
			System.out.println("200 이상 300 미만");
		} else if ( 300 <= num ) {
			System.out.println("300 이상");
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
