package lab4;
public class MortgageModel
{
    private double principal;
    private double interestRate;
    private int numPayments;

    public MortgageModel(double principal, double interestRate, int numPayments) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.numPayments = numPayments;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumPayments() {
        return numPayments;
    }

    public void setNumPayments(int numPayments) {
        this.numPayments = numPayments;
    }

    private double calculateInterestFactor() {
        double c = 2; // compounding frequency per year (semi-annually)
        double f = 12; // frequency of payments per year (monthly)
        double r = interestRate; // annual interest rate
        return (Math.pow((r/c + 1) , c / f) - 1);
    }
    public double calculateMonthlyPayment() {
        double i = calculateInterestFactor();
        return (principal * i) / (1 - Math.pow(1 + i, -numPayments));
    }
    public double calculateTotalPayments() {
        double monthlyPayment = calculateMonthlyPayment();
        return monthlyPayment * numPayments;
    }

    public double calculateTotalInterestPaid() {
        return calculateTotalPayments() - principal;
    }

    public double calculateInterestPrincipalRatio() {
        double totalInterest = calculateTotalInterestPaid();
        return totalInterest / principal;
    }

    public double calculateAverageInterestPerYear() {
        double totalInterest = calculateTotalInterestPaid();
        double years = numPayments / 12.0;
        return totalInterest / years;
    }

    public double calculateAverageInterestPerMonth() {
        double totalInterest = calculateTotalInterestPaid();
        return totalInterest / numPayments;
    }

    public double calculateAmortizationInYears() {
        return numPayments / 12.0;
    }

}
