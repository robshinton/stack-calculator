import java.util.Stack;

public class Calculator {
	Stack stack = new Stack();
	
	public void loadConstant(int i) {
		stack.push(i);
		
	}
	
	public String toString() {
		if (stack.size()== 0) {
			return "[].";
		}else if(stack.size()>1) {
			return "" + stack + ".";
		}
		
	}
	
	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		
	}

	public void total() {
		// TODO Auto-generated method stub
		
	}

}
