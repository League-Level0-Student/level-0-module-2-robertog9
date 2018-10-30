import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("How old are you?");
		int num = Integer.parseInt(answer);
		if (num >= 18) {
			JOptionPane.showInputDialog(null, "Who should the next president be?");
		}

		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");

		}

	}
}
