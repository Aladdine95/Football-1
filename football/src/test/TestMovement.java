package test;

import java.util.Random;

import databall.DataBall;
import dataplayer.DataPlayer;
import process.movement.MovementPlayer;

public class TestMovement {

	public static void main(String[] args) {
		DataPlayer dp = new DataPlayer();
		DataBall db = new DataBall();
		boolean paused = false;
		int restart = 0;
		Random r = new Random();
		int low = 0;
		int highx = 48;
		int highy = 84;
		while(restart != 22) {
			System.out.println("D�but de jeu");
			System.out.println("_____________________________");
			System.out.println("Ball is at : x = " + db.getPositionX() + " y = " + db.getPositionY());
			System.out.println("Player's position :");
			while(!paused) {
				MovementPlayer mp = new MovementPlayer(db, dp);
				paused = true;
			}
			db.setPositionX(r.nextInt(highx-low));
			db.setPositionY(r.nextInt(highy-low));
			paused = false;
			System.out.println("_____________________________");
			System.out.println("fin");
			restart += 1;
		}
	}
}
