

public class GreatestNumber {
    public static void main(String[] args) {
        double num1 = 36.32
        double num2 = 25.2
        double num3 = 45.35

        double greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.printf("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);

    }
}
