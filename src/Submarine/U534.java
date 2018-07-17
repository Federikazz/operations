package Submarine;

/**
 * Created by ivfe0316 on 17.07.2018.
 */
public class U534 implements Submarine {


    @Override
    public int dive(int deltaDepth) {return 0;}

    @Override
    public int emmersion(int deltaDepth) {return 0;}

    @Override
    public void reconnaissance() {}

    public void torpedoAmmoInterrogate(boolean[] torpedo, boolean isLeft) {
        for (int i = 0; i < torpedo.length; i++) {
            if (torpedo[0] = true) {
                System.out.printf("%d отсек: торпеда заряжена %n", torpedo.length);
            } else {
                System.out.printf("%d отсек: пусто %n", torpedo.length);
            }
        }
    }

    @Override
    public boolean isReadyToFire() {return false;}

    @Override
    public void fire() {}
}




