

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Scoreboard {
JFrame frame = new JFrame();
JPanel Mainpanel = new JPanel();
JPanel Subpanel = new JPanel();
JPanel Subpanel2 = new JPanel();
JButton Start = new JButton();
JLabel team1 = new JLabel();
JLabel team2 = new JLabel();
JTextField scorebox = new JTextField();
JTextField score2box = new JTextField();
JLabel ScoreName = new JLabel();
JLabel Score2Name = new JLabel();
JButton Basket = new JButton();
int score;
int score2;
String name;
String name2;
public static void main(String[] args) {
Scoreboard Run = new Scoreboard();
Run.Run();
}
public void Run() {
	Subpanel.setLayout(new BoxLayout(Subpanel, BoxLayout.Y_AXIS) );
	Subpanel2.setLayout(new BoxLayout(Subpanel2, BoxLayout.Y_AXIS));
 
 	frame.add(Mainpanel);
 	Mainpanel.add(Subpanel);
 	Mainpanel.add(Subpanel2);
 	frame.setVisible(true);
 
 Subpanel.add(team1);



 Subpanel.add(team1);
 
 Subpanel2.add(team2);
 Subpanel.setVisible(true);
 Subpanel.add(scorebox);
 Subpanel2.add(score2box);
 Basket.setText("Basket");
 
 team1.setText("Team 1");
 team2.setText("Team 2");

 Subpanel.add(ScoreName);
 Subpanel2.add(Score2Name);
 
 
 ScoreName.setText("Score:");
 Score2Name.setText("Score:");
 Subpanel.add(scorebox);
 Subpanel2.add(score2box);
 score2box.setText("");
 Subpanel.add(Basket);
 // Put all code above this
 frame.pack(); 
 
 
 	
 }
 public void ChangeHomeScore(int newScore) {
 	score  = newScore;
 	ScoreName.setText(Integer.toString(score));
 	
 
 	
 }
 }
