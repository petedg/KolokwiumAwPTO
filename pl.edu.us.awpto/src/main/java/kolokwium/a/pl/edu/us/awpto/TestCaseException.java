package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseException {

	private final static NumberPrinter numberPrinter = new NumberPrinter(new FizzBuzz(), new ConsolePrinter());
	
	public TestCaseException()
	{
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void printNumbers()
	{
		numberPrinter.printNumbers(0);
	}
}
