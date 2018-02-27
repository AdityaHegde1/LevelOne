
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

public class Scoreboard implements ActionListener {
	JFrame frame = new JFrame();
	JPanel Mainpanel = new JPanel();
	JPanel Subpanel = new JPanel();
	JPanel Subpanel2 = new JPanel();
	JButton Start = new JButton();
	JButton Timeout = new JButton();
	JLabel timeouts = new JLabel();
	JLabel timeouts2 = new JLabel();
	JButton Timeout2 = new JButton();
	JLabel team1 = new JLabel();
	JLabel team2 = new JLabel();
	JLabel scorebox = new JLabel();
	JLabel score2box = new JLabel();
	JLabel ScoreName = new JLabel();
	JLabel Score2Name = new JLabel();
	JButton Basket = new JButton();
	int score = 0;
	int timeout = 3;
	int timeout2 = 3;
	int score2;
	String name;
	String name2;

	public static void main(String[] args) {
		Scoreboard Run = new Scoreboard();
		Run.Run();
	}

	public void Run() {
		Subpanel.setLayout(new BoxLayout(Subpanel, BoxLayout.Y_AXIS));
		Subpanel2.setLayout(new BoxLayout(Subpanel2, BoxLayout.Y_AXIS));

		frame.add(Mainpanel);
		Mainpanel.add(Subpanel);
		Mainpanel.add(Subpanel2);
		frame.setVisible(true);
		Basket.addActionListener(this);
		Start.addActionListener(this);
		Timeout.addActionListener(this);
		Timeout2.addActionListener(this);
		Subpanel.add(team1);

		Subpanel.add(team1);

		Subpanel2.add(team2);
		Subpanel.setVisible(true);
		Subpanel.add(scorebox);
		Subpanel2.add(score2box);
		Basket.setText("Basket");
		Start.setText("Basket");
		scorebox.setText("-5");
		score2box.setText("-5");
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

		Subpanel.add(Basket);
		Subpanel.add(Start);
		Subpanel.add(Timeout);
		Subpanel.add(Timeout2);
		Subpanel.add(timeouts);
		Subpanel.add(timeouts2);
		// Put all code above this
		frame.pack();

	}

	public void ChangeHomeScore(int newScore) {
		score += newScore;
		score2box.setText(Integer.toString(score));

	}

	public void ChangeAwayScore(int newScore) {
		score2 += newScore;
		scorebox.setText(Integer.toString(score2));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Basket) {
			ChangeHomeScore(1);

		} else if (e.getSource() == Start) {
			ChangeAwayScore(1);
		}if (e.getSource() == Timeout) {
			ChangeTimeout(-1);

		} else if (e.getSource() == Timeout2) {
			ChangeTimeout2(-1);}
		
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


