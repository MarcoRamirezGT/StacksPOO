import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	private static final String ADD = "+"; 
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

	private Calculator cal;
	public void escenario() {
		cal= new Calculator();
	}
	/**
	 *     
	 * @param fileName
	 * @throws IOException
	 */
	    
	  
	/**
	 * 
	 * @param input
	 * @return
	 */
	    private int calculate(String input) {
	        assertTrue(cal.calculate());
	    }
	/**
	 * 
	 * @param stack
	 * @param el
	 * @return
	 */
	    private static int handleCalculation(Stack_<Integer> stack, String[] el) {
	        int operand1, operand2;

	        for(int i = 0; i < el.length; i++) {
	            if( el[i].equals(ADD) || el[i].equals(SUB) || el[i].equals(MUL) || el[i].equals(DIV) ) {
	                operand2 = stack.pop();
	                operand1 = stack.pop();
	                switch(el[i]) {
	                //Si encuentra ADD realiza un push de ambos operando en el stack
	                    case ADD: {
	                        int local = operand1 + operand2;
	                        stack.push(local);
	                        break;
	                    }
	                    //Si encuentra un SUB realiza un push de ambos operando en el stack
	                    case SUB: {
	                        int local = operand1 - operand2;
	                        stack.push(local);
	                        break;
	                    }
	                    //Si encuentra un MUL realiza un push de ambos operandos en el stack
	                    case MUL: {
	                        int local = operand1 * operand2;
	                        stack.push(local);
	                        break;
	                    }
	                    //Si encuentra un DIV realiza un push de ambos operandos en el stack
	                    case DIV: {
	                        int local = operand1 / operand2;
	                        stack.push(local);
	                        break;
	                    }
	                }
	               //De lo contrario realizara push a los digitos
	            } else {
	                stack.push(Integer.parseInt(el[i]));
	            }
	        }

	        return stack.pop();
	    }
	}

}
