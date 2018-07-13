package Submarine;

/**
 * Created by ivfe0316 on 12.07.2018.
 */
public class Submarine {
    String submarineName;
    int submarineSpeed;
    int submarineXCoordinate;
    int submarineYCoordinate;
    int depth;
    enum Lever {LEFT,RIGHT,CENTER,DOWN};
    Lever lever;
    int periscope;
    int[] torpedo;
    boolean submarineAlive= true;

    public void dive(int deltaDepth){
        depth = depth + deltaDepth;
        System.out.println ("The submarine " + submarineName + " is dived to depth " + depth + " meters");
    }
    public void emersion (int deltaDepth){
        depth = depth - deltaDepth;
        System.out.println ("The submarine " + submarineName + " is surfaced to depth " + depth + " meters");
    }
    public void move (int deltaX, int deltaY) {
        submarineXCoordinate = submarineXCoordinate + deltaX;
        submarineYCoordinate = submarineYCoordinate + deltaY;
        System.out.println( submarineName + ": new coordinates is (" + submarineXCoordinate + "," + submarineYCoordinate + ")");
    }
    public void accelerate (int submarineSpeed){
        System.out.println("The submarine " + submarineName + " now is moved in cell (" + submarineXCoordinate + "," + submarineYCoordinate + ") with speed " + submarineSpeed);
    }
    public void controlPeriscope(Lever lever) {
        if (lever == Submarine.Lever.LEFT)  {
            periscope = 1;
        }
        else if (lever == Submarine.Lever.CENTER) {
            periscope = 2;
        }
        else if (lever == Submarine.Lever.RIGHT)  {
            periscope = 3;
            }
        else if (lever == Submarine.Lever.DOWN){
            periscope = 0;
        }
    }
    public void interrogatePeriscope(){
        switch (periscope) {
            case 1:
                System.out.println("Periscope is on and set on the left");
                break;
            case 2:
                System.out.println ("Periscope is on and set on the center");
                break;
            case 3:
                System.out.println ("Periscope is on and set on the right");
                break;
            case 0:
                System.out.println ("Periscope is off");
                break;
        }
        public void torpedoLaunch ();
    }
}
