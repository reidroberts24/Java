
public class CalcTest {

	public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperandOne(10.5);
        calculator.setOperation("+");
        calculator.setOperandTwo(5.2);
        calculator.performOperation();
        System.out.println(calculator.getResults());  // Outputs: 15.7
    }

}
