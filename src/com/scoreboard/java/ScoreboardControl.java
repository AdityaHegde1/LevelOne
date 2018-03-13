package com.scoreboard.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScoreboardControl implements ActionListener {
	JFrame frame = new JFrame();
	JButton Start = new JButton();
	JButton Timeout = new JButton();
	JButton Timeout2 = new JButton();
	JButton Basket = new JButton();
	JPanel panel2 = new JPanel();
Scoreboard scoreB = new Scoreboard();
public static void main(String[] args) {
	ScoreboardControl Run = new ScoreboardControl();
	Run.Run1();
	
}
private void Run1() {
	// TODO Auto-generated method stub
	frame.add(panel2);
	panel2.add(Basket);
	panel2.add(Start);
	panel2.add(Timeout);
	panel2.add(Timeout2);
	scoreB.Run1();
	frame.setVisible(true);
	Basket.setText("Basket");
	Start.setText("Basket");
	Timeout.setText("Timeout");
	Timeout2.setText("Timeout");
}public void actionPerformed(ActionEvent e) {
    Basket++;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == Basket) {
		scoreB.ChangeAwayScore(1);

	} else if (e.getSource() == Start) {
		scoreB.ChangeAwayScore(1);
		System.out.println();
	}
	if (e.getSource() == Timeout) {
		scoreB.ChangeTimeout(-1);

	} else if (e.getSource() == Timeout2) {
		scoreB.ChangeTimeout2(-1);
	}

}

}