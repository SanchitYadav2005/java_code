

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        int number = 25

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf(number + " is divisible by both 3 and 5.");
        } else {
            System.out.printf(number + " is not divisible by both 3 and 5.");
        }
    }
}
