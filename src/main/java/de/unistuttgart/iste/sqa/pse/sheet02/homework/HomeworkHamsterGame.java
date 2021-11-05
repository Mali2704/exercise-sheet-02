package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 * 
 * @author Mehmet Ali Onmaz
 * @version 05.11.2021
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave (lower left corner - row 6 * column 2 and
	 * indexing starts with 0).
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// Move to the second grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		

		// Pick up the second grain
		paule.pickGrain();

		// Move to the third grain
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		
		// Pick up third grain
		paule.pickGrain();
		
		//Move to the fourth grain
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		
		//Pick up fourth grain
		paule.pickGrain();
		
		//Move to the cave
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		
		
		// Pick up grains in the cave
		paule.pickGrain();
		paule.pickGrain();
		paule.pickGrain();

		// Put down all grains in the cave
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();

	}
}
