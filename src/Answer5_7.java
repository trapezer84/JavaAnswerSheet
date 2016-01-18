class AnswerSheet5_7 {
	
	public void One() {
		int i = 2;
		int j;
		// i = i<<1; 는 2 , i<<2 는 8, i<<3 
		
		for(i=2; i<10; i=i<<1) {
			System.out.println(i);
			for(int m=1; m<=i; m++) {
				System.out.println(i + " X " + m + " = " +(i*m));
			}
		}
	}
	
	public void Two() {
		int i;
		int j;
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				if(i+j==9) {
					System.out.println("AB는 " + i + j + ", BA는 "+ j +i);
					
				}
			}
		}
		
		System.out.println("답안지 답안");
		for(int m=0; m<10; m++) {
			for(int n=0; n<10; n++) {
				if(  (m*10+n)+(n*10+m) == 99 )
						System.out.println(m + " and " + n);
			}
		}
	}
	
}
public class Answer5_7 {
	
	public static void main(String[] args) {
		
		AnswerSheet5_7 answer = new AnswerSheet5_7();
		answer.One();
		answer.Two();
		
	}

}
