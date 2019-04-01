package calc;
//success test
public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 0;

		}
		return a/b;

	}
}
