class  AnswerSheet4_1 {
	public void One(){
		int num1 = 10; 
		int num2 = 20; 
		int num3 = 30;
		
		num1=num2=num3; //예상결과는 30 
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
	
	public void Two(){
		
		int num1=0, num2=0;
		boolean result;
		
		//result = (num1+=10)<0 && (num2+=10)>0;
		num1+=10;
		num2+=10;
		result= num1<0 && num2>0;
				
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		
		//result = (num1+=10)>0 || (num2+=10)>0;
		num1+=10;
		num2+=10;
		result= num1>0 || num2>0;
		
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
	}
	public void Three(){
		int num, one, two;
		num = (25*5)+(36-4)-7;
		one = num/5;
		two = num%5;
		System.out.println("계산결과 몫은: "+one+", 나머지는 :"+two);
		
	}
	public void Four(){
		int result=3+6;
		System.out.println(result);
		System.out.println(result+=9);
		System.out.println(result+=12);
		
	}
	public void Five(){
		int A = ((25+5)+(36/4)-72)*5;
		int B = ((25*5)+(36-4)+71)/4;
		int C = (128/4)*2;
		
		System.out.println(A>B&&B>C);
	}
}

public class Answer4_1 {
	public static void main(String[] args){
		AnswerSheet4_1 answer = new AnswerSheet4_1();
		answer.One();		
		answer.Two();
		answer.Three();
		answer.Four();
		answer.Five();
	}
	

}
