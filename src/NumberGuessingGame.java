
	

	import java.util.Random;

	import javax.swing.JOptionPane;

	public class NumberGuessingGame {
	public static void main(String[] args) {
		
	String answer = JOptionPane.showInputDialog("Guess the number");
	int answer1 = Integer.parseInt(answer);
	Random gen = new Random ();
	Random factory = new Random();
	int r = factory.nextInt(3);
	System.out.print(r);
	int answer11 = 0;
	if(answer11==r){
	JOptionPane.showMessageDialog(null, "Congrats you guessed the number!");
		}
		
	else {
		JOptionPane.showMessageDialog(null," Sorry guess again");
	}
		}
		
	

	
	
	
	
	

}

