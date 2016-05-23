package kolokwium.a.pl.edu.us.awpto;

public class App 
{
    public static void main(String[] args)
    {
        NumberPrinter np = new NumberPrinter(new FizzBuzz(), new ConsolePrinter());
        np.printNumbers(100);
    }
}