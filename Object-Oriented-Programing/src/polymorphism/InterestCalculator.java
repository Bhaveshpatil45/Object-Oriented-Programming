package polymorphism;

public class InterestCalculator {
    public double calculate(int principleAmt, int years, float interestRate){
        double interest = principleAmt * (interestRate/100);
        double totalInterest = interest * years;
        return totalInterest;
    }

    public double calculate(int principleAmt, float interestRate){
        double interest = principleAmt * (interestRate/100);
        return interest;
    }
}
