package multiThreadPackage;

/* 
 * 
 *  Name: Jamion Williams
 *  Date: 5/27/2018
 *  Course: CPSC2800 - Intro to OS
 *  Section: online Summer I 2018
 *  
 */

public class MultiThread implements Runnable {
	// instantiate a team to play with the ball
	private Thread thread;
	private String teamName;
	private long randomSeconds = Math.round(Math.random() * 1000);
	private int turn = 1;
	
	// our default class
	public MultiThread(String name) {
		teamName = name;
	}
	
	// the run() void is inherent in the Runnable implementation
	public void run() {
		try {
			// we'll look to the Playground class to do some record-keeping for us,
			//  both in keeping track of the turns and the ball "status"
			while (turn <= Playground.turns) {
				if (Playground.isBallinUse = false) {
					System.out.println(teamName + " team wants the ball. Turn " + turn);
				} else {
					System.out.println(teamName + " team is playing with the ball! Turn " + turn);
					Playground.isBallinUse = true;
				}
				Thread.sleep(randomSeconds);
				System.out.println(teamName + " team is done playing with the ball. Turn " + turn);
				turn++;
				Playground.isBallinUse = false;
			}
		} catch (InterruptedException e) {
			// this should never happen, but even the best-laid plans...
			System.out.println(teamName + " team lost the ball! Turn " + turn);
			turn++;
			Playground.isBallinUse = false;
		}	
	}
	
	// this starts the thread, and the sleep in the run() implementation gives the 
	//  other threads opportunity to roll in.
	public void playBall() {
		if (thread == null) {
			thread = new Thread(this, teamName);
			System.out.println("Created the " + teamName + " team!");
			thread.start();
		}
	}
}
