package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = Integer.parseInt(new StringBuilder(Integer.toString(number)).reverse().toString());
        System.out.println(reversedNumber);
    }
}
