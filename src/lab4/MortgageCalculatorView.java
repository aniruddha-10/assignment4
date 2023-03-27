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

    public  MortgageCalculatorView()
    {
        super();
        //Window Properties
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Mortgage Calculator");
        frame.setSize(500, 400);
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
        button.setBounds(145, 135, 100, 25);
        panel.add(button);

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
        BlendedPayment.setText("Blended Payment: " + payment);
    }
    public void setTotalInterest(double interest)
    {
        totalInterest.setText("Total Interest Paid: " + interest);
    }

    public void setTotalInterestandPrincipal(double total)
    {
        totalInterestandPrincipal.setText("Total Interest and Principal: " + total);
    }
    public void setInterestPrincipalRatio(double ratio)
    {
        interestPrincipalRatio.setText("Interest/Principal Ratio: " + ratio);
    }

    public void setAvgIntperyear(double peryear)
    {
        avgIntperyear.setText("Average Interest per year: " + peryear);
    }

    public void setAvgIntpermonth(double permonth)
    {
        avgIntpermonth.setText("Average Interest per month: " + permonth);
    }

    public void setPayments(int number)
    {
        payments.setText("Ammortization expressed in years: " + number);
    }
    public void addCalculateListener(ActionListener listener)
    {
        button.addActionListener(listener);
    }
}
