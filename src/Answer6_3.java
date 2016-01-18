import java.util.Scanner;

/*
 * [재귀 메소드의 정의]
 * 
 * 문제1. 
 * 정수 N을 전달받아서, 2의 N승을 계산하여 변환하는 메소드를 재귀의 형태로 정의하고,
 * 이의 테스트를 위한 main 메소드도 함께 정의하자. 
 * 
 * 문제2. 
 * 10진수 정수를 전달받아서, 전달받은 정수에 해당하는 2진수를 출력하는 메소드의 재귀의 
 * 형태로 정의하고, 이의 테스트를 위한 main 메소드도 함께 정의하자. 참고로 아직은 다양한
 * 출력방법을 소개하지 않았으니, 여러 줄에 걸쳐서 출력이 이뤄지도록 메소드를 정의하자. 
 * 
 */
public class Answer6_3 {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("정수 N을 전달받아서, 2의 N승을 계산하기 위해 정수 N을 입력: ");
		Scanner userInput = new Scanner(System.in);
		num = userInput.nextInt();
		System.out.println(answerSheet1(num));
		
		System.out.println("10진수를 2진수로 변환시키기 위한 10진수를 입력 :");
		num = userInput.nextInt();
		System.out.println(num+"의 2진수는: ");
		answerSheet2(num);
		
		System.out.println("교재버전");
		toBinary(num);
	}
	
	public static int answerSheet1 (int num) {
		
		if( num == 1 ) 
			return 2;
		else {
			return 2 * answerSheet1(num-1);
		}
	}
	
	public static void answerSheet2 (int num) {
		

		if (num/2 != 1) { //맨 처음 2로 나눴을 때 몫이 1이 나오지 않을 경우 즉 2,3이 아닌경우
			if( num%2 == 0) //나머지를 구해서 출력해준다. 
				System.out.print(0);
			else
				System.out.print(1);
			answerSheet2(num/2); //나머지를 다 구한후 
		}
		else {
			System.out.print(1);
		}
		
		
	}
	
	
	/*
	 * toBinaryCode Solution ver.
	 */
	public static int toBinary (int decimal) {
		
		if(decimal > 0) {
			int bin;
			bin = decimal%2;
			decimal /= 2;
			toBinary(decimal);
			System.out.println(bin);
		}
		return 0;
	}
}
