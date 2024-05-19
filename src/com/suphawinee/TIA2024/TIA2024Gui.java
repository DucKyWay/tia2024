package com.suphawinee.TIA2024;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TIA2024Gui {

	private static TIA2024 instance;
	
	private JFrame frame;
	private JLabel txtShowTimes;
	private JTextField inputHours;
	private JTextField inputMinutes;
	private JTextField inputSeconds;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TIA2024Gui window = new TIA2024Gui(instance);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//create

	public TIA2024Gui(TIA2024 instance) {
//		this.instance = instance;
		
		initialize();
		
	}

	public void start() {
//		initialize();
//		frame.setVisible(true);
	}

	//initialize
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 450);
		frame.setTitle("Not Backache - TIA2024 | Suphawinee");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel txtHeader = new JLabel("I hope you don't have back pain.");
		txtHeader.setBounds(95, 25, 235, 22);
		txtHeader.setFont(new Font("Prompt", Font.BOLD, 14));
		frame.getContentPane().add(txtHeader);
		
		JLabel imgLabel = new JLabel(new String(""));
		imgLabel.setIcon(new ImageIcon(TIA2024Gui.class.getResource("/com/suphawinee/TIA2024/content/image_1.png")));
		imgLabel.setBounds(79, 0, 269, 347);
		frame.getContentPane().add(imgLabel);
		
		JLabel txtCountdown = new JLabel("Countdown: ");
		txtCountdown.setBounds(125, 353, 82, 14);
		frame.getContentPane().add(txtCountdown);
		
		JLabel txtShowTimes = new JLabel("0 s");
		txtShowTimes.setBounds(215, 353, 123, 14);
		frame.getContentPane().add(txtShowTimes);
		
		JLabel txtDelay = new JLabel("Delay :");
		txtDelay.setBounds(79, 381, 46, 14);
		frame.getContentPane().add(txtDelay);
		
		inputHours = new JTextField();
		inputHours.setText("0");
		inputHours.setColumns(10);
		inputHours.setBounds(125, 378, 25, 20);
		frame.getContentPane().add(inputHours);
		
		JLabel txtHrMin = new JLabel(":");
		txtHrMin.setBounds(153, 381, 6, 14);
		frame.getContentPane().add(txtHrMin);
		
		inputMinutes = new JTextField();
		inputMinutes.setText("10");
		inputMinutes.setBounds(160, 378, 25, 20);
		frame.getContentPane().add(inputMinutes);
		inputMinutes.setColumns(10);		
		
		JLabel txtMinSec = new JLabel(":");
		txtMinSec.setBounds(187, 381, 6, 14);
		frame.getContentPane().add(txtMinSec);
		
		inputSeconds = new JTextField();
		inputSeconds.setText("0");
		inputSeconds.setColumns(10);
		inputSeconds.setBounds(194, 378, 25, 20);
		frame.getContentPane().add(inputSeconds);
		
		JButton btnStart = new JButton("Save & Start");
		btnStart.setBounds(237, 376, 105, 23);
		frame.getContentPane().add(btnStart);
		
	}
	
	public void setCountdownString(String message) {
		txtShowTimes.setText(message);
	}
	
	public int getInputHours() {
		return parseInput(inputHours.getText());
	}
	
	public int getInputMinutes() {
        return parseInput(inputMinutes.getText());
    }

    public int getInputSeconds() {
        return parseInput(inputSeconds.getText());
    }

	private int parseInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0; //if no valid
        }
    }
	
	
}

















