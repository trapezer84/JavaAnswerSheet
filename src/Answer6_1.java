/*
 * �ΰ��� ������ ���� �޾Ƽ�, 
 * �� ���� ��Ģ���� ����� ����ϴ� �޼ҵ�� �� �޼ҵ带 ȣ���ϴ� main �޼ҵ带 �����غ���. 
 * ��, �������� ��� �������� ���� ����ؾ��Ѵ�.
 * 
 */


/*
 * �� ���� ������ ���޹޾Ƽ�, �� ���� ���� ���밪�� ����Ͽ� ����ϴ� �޼ҵ��
 * �� �޼ҵ带 ȣ���ϴ� main �޼ҵ带 �����غ���. �� �޼ҵ� ȣ�� �� ���޵Ǵ� ���� 
 * ������ ������� ���밪�� ���Ǿ ��µǾ�� �Ѵ�. 
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
	
		System.out.println("���� : " + (n+m));
		System.out.println("���� : " + (n-m));
		System.out.println("������(��) : " + (n/m));
		System.out.println("������(������) : " + (n%m));
		System.out.println("���� : " + (n*m));
		
	}
	
	public static void answerSheet2 (int n, int m) {
		
		int result = n-m;
		if( result >= 0 ) {
			System.out.println("���밪�� " + result );
		} else {
			System.out.println("���밪�� " + -result);
		}
		
	}

}
