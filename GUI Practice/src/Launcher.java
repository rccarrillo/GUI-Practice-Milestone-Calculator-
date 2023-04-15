import javax.swing.JFrame;

public class Launcher {
	public static void main(String[] args) {
		// Create and show the GUI
		MilestoneCalculator calculator = new MilestoneCalculator();
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setVisible(true);
	}
}
