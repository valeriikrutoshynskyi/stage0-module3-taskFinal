package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        String str = Integer.toString(number);
        char[] digits = str.toCharArray();
        for (char c : digits) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}
