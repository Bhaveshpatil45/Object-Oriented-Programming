package polymorphism;

public class interestDemo {
    public static void main(String[] args) {
        int principleAmt = 10000;
        float interestRate = 8.3f;
        int years = 5;

        InterestCalculator calculator = new InterestCalculator();
        double totalInterest = calculator.calculate(principleAmt, years, interestRate);

        System.out.println("total interest " + totalInterest);
        totalInterest = calculator.calculate(principleAmt, interestRate);
        System.out.println("total interest for 1 year " + totalInterest);
    }
}
