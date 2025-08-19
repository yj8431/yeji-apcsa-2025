package robot;
import kareltherobot.*;


public class Starter implements Directions{

  public static void main(String[] args) {

    World.setVisible(true);// allows us to see the run output
    // the bigger the street, the farther north
    World.setSize(20,20);


    // The line below creates a Robot that we will refer to as rob
    // Find out what the numbers and direction do!
    // Put rob in a better location for your initials.
    Robot rob = new Robot(15,2,South,10);

    // Want a second robot?  No prob.  They are cheap :)
    //Robot dude = new Robot(7,5,West,9);
    // examples of commands you can invoke on a Robot
    Robot dude = new Robot(13,5,South,10);
    Robot hi = new Robot(15,10,South,20);
    World.setDelay(5);
    
    // starting the letter Y
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();

    //finish letter Y
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.turnLeft();
    dude.turnLeft();
    dude.turnLeft();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();

    //starting letter J
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.turnLeft();
    hi.turnLeft();
    hi.turnLeft();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();
    hi.turnLeft();
    hi.turnLeft();
    hi.turnLeft();
    hi.move();
    hi.putBeeper();
    hi.move();
    hi.putBeeper();

  }
}
