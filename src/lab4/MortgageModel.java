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

    public double calculateMonthlyPayment() {
        double i = calculateInterestFactor();
        double B = (principal * i) / (1 - Math.pow(1 + i, -numPayments));
        return B;
    }

    public double calculateTotalInterestPaid() {
        double totalInterest = calculateTotalPayments() - principal;
        return totalInterest;
    }

    public double calculateTotalPayments() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalPayments = monthlyPayment * numPayments;
        return totalPayments;
    }

    public double calculateInterestPrincipalRatio() {
        double totalInterest = calculateTotalInterestPaid();
        double ratio = totalInterest / principal;
        return ratio;
    }

    public double calculateAverageInterestPerYear() {
        double totalInterest = calculateTotalInterestPaid();
        double years = numPayments / 12.0;
        double averageInterestPerYear = totalInterest / years;
        return averageInterestPerYear;
    }

    public double calculateAverageInterestPerMonth() {
        double totalInterest = calculateTotalInterestPaid();
        double averageInterestPerMonth = totalInterest / numPayments;
        return averageInterestPerMonth;
    }

    public double calculateAmortizationInYears() {
        double years = numPayments / 12.0;
        return years;
    }

    private double calculateInterestFactor() {
        double c = 2; // compounding frequency per year (semi-annually)
        double f = 12; // frequency of payments per year (monthly)
        double r = interestRate; // annual interest rate
        double i = (r / c + 1) * Math.pow(c / f, 1 / c) - 1;
        return i;
    }

}
