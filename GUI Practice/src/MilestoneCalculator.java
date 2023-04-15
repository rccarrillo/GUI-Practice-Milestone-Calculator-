import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;

public class MilestoneCalculator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Declare private variables for the Swing components
    private JLabel lblMilestone1, lblMilestone2, lblTerminalAssessment;
    private JTextField txtMilestone1, txtMilestone2, txtTerminalAssessment;
    private JButton calculateButton;


    public MilestoneCalculator() {
        // Set up the frame
        super("Milestone Calculator");
        setSize(450, 250);


        // Create the components
        // Create labels and text fields
        lblMilestone1 = new JLabel("Milestone 1:");
        txtMilestone1 = new JTextField(10);
        lblMilestone2 = new JLabel("Milestone 2:");
        txtMilestone2 = new JTextField(10);
        lblTerminalAssessment = new JLabel("Terminal Assessment:");
        txtTerminalAssessment = new JTextField(10);
        calculateButton = new JButton("Calculate");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 300);
        panel.setLayout(layout);
       
        // Add the components to the frame;
        panel.add(lblMilestone1);
        panel.add(txtMilestone1);
        panel.add(lblMilestone2);
        panel.add(txtMilestone2);
        panel.add(lblTerminalAssessment);
        panel.add(txtTerminalAssessment);
        panel.add(calculateButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerminalAssessment, 6, SpringLayout.WEST, panel);
       
        // Set label and text field position: top and bottom
        layout.putConstraint(SpringLayout.NORTH, lblMilestone1, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone1, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone2, 10, SpringLayout.SOUTH, lblMilestone1);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone2, 6, SpringLayout.SOUTH, txtMilestone1);
        layout.putConstraint(SpringLayout.NORTH, lblTerminalAssessment, 10, SpringLayout.SOUTH, lblMilestone2);
        layout.putConstraint(SpringLayout.NORTH, txtTerminalAssessment, 6, SpringLayout.SOUTH, txtMilestone2);
       
        // Set text field position: right
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 85, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 85, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerminalAssessment, 25, SpringLayout.EAST, lblTerminalAssessment);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTerminalAssessment);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Instantiate Milestone class
                Milestone stud = new Milestone();
               
                // Assign text field values to stud object
                stud.setMilestone1(Float.parseFloat(txtMilestone1.getText()));
                stud.setMilestone2(Float.parseFloat(txtMilestone2.getText()));
                stud.setTerminalAssessment(Float.parseFloat(txtTerminalAssessment.getText()));
               
                // Instantiate and call MilestoneOutput class
                MilestoneOutput output = new MilestoneOutput(stud);
                output.setVisible(true);
            }
        });
    }
}
