package lab4;
public class MortgageModel
{
    private double principal;
    private double interestRate;
    private double numPayments;

    /**
     * Constructor to initialize the instance variables
     */
    public MortgageModel()
    {
        this.principal = principal;
        this.interestRate = interestRate;
        this.numPayments = numPayments;
    }

    /**
     * Getter method to receive the Principal amount value
     * @return returns the value of Principal
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * Setter method to set the value of the instance variable to the Principal amount value
     * @param principal parameter for initializing the instance variable
     */

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    /**
     * Getter method to receive the value of the interest rate
     * @return returns the value of the interest rate value
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Setter method to set the value of the instance variable to Interest rate value
     * @param interestRate parameter for initializing the instance variable
     */

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    /**
     * Getter method to receive the value of n(ammortization in terms of months)
     * @return returns the value of the ammortization(in terms of months)
     */
    public double getNumPayments() {
        return numPayments;
    }
    /**
     * Setter method to set the value of n(ammortization in terms of months)
     * @param numPayments parameter for initializing the instance variable
     */
    public void setNumPayments(int numPayments) {
        this.numPayments = numPayments;
    }

    /**
     * Method for calculating the interest factor
     * @return value of the interest factor
     */
    private double calculateInterestFactor() {
        double c = 2; // compounding frequency per year (semi-annually)
        double f = 12; // frequency of payments per year (monthly)
        double r = interestRate; // annual interest rate
        return (Math.pow((r/c + 1) , c / f) - 1);
    }
    /**
     * Method to calculate the monthly payment(blended payment)
     * @return value of the Blended payment ( interest + principal )
     */
    public double calculateMonthlyPayment() {
        double i = calculateInterestFactor();
        return (principal * i) / (1 - Math.pow(1 + i, -numPayments));
    }
    /**
     * Method to calculate total interest+principal is your blended payment multiplied by the number of payments n
     * @return value of total interest+principal is your blended payment multiplied by the number of payments n
     */
    public double calculateTotalPayments() {
        double monthlyPayment = calculateMonthlyPayment();
        return monthlyPayment * numPayments;
    }
    /**
     * Method to calculate total interest to be paid over the length of mortgage
     * @return value of the total interest paid over the length of mortgage.
     */
    public double calculateTotalInterestPaid() {
        return calculateTotalPayments() - principal;
    }
    /**
     * method to calculate the interest principal ratio
     * @return value of the interest principal ratio
     */
    public double calculateInterestPrincipalRatio() {
        double totalInterest = calculateTotalInterestPaid();
        return totalInterest / principal;
    }

    /**
     * Method just returns the value of the total interest and principal
     * @return value of the total interest and Principal
     */
    public double calculateTotalInterestandPrincipal()
    {
        return calculateTotalPayments();
    }
    /**
     * Method to calculate the average interest per year
     * @return value of the average interest per year
     */
    public double calculateAverageInterestPerYear() {
        double totalInterest = calculateTotalInterestPaid();
        double years = numPayments / 12.0;
        return totalInterest / years;
    }
    /**
     * Method to calculate the average interest per month
     * @return value of the average interest per month
     */
    public double calculateAverageInterestPerMonth() {
        double totalInterest = calculateTotalInterestPaid();
        return totalInterest / numPayments;
    }
    /**
     * Method to express the ammortization value in years
     * @return value of ammortization in years
     */
    public double calculateAmortizationInYears() {
        return numPayments / 12;
    }
}
