import java.io.IOException;
import java.net.URISyntaxException;

public interface iCalculadora {
   // Stack mystack= null; 
 /**
  * 
  * @throws IOException
  * @throws URISyntaxException
  */
    void init() throws IOException, URISyntaxException;
    /**
     * 
     * @param sum
     * @param a,b
     * @return sum a,b
     */
	int sumar(int a, int b);
	/**
	 * 
	 * @param subtraction
	 * @param a,b
	 * @return subtraction a,b
	 */
	int restar(int a,int b);
	/**
	 * 
	 * @param division
	 * @param a,b
	 * @return
	 */
	int division(int a, int b);
	/**
	 * 
	 * @param multiplicar
	 * @param a,b
	 * @return multiplicar a,b
	 */
	int multiplicar(int a,int b);
/**
 * 
 * @param value
 * @return
 */
	boolean isInt(String value);
/**
 * 
 * @param operator
 */
	void managerOperator(String operator);
   }