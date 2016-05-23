package kolokwium.a.pl.edu.us.awpto;

public class NumberPrinter
{
    private INumberCalculator numberCalculator;
    private IPrinter printer;

    public NumberPrinter(INumberCalculator numberCalculator, IPrinter printer) {
        this.numberCalculator = numberCalculator;
        this.printer = printer;
    }

    public void printNumbers(int limit) {
        if (limit < 1) {
            throw new RuntimeException("limit must be >= 1");
        }
        for (int i = 1; i <= limit; i++) {
            try {
                printer.print(numberCalculator.calculate(i));
            } catch (Exception e) {
            }
        }
    }
}