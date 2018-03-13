
package com.scoreboard.java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Scoreboard  {
	JFrame frame = new JFrame();
	JPanel Mainpanel = new JPanel();
	JPanel Subpanel = new JPanel();
	JPanel Subpanel2 = new JPanel();
	JPanel Subpanel3 = new JPanel();
	
	JLabel timeouts = new JLabel();
	JLabel timeouts2 = new JLabel();
	
	JLabel team1 = new JLabel();
	JLabel team2 = new JLabel();
	JLabel scorebox = new JLabel();
	JLabel score2box = new JLabel();
	JLabel ScoreName = new JLabel();
	JLabel Score2Name = new JLabel();
	
	int score = 0;
	int timeout = 3;
	int timeout2 = 3;
	int score2;
	String name;
	String name2;

	

	public void Run1() {
		Subpanel.setLayout(new BoxLayout(Subpanel, BoxLayout.Y_AXIS));
		Subpanel2.setLayout(new BoxLayout(Subpanel2, BoxLayout.Y_AXIS));

		frame.add(Mainpanel);
		Mainpanel.add(Subpanel);
		Mainpanel.add(Subpanel2);
		Mainpanel.add(Subpanel3);
		frame.setVisible(true);
		
		Subpanel.add(team1);

		Subpanel.add(team1);

		Subpanel2.add(team2);
		Subpanel.setVisible(true);
		Subpanel.add(scorebox);
		Subpanel2.add(score2box);
		
		scorebox.setText("0");
		score2box.setText("0");
		timeouts.setText("3");
		timeouts2.setText("3");
		team1.setText("Team 1");
		team2.setText("Team 2");

		Subpanel.add(ScoreName);
		Subpanel2.add(Score2Name);

		ScoreName.setText("Score:");
		Score2Name.setText("Score:");
		Subpanel.add(scorebox);
		Subpanel2.add(score2box);

		
		Subpanel.add(timeouts);
		Subpanel.add(timeouts2);
		// Put all code above this
		frame.pack();

	}

	public void ChangeHome2Score(int newScore) {
		score += newScore;
		score2box.setText(Integer.toString(score));

	}

	public void ChangeAwayScore(int newScore3) {
		score2 += newScore3;
		scorebox.setText(Integer.toString(score2));
	}

	



	public void ChangeTimeout(int newTimeout) {

		timeout += newTimeout;
		timeouts.setText(Integer.toString(timeout));

	}




	public void ChangeTimeout2(int newTimeouts2) {

		timeout2 += newTimeouts2;
		timeouts2.setText(Integer.toString(timeout2));

	}

}
