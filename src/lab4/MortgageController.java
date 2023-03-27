package lab4;


import java.awt.event.*;

public class MortgageController
{
    private MortgageCalculatorView view;
    private MortgageModel model;

    public MortgageController(MortgageCalculatorView view, MortgageModel model)
    {
        this.view = view;
        this.model = model;
        this.view.addCalculateListener(new addCalculateListener());
        this.view.addClearListener(new addClearListener());
    }

    class addCalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double principal = view.getPrincipalvalue();
            double interestRate = view.getInterestRate();
            int payments = view.getNumberOfPayments();

            model.setPrincipal(principal);
            model.setInterestRate(interestRate);
            model.setNumPayments(payments);

            view.setBlendedPayment(model.calculateMonthlyPayment());
            view.setTotalInterest(model.calculateTotalInterestPaid());
            view.setTotalInterestandPrincipal(model.calculateTotalInterestandPrincipal());
            view.setInterestPrincipalRatio(model.calculateInterestPrincipalRatio());
            view.setAvgIntpermonth(model.calculateAverageInterestPerMonth());
            view.setAvgIntperyear(model.calculateAverageInterestPerYear());
            view.setPayments(model.calculateAmortizationInYears());
        }
    }
    class addClearListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            view.clearing();
        }
    }
    public static void main(String[] args)
    {
        MortgageModel model = new MortgageModel();
        MortgageCalculatorView view = new MortgageCalculatorView();
        MortgageController controller = new MortgageController(view,model);
    }
}