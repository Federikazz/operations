package Submarine;

public class U571 implements Submarine {

    boolean[] torpedoSingle = new boolean[] {true, false, false, true, true, true, false, false, true, true, true, true, false, true};

    public U571 () {
        String submarineName = "Submarine U-571";
        int submarineXCoordinate = 15;
        int submarineYCoordinate = 15;
        int depth = 0;
        boolean[] torpedo = this.torpedoSingle;
        boolean isLeft = true;
    }

    @Override
    public int dive(int deltaDepth) {return 0;}

    @Override
    public int emmersion(int deltaDepth) {return 0;}

    @Override
    public void reconnaissance() {}

    public void torpedoAmmoInterrogate(boolean torpedo, boolean isLeft, boolean mine) {
        System.out.println("...Опрос вооружения...");
        System.out.println("                      ");
        for (int i = 0; i < torpedoSingle.length; i++) {
            if (torpedoSingle[i] == true) {
                System.out.printf("%d отсек: торпеда заряжена %n", i+1);
            } else {
                System.out.printf("%d отсек: пусто %n", i+1);
            }
        }
    }

    @Override
    public boolean isReadyToFire() {return false;}

    @Override
    public void fire() {}
}
