package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int thousand = number / 1000;
        int hundred = (number / 100) % 10;
        int ten = (number / 10) % 10;
        int unit = number % 10;

        System.out.println(thousand);
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(unit);

        System.out.println(thousand + hundred + ten + unit);
    }

    public static void main(String[] args) {
        DigitsSumCalculator calc = new DigitsSumCalculator();
        calc.calculateSum(1234);
    }
}
