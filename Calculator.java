import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 
 * @author Marco Ramirez 19588
 * @author Estefania Barrio 17927
 * @version Final
 *
 */

public class Calculator implements iCalculadora{

    private static final String ADD = "+"; 
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

/**
 *     
 * @param fileName
 * @throws IOException
 */
    
    
    public void calculateFile(String fileName) throws IOException {
        BufferedReader lec = null;
        StringBuilder sb = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            lec = new BufferedReader(fileReader);

            sb = new StringBuilder();
            String line = lec.readLine();

            while (line != null) {
                sb.append(line);
                line = lec.readLine();
            }

            String input = sb.toString();
            System.out.println(input + " = " + calculate(input));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            lec.close();
        }
    }
/**
 * 
 * @param input
 * @return
 */
    private int calculate(String input) {
        Stack_<Integer> stack = new Stack_<>();

        String[] inputs = input.split(" ");

        return handleCalculation(stack, inputs);
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
@Override
public void init() throws IOException, URISyntaxException {
	// TODO Auto-generated method stub
	
}
@Override
public int sumar(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int restar(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int division(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int multiplicar(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public boolean isInt(String value) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void managerOperator(String operator) {
	// TODO Auto-generated method stub
	
}

}