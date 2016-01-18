class AnswerSheet5_4 {
	public void One() {

		int num2 = 1;
		int sum = 0; 

		while( num2 < 100) {
			sum +=num2;
			num2++;
		}
		System.out.println(sum);
	}
	
	public void Two() {
		
		
		System.out.println("1~100까지 출력하기");
		
		int num=1;
		/*
		while(num<100) {
			num++;
			System.out.print(num+ " ");
		}
		System.out.println();
		System.out.println("100~1까지 출력하기");
		do {
			System.out.print(num + " ");
			--num;
		} while (num > 0) ;
		*/
		
		while( num <=100 ) {
			System.out.println(num++);
		}
		System.out.println();
		do {
			System.out.println(num--);			
		} while (num > 0);
		
		
		
		
	}
	
	public void Three () {
		//1000 이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고, 
		// 그 숫자들의 합을 구하는 프로그램을 while문을 이용해서 작성해보자. 
		int num = 1;
		int sum = 0;
		System.out.println();
		System.out.println("2와 7의 배수의 출력과 합계");
		
		while ( num < 1000 ) {
			if( num%2==0 && num%7==0 ) {
				System.out.print(num+" ");
				sum += num;
			}
			++num;
		}
		System.out.println();
		System.out.println("합계는 : "+sum);
	}
}

public class Answer5_4 {
	public static void main(String[] args) {
		
		AnswerSheet5_4 answer = new AnswerSheet5_4();
		answer.One();
		answer.Two();
		answer.Three();
	}

}
