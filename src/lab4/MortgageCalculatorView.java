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

    // Instance Variable for the button
    private JButton button;

    private JButton clearButton;

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

        // TO make the Principal Label visible on the screen
        JLabel label = new JLabel("Principal Amount ");
        label.setBounds(10, 20, 150, 25);
        panel.add(label);
        inputprincipalAmt = new JTextField(10);
        inputprincipalAmt.setBounds(130, 20, 160, 25);
        panel.add(inputprincipalAmt);

        // To make the Interest Rate label visible on the screen
        JLabel label1 = new JLabel("Interest Rate");
        label1.setBounds(10, 60, 150, 25);
        panel.add(label1);
        inputInterest = new JTextField(10);
        inputInterest.setBounds(120, 60, 160, 25);
        panel.add(inputInterest);

        // To make the Ammortization Label visible on the screen
        JLabel label2 = new JLabel("Ammortization(in months)");
        label2.setBounds(10, 100, 250, 25);
        panel.add(label2);
        inputpayments = new JTextField(10);
        inputpayments.setBounds(180, 100, 160, 25);
        panel.add(inputpayments);

        // To make the calculate button visible on the screen
        button = new JButton("Calculate");
        button.setBounds(80, 135, 100, 25);
        panel.add(button);

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

        payments = new JLabel("Ammortization expressed in years: ");
        payments.setBounds(10, 340, 300, 25);
        panel.add(payments);

        frame.setVisible(true);
    }
    public int getPrincipalvalue()
    {
        return Integer.parseInt(inputprincipalAmt.getText());
    }
    public double getInterestRate()
    {
        return Double.parseDouble(inputInterest.getText());
    }
    public int getNumberOfPayments()
    {
        return Integer.parseInt(inputpayments.getText());
    }
    public void setBlendedPayment(double payment)
    {
        BlendedPayment.setText(String.format("Blended Payment: %.2f ",payment));
    }
    public void setTotalInterest(double interest)
    {
        totalInterest.setText(String.format("Total Interest Paid: %.2f ", interest));
    }

    public void setTotalInterestandPrincipal(double total)
    {
        totalInterestandPrincipal.setText(String.format("Total Interest and Principal: %.2f", total));
    }
    public void setInterestPrincipalRatio(double ratio)
    {
        interestPrincipalRatio.setText(String.format("Interest/Principal Ratio: %.2f",ratio));
    }

    public void setAvgIntperyear(double peryear)
    {
        avgIntperyear.setText(String.format("Average Interest per year: %.2f",peryear));
    }

    public void setAvgIntpermonth(double permonth)
    {
        avgIntpermonth.setText(String.format("Average Interest per month: %.2f",permonth));
    }

    public void setPayments(double number)
    {
        payments.setText("Ammortization expressed in years: " + number);
    }
    public void addCalculateListener(ActionListener listener)
    {
        button.addActionListener(listener);
    }
    public void clearing()
    {
        BlendedPayment.setText("Blended Payment: ");
        totalInterest.setText("Total Interest Paid: ");
        totalInterestandPrincipal.setText("Total Interest and Principal: ");
        interestPrincipalRatio.setText("Interest/Principal Ratio: ");
        avgIntpermonth.setText("Average Interest per month: ");
        avgIntperyear.setText("Average Interest per year: ");
        payments.setText("Ammortization expressed in years: ");

    }
    public void addClearListener(ActionListener listener)
    {
        clearButton.addActionListener(listener);
    }
}
