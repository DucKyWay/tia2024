package com.suphawinee.TIA2024;

import java.util.ArrayList;

public class TIA2024 {
	
	private TIA2024Gui gui;
	private int countdown = 600; //10 mins
	private int currentCountdown = countdown;
	
	private ArrayList<String> contentImage;
	
	public TIA2024() {
		
		this.contentImage = new ArrayList<String>();
		this.contentImage.add("image_1.png");
		this.contentImage.add("image_2.png");
	}
	
	public void start() {
		
		gui = new TIA2024Gui(this);
		gui.start();
	}
	
	public TIA2024Gui getGui() {
		return gui;
	}
	
	public int getCountdown() {
		return countdown;
	}
	
	public void setCountdown(int countdown) {
		this.countdown = countdown;
	}
	
	public int getCurrentCountdown() {
		return currentCountdown;
	}
	
	public void setCurrentCountdown(int currentCountdown) {
		this.currentCountdown = currentCountdown;
		getGui().setCountdownString(getTimeAsString(currentCountdown));
	}
	
	public static String getTimeAsString(int time) {
		
		StringBuilder sb = new StringBuilder();
		
		int hours, minutes, seconds;

		hours = (int) Math.ceil(time / 3600);
		time = time - (hours * 3600);

		minutes = (int) Math.ceil(time / 60);
		time = time - (minutes * 60);

		seconds = time;

		if (hours > 0) {
			if (hours == 1) {
				sb.append(hours);
				sb.append(" hour ");
			} else {
				sb.append(hours);
				sb.append(" hours ");
			}
		}

		if (minutes > 0) {
			if (minutes == 1) {
				sb.append(minutes);
				sb.append(" minute ");
			} else {
				sb.append(minutes);
				sb.append(" minutes ");
			}
		}

		if (seconds > 0) {
			if (seconds == 1) {
				sb.append(seconds);
				sb.append(" second");
			} else {
				sb.append(seconds);
				sb.append(" seconds");
			}
		}
		
		if (sb.length() == 0)
			return "0 second";
		return sb.toString();
	}
}
