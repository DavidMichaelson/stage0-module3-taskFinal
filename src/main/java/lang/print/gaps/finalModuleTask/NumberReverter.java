package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int getHundred = number / 100;
        int getTen = (number / 10) % 10;
        int getUnit = number % 10;

        //
        int reversed = getUnit * 100 + getTen * 10 + getHundred;
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();
        reverter.revert(321);
    }
}