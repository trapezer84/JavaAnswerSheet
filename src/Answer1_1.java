/*
 * 문제 1-1 [클래스의 이름과 문자열의 출력]
 */
class AnswerSheet1_1 {
	public void answerOne(){
		System.out.println("2+5=" + 2 + 5);
		System.out.println("2+5=" + (2+5));
	}
	
	public void answerTwo(){
		System.out.println("12");
		System.out.println(12);
		System.out.println("1"+2);
		System.out.println(1+"2");
		System.out.println(5+7);	
	}
}
public class Answer1_1 {
		
	public static void main(String[] args){
		AnswerSheet1_1 answer = new AnswerSheet1_1();
		answer.answerOne();
		answer.answerTwo();	
	}
	

}
