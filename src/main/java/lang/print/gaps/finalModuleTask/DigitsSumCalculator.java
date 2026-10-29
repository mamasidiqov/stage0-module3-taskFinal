package lang.print.gaps.finalModuleTask;
public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;          // Gets the 1st digit
        int hundreds = (number / 100) % 10;     // Gets the 2nd digit
        int tens = (number / 10) % 10;         // Gets the 3rd digit
        int ones = number % 10;                // Gets the 4th digit

        int sum = thousands + hundreds + tens + ones;
        System.out.println(sum);
    }
}
