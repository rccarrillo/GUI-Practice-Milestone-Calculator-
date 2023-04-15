import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;

public class MilestoneOutput extends JFrame {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Declare private variables for the Swing components
    private JLabel lblMilestone1, lblMilestone2, lblTerminalAssessment, lblAveGrade;
    private JTextField txtMilestone1, txtMilestone2, txtTerminalAssessment, txtAveGrade;
    private JButton closeButton;


    public MilestoneOutput(Milestone stud) {
        // Set up the frame
        super("Milestone Output");
        setSize(450, 250);


        // Compute Average
        stud.computeAverage();


        // Create the components
        // Create labels
        lblMilestone1 = new JLabel("Milestone 1:");
        lblMilestone2 = new JLabel("Milestone 2:");
        lblTerminalAssessment = new JLabel("Terminal Assessment:");
        lblAveGrade = new JLabel("Average Grade:");
       
        // Create Milestone 1 text field
        txtMilestone1 = new JTextField(10);
        txtMilestone1.setEnabled(false);
        txtMilestone1.setText(stud.getMilestone1());
       
        // Create Milestone 2 text field
        txtMilestone2 = new JTextField(10);
        txtMilestone2.setEnabled(false);
        txtMilestone2.setText(stud.getMilestone2());
       
        // Create Terminal Assessment text field
        txtTerminalAssessment = new JTextField(10);
        txtTerminalAssessment.setEnabled(false);
        txtTerminalAssessment.setText(stud.getTerminalAssessment());
       
        // Create Average Grade text field
        txtAveGrade = new JTextField(10);
        txtAveGrade.setEnabled(false);
        txtAveGrade.setText(stud.getAveGrade());
       
        // Create Close button
        closeButton = new JButton("Close");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 300);
        panel.setLayout(layout);
       
        // Add the components to the frame
        panel.add(lblMilestone1);
        panel.add(txtMilestone1);
        panel.add(lblMilestone2);
        panel.add(txtMilestone2);
        panel.add(lblTerminalAssessment);
        panel.add(txtTerminalAssessment);
        panel.add(lblAveGrade);
        panel.add(txtAveGrade);
        panel.add(closeButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerminalAssessment, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblAveGrade, 6, SpringLayout.WEST, panel);
       
        // Set label and text field position: top and bottom
        layout.putConstraint(SpringLayout.NORTH, lblMilestone1, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone1, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone2, 10, SpringLayout.SOUTH, lblMilestone1);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone2, 6, SpringLayout.SOUTH, txtMilestone1);
        layout.putConstraint(SpringLayout.NORTH, lblTerminalAssessment, 10, SpringLayout.SOUTH, lblMilestone2);
        layout.putConstraint(SpringLayout.NORTH, txtTerminalAssessment, 6, SpringLayout.SOUTH, txtMilestone2);
        layout.putConstraint(SpringLayout.NORTH, lblAveGrade, 10, SpringLayout.SOUTH, lblTerminalAssessment);
        layout.putConstraint(SpringLayout.NORTH, txtAveGrade, 6, SpringLayout.SOUTH, txtTerminalAssessment);
       
        // Set text field position: right
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 85, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 85, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerminalAssessment, 25, SpringLayout.EAST, lblTerminalAssessment);
        layout.putConstraint(SpringLayout.WEST, txtAveGrade, 66, SpringLayout.EAST, lblAveGrade);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtAveGrade);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
