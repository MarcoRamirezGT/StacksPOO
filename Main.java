import java.io.IOException;
/**
 * 
 * @author Marco Ramirez 19588
 * @author Estefania Barrio 17927
 *
 */
public class Main {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
    public static void main(String[] args) throws IOException {
 
        Calculator calc = new Calculator	();
        calc.calculateFile("datos.txt");
    }
}	