package Submarine;

/**
 * Created by ivfe0316 on 12.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        Submarine u571 = new Submarine();
        u571.submarineName = "U-571";
        u571.submarineXCoordinate = 1;
        u571.submarineYCoordinate = 1;
        u571.depth = 0;
        u571.lever = Submarine.Lever.DOWN;
        u571.torpedo = new int[]{1,2,3,4,5,6,7,8,9,10};
        u571.dive(4);
        u571.controlPeriscope(Submarine.Lever.DOWN);
        u571.move(5,5);
        u571.accelerate(10);
        u571.interrogatePeriscope();
        u571.move(-3,-3);
        u571.emersion(3);
        u571.controlPeriscope (Submarine.Lever.CENTER);
        u571.interrogatePeriscope();

}
