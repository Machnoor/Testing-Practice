package Testing;

public class MethodParameter {
	
	public void LoginParameters(int a,int b) {
		System.out.println("Enter num1 ="+ " " + a);
		System.out.println("Enter num2 = " + " " + b);
		System.out.println("Result = " + (a+b));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameter y = new MethodParameter();
		y.LoginParameters(3, 4);
		y.LoginParameters(16, 34);
		

	}

}
