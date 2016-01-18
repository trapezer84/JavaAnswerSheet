/*
 * 두개의 정수를 전달 받아서, 
 * 두 수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해보자. 
 * 단, 나눗셉은 몫과 나머지를 각각 출력해야한다.
 * 
 */


/*
 * 두 개의 정수를 전달받아서, 두 수의 차의 절대값을 계산하여 출력하는 메소드와
 * 이 메소드를 호출하는 main 메소드를 정의해보자. 단 메소드 호출 시 전달되는 값의 
 * 순서에 상관없이 절대값이 계산되어서 출력되어야 한다. 
 * 
 */
public class Answer6_1 {
	
	public static void main(String[] args) {
		
		answerSheet1(20, 10);
		answerSheet2(10, 20);
		answerSheet2(-4, -7);
		answerSheet2(10, -79);
	}
	
	public static void answerSheet1(int n, int m) {
	
		System.out.println("덧셈 : " + (n+m));
		System.out.println("뺄셈 : " + (n-m));
		System.out.println("나눗셈(몫) : " + (n/m));
		System.out.println("나눗셈(나머지) : " + (n%m));
		System.out.println("곱셈 : " + (n*m));
		
	}
	
	public static void answerSheet2 (int n, int m) {
		
		int result = n-m;
		if( result >= 0 ) {
			System.out.println("절대값은 " + result );
		} else {
			System.out.println("절대값은 " + -result);
		}
		
	}

}
