package Submarine;

/**
 * Created by ivfe0316 on 12.07.2018.
 */
public interface Submarine {
    int dive (int deltaDepth);
    int emmersion (int deltaDepth);
    //int move ();
    // метод reconnaissance для U-571 поднимает перескоп, а для U-534 - радиоантенну.
    void reconnaissance ();
    // tAI - опрос торпедного магазина
    void torpedoAmmoInterrogate (boolean[]torpedo, boolean isLeft);
    boolean isReadyToFire ();
    boolean fire ();


}








//    String submarineName;
//    int submarineSpeed;
//    int submarineXCoordinate;
//    int submarineYCoordinate;
//    int depth;
//    enum Lever {LEFT,RIGHT,CENTER,DOWN};
//    Lever lever;
//    int periscope;
//    boolean[] torpedo;
//    }

