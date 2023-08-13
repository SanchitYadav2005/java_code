

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 36.22;
        double rate = 3.2
        int compoundingFrequency = 12
        double time = 5

        double n = compoundingFrequency;
        double convertedRate = rate / 100.0;
        double amount = principal * Math.pow(1 + (convertedRate / n), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest for the principal amount " + principal +
                           " at an interest rate of " + rate + "% compounded " + compoundingFrequency +
                           " times per year for " + time + " years is: " + compoundInterest);
    }
}
