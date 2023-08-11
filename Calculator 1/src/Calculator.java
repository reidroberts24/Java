import java.io.Serializable;

public class Calculator implements Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	private boolean isLastInputNumber = false;
	private boolean isLastInputOperation = false;
	
	public Calculator() {
		
	}
	
	public boolean performOperation(double num) {
		if (operation.equals("+")) {
			result = operandOne + operandTwo;
		} else if (operation.equals("-")) {
			result = operandOne - operandTwo;
		} else if (operation.equals("-")) {
			result = operandOne * operandTwo;
		} else if (operation.equals("-")) {
			result = operandOne / operandTwo;
		} else {
			System.out.println("Operation not supported!");
			return false;
		}
		return true;
	}
	
	public void performOperation(String op) {
		if (!isLastInputNumber) {
			System.out.println("Invalid operation sequence.");
			return;
		} 
	}
	
	public double getResults() {
		return result;
	}
	
	
	public void setOperandOne(double num) {
		this.operandOne = num;
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	
	public void setOperandTwo(double num) {
		this.operandTwo = num;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public String getOperation() {
		return operation;
	}
}
