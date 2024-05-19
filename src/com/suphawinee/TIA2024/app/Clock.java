package com.suphawinee.TIA2024.app;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Clock {
	public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = new Runnable() {
            int hours = 1; // Set the countdown hours here
            int minutes = 30; // Set the countdown minutes here
            int seconds = 45; // Set the countdown seconds here

            @Override
            public void run() {
                if (hours > 0 || minutes > 0 || seconds > 0) {
                    if (seconds == 0) {
                        if (minutes == 0) {
                            hours--;
                            minutes = 59;
                            seconds = 59;
                        } else {
                            minutes--;
                            seconds = 59;
                        }
                    } else {
                        seconds--;
                    }
                    System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds) + " remaining");
                } else {
                    System.out.println("Time's up!");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
    }
}
