
public class Answer6_2 {
	
	public static void main(String[] args) {
		
		answerSheet1(10);
		answerSheet2(13);
	}
	
	public static void answerSheet1 (int num) {
		//num이 반지름
		System.out.println("반지름 : " + num);
		
		double area = 3.14 * num * num;
		System.out.println("원의 넓이 : "+area);
		
		double cir; //원주 
		cir = 2 * num * 3.14;
		System.out.println("원주 : " + cir);
		
	}
	
	public static void answerSheet2 (int num) {
		boolean primeNumber = false;
		
		for(int i=2; i<num; i++){
			if( (num%i) == 0) {
				primeNumber = false;
				break;
			} 
			primeNumber = true;
			
		}
		
		
		if(primeNumber == true) 
			System.out.println("소수다. " + primeNumber);
		else 
			System.out.println("소수 아니다. " + primeNumber);

	}
}
