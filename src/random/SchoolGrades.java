package random;

import javax.swing.JOptionPane;

public class SchoolGrades {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog(null,"What is your grade?");
	int grade = Integer.parseInt(answer);
if(grade>=70) {
	JOptionPane.showMessageDialog(null,"Congratulations you passed!");

}
else { 
	
	JOptionPane.showMessageDialog(null, "Sorry you failed.");
     }

}
}
