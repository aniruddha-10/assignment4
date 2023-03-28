package lab4;
import javax.swing.*;
import java.awt.event.ActionListener;

public class MortgageCalculatorView extends JFrame
{
    // instance variables for the Input fields
    private JTextField inputprincipalAmt;
    private JTextField inputInterest;
    private JTextField inputpayments;


    // Instance variables for the labels for outputs
    private JLabel BlendedPayment;
    private JLabel totalInterest;
    private JLabel interestPrincipalRatio;
    private JLabel avgIntperyear;
    private JLabel avgIntpermonth;
    private JLabel payments;
    private JLabel totalInterestandPrincipal;

    // Instance Variable for the calculate button
    private JButton button;

    // Instance variable for the clear button
    private JButton clearButton;

    /**
     * Constructor that calls the superclass methods and access the superclass and then formulates the view of the GUI
     */
    public  MortgageCalculatorView()
    {
        super();
        //Window Properties
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Mortgage Calculator");
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // To make the Principal Label visible on the screen
        JLabel label = new JLabel("Principal Amount ");
        label.setBounds(10, 20, 150, 25);
        panel.add(label);

        // To make the textfield for the principal visible on the screen
        inputprincipalAmt = new JTextField(10);
        inputprincipalAmt.setBounds(130, 20, 160, 25);
        panel.add(inputprincipalAmt);

        // To make the Interest Rate label visible on the screen
        JLabel label1 = new JLabel("Interest Rate");
        label1.setBounds(10, 60, 150, 25);
        panel.add(label1);

        // To make the textfield for the interest rate visible on the screen
        inputInterest = new JTextField(10);
        inputInterest.setBounds(120, 60, 160, 25);
        panel.add(inputInterest);

        // To make the Amortization Label visible on the screen
        JLabel label2 = new JLabel("Amortization(in months)");
        label2.setBounds(10, 100, 250, 25);
        panel.add(label2);

        // To make the textfield for the amortization visible on the screen
        inputpayments = new JTextField(10);
        inputpayments.setBounds(180, 100, 160, 25);
        panel.add(inputpayments);

        // To make the calculate button visible on the screen
        button = new JButton("Calculate");
        button.setBounds(80, 135, 100, 25);
        panel.add(button);

        // To make the clear button visible on the screen
        clearButton = new JButton("Clear");
        clearButton.setBounds(200,135,100,25);
        panel.add(clearButton);

        // To make the output labels visible
        BlendedPayment = new JLabel("Blended Payment: ");
        BlendedPayment.setBounds(10, 160, 300, 25);
        panel.add(BlendedPayment);

        totalInterest = new JLabel("Total Interest Paid: ");
        totalInterest.setBounds(10, 190, 300, 25);
        panel.add(totalInterest);

        totalInterestandPrincipal = new JLabel("Total Interest and Principal: ");
        totalInterestandPrincipal.setBounds(10,220,300,25);
        panel.add(totalInterestandPrincipal);

        interestPrincipalRatio = new JLabel("Interest/Principal Ratio: ");
        interestPrincipalRatio.setBounds(10, 250, 300, 25);
        panel.add(interestPrincipalRatio);

        avgIntperyear = new JLabel("Average Interest per year: ");
        avgIntperyear.setBounds(10, 280, 300, 25);
        panel.add(avgIntperyear);

        avgIntpermonth = new JLabel("Average Interest per month: ");
        avgIntpermonth.setBounds(10, 310, 300, 25);
        panel.add(avgIntpermonth);

        payments = new JLabel("Amortization expressed in years: ");
        payments.setBounds(10, 340, 300, 25);
        panel.add(payments);

        frame.setVisible(true);
    }

    /**
     * Method to get the value of the Principal amount
     * @return value of the principal amount
     */
    public int getPrincipalvalue()
    {
        return Integer.parseInt(inputprincipalAmt.getText());
    }

    /**
     * Method to get the value of the Interest rate
     * @return value of the interest rate
     */
    public double getInterestRate()
    {
        return Double.parseDouble(inputInterest.getText());
    }

    /**
     * Method to get the value of the amortization in terms of months
     * @return value of amortization in terms of months
     */
    public int getNumberOfPayments()
    {
        return Integer.parseInt(inputpayments.getText());
    }

    /**
     * Method to set the Blended payment label text with the value
     * @param payment receives the value of the blended payment to be displayed on the screen
     */
    public void setBlendedPayment(double payment)
    {
        BlendedPayment.setText(String.format("Blended Payment: %.2f ",payment));
    }

    /**
     * Method to set the Total interest paid label text with the value
     * @param interest receives the value of the Total interest paid to be displayed on the screen
     */
    public void setTotalInterest(double interest)
    {
        totalInterest.setText(String.format("Total Interest Paid: %.2f ", interest));
    }

    /**
     * Method to set the Total Interest and Principal label text with the value
     * @param total receives the value of the Total interest and principal to be displayed on the screen
     */
    public void setTotalInterestandPrincipal(double total)
    {
        totalInterestandPrincipal.setText(String.format("Total Interest and Principal: %.2f", total));
    }

    /**
     * Method to set the InterestPrincipal ratio label text with the value
     * @param ratio receives the value of the interest principal ratio
     */
    public void setInterestPrincipalRatio(double ratio)
    {
        interestPrincipalRatio.setText(String.format("Interest/Principal Ratio: %.2f",ratio));
    }

    /**
     * Method to set the Average Interest per year label text with the value
     * @param peryear receives the value of the Average interest per year
     */
    public void setAvgIntperyear(double peryear)
    {
        avgIntperyear.setText(String.format("Average Interest per year: %.2f",peryear));
    }

    /**
     * Method to set the Average Interest per month label text with the value
     * @param permonth receives the value of the Average interest per month
     */
    public void setAvgIntpermonth(double permonth)
    {
        avgIntpermonth.setText(String.format("Average Interest per month: %.2f",permonth));
    }

    /**
     * Method to set the Amortization expressed in years label text with the value
     * @param number receives an integer value of amortization in terms of years
     */
    public void setPayments(double number)
    {
        payments.setText("Ammortization expressed in years: " + number);
    }

    /**
     * Method to implement the action when the button is pressed
     * @param listener parameter that receives the action when the button is pressed
     */
    public void addCalculateListener(ActionListener listener)
    {
        button.addActionListener(listener);
    }

    /**
     * Method to clear the screen
     */
    public void clearing()
    {
        BlendedPayment.setText("Blended Payment: ");
        totalInterest.setText("Total Interest Paid: ");
        totalInterestandPrincipal.setText("Total Interest and Principal: ");
        interestPrincipalRatio.setText("Interest/Principal Ratio: ");
        avgIntpermonth.setText("Average Interest per month: ");
        avgIntperyear.setText("Average Interest per year: ");
        payments.setText("Amortization expressed in years: ");
    }

    /**
     * Method to implement the clear screen action when the user presses the clear button
     * @param listener parameter that receives the action when the button is pressed.
     */
    public void addClearListener(ActionListener listener)
    {
        clearButton.addActionListener(listener);
    }
}
