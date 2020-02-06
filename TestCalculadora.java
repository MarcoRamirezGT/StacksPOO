import junit.framework.TestCase;

public class TestCalculadora extends TestCase{

	
	private Calculator cal;
	public void escenario() {
		cal= new Calculator();
	}
	
	public void sum() {
		escenario();
		
		assertTrue(cal.sum(2, 2)==(2+2));
	}
	
	
	public void subtraction() {
		escenario ();
		
		assertTrue(cal.subtraction(4, 2)==(4-2));
	}
	

	public void division() {
		escenario();
		assertTrue(cal.division(4,2)==(4/2));
	}
	
	public void multiplicar() {
		escenario();
		assertTrue(cal.multiplicar(2, 2)==(2*2));
		
	}

	
}
