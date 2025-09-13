package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/finalTestWorld2024.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 26, 101);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");
		

	}

	// declared here so it is visible in all the methods!
	private Robot roomba = new Robot(26,101,East,0);

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(1);
		int totalBeepers = 0;
		int numPiles = 0;
		int largestPile = 0;
		int largestPileLocationX = 0;
		int largestPileLocationY = 0;
		int totalSquaredMoved = 0;


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		
		boolean moreToClean = true;

		totalSquaredMoved++;
		while (moreToClean) {
			while (roomba.frontIsClear()) {
				if (roomba.nextToABeeper()){
					int currentPile = 0;
					numPiles++;
					while (roomba.nextToABeeper()) {
						totalBeepers++;
						roomba.pickBeeper();
						currentPile++;
					}
					//update biggest pile size
					if (currentPile > largestPile){
						largestPile = currentPile;
						largestPileLocationX = roomba.avenue();
						largestPileLocationY = roomba.street();
					}
				}
				
				roomba.move();
				totalSquaredMoved++;
				
			}
			//left U-turn
			if (roomba.facingEast()) {
				roomba.turnLeft();
				if (!roomba.frontIsClear()){
					if (roomba.nextToABeeper()){
					numPiles++;
					}
					while (roomba.nextToABeeper()) {
						totalBeepers++;
						roomba.pickBeeper();
					}
					moreToClean = false;
				}
				else{
					roomba.move();
					totalSquaredMoved++;
					roomba.turnLeft();
				}
			}
			//right U-turn
			else {
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				if (!roomba.frontIsClear()){
					if (roomba.nextToABeeper()){
					numPiles++;
					}
					while (roomba.nextToABeeper()) {
						totalBeepers++;
						roomba.pickBeeper();
					}
					moreToClean = false;
				}
				else{
					roomba.move();
					totalSquaredMoved++;
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
				}
			}
		}
		
		//int totalBeepers = 0; // Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
		System.out.println("The total number of piles is " + numPiles);
		System.out.println("The largest pile of beepers has " + largestPile + " beepers.");
		System.out.println("The largest pile (from bottom left corner) is right " + (largestPileLocationX - 101) + " and up " + (largestPileLocationY - 26));	
		System.out.println("The area is " + totalSquaredMoved + " square units.");
		System.out.println("The average pile size is " + ((double)(totalBeepers)/numPiles));
		System.out.println("The percent dirty is " + (double)(numPiles)/totalSquaredMoved);

		return totalBeepers;
	}

	
		/* OLD VERSION USING FOR LOOPS

		for (int i = 0; i < 7; i++) {
			roomba.move();
			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				totalBeepers++;
			}
			
		}
		roomba.turnLeft();
		roomba.move();
		roomba.turnLeft();
		for (int i = 0; i < 7; i++) {
			roomba.move();
			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				totalBeepers++;
			}
		}
		for (int i = 0; i < 3; i++) {
			roomba.turnLeft();
		}
		roomba.move();
		for (int i = 0; i < 3; i ++) {
			roomba.turnLeft();
		}
		for (int i = 0; i < 7; i++) {
			roomba.move();
			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				totalBeepers++;
			}
		}
		roomba.turnLeft();
		roomba.move();
		roomba.turnLeft();
		for (int i = 0; i < 7; i++) {
			roomba.move();
			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				totalBeepers++;
			}
		}
		for (int i = 0; i < 3; i++) {
			roomba.turnLeft();
		}
		roomba.move();
		for (int i = 0; i < 3; i ++) {
			roomba.turnLeft();
		}
		for (int i = 0; i < 7; i++) {
			roomba.move();
			while (roomba.nextToABeeper()){
				roomba.pickBeeper();
				totalBeepers++;
			}
			
		}
		*/
	

	
}
