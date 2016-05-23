package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCase {
	
	private final static INumberCalculator numberCalculator = new FizzBuzz();
	private final static NumberPrinter numberPrinter = new NumberPrinter(numberCalculator, new ConsolePrinter());
	private int parameter;
	
	public TestCase(int parameter)
	{
		this.parameter = parameter;		
	}
	
	@Parameters
	public static Collection<Object> data()
	{
		Object[] data = new Object[] { 55, 65, 85 };
		return Arrays.asList(data);
	}
	
	@Test
	public void calculate() {
		String s = null;
		
		if(parameter % 3 != 0 && parameter % 5 != 0)
		{
			s = "";
		}
		else if(parameter % 3 == 0 && parameter % 5 != 0)
		{
			s = "Fizz";
		}
		else if(parameter % 3 != 0 && parameter % 5 == 0)
		{
			s = "Buzz";
		}
		else
		{
			s = "FizzBuzz";
		}
		
		assertEquals(s + parameter, numberCalculator.calculate(parameter));		
	}
	
}
