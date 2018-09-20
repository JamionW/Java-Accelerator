package multiThreadPackage;

/* 
 * 
 *  Name: Jamion Williams
 *  Date: 5/27/2018
 *  Course: CPSC2800 - Intro to OS
 *  Section: online Summer I 2018
 *  
 */

public class MultiThreadTester {
	public static void main(String[] args) {
		//create the teams
		MultiThread redTeam = new MultiThread("Red");
		MultiThread blueTeam = new MultiThread("Blue");
		MultiThread whiteTeam = new MultiThread("White");
		
		// play ball!
		redTeam.playBall();
		blueTeam.playBall();
		whiteTeam.playBall();
	}
}
