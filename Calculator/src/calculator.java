import java.util.StringTokenizer;

public class calculator {
	public int evaluate(String expression) {
		int sum = 0;
		StringTokenizer st= new StringTokenizer(expression,"+-/*");
		int cnt=st.countTokens();
		int num=0;
		for(int i=0;i<cnt;i++) {
			String token=st.nextToken();
			num=Integer.parseInt(token);
			sum+=num;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calculator = new calculator();
		int sum = calculator.evaluate("1+2+3");
		
		System.out.println("1+2+3 = " + sum);
	}

}