package lab4;
import java.awt.event.*;
public class MortgageController
{
    private MortgageCalculatorView view;
    private MortgageModel model;

    /**
     * A constructor that assigns the properties of MortgageCalculatorView class and MortgageModel class
     * also registers the listener, the parameters are the types of other classes in the program
     * @param view object of the class MortgageCalculatorView class to set the attributes
     * @param model object of the class MortgageModel class to set the attributes
     */
    public MortgageController(MortgageCalculatorView view, MortgageModel model)
    {
        this.view = view;
        this.model = model;
        this.view.addCalculateListener(new addCalculateListener());
        this.view.addClearListener(new addClearListener());
    }

    /**
     * Inner class that implements the Action listener class to perform all the calculations and display the results
     * on the screen when the user presses the button
     */
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

    /**
     * Inner class that implements Action listener class to perform the clear screen action when the user
     * presses the clear button.
     */
    class addClearListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            view.clearing();
        }
    }
    /**
     * Main method of the controller class which creates and instantiate the objects of the Model and view class
     * to the Controller class' object
     * @param args
     */
    public static void main(String[] args)
    {
        MortgageModel model = new MortgageModel();
        MortgageCalculatorView view = new MortgageCalculatorView();
        MortgageController controller = new MortgageController(view,model);
    }
}