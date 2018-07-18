package Submarine;

public class U571 implements Submarine {

    boolean[] torpedoSingle = new boolean[]{true, false, false, true, true, true, false, false, true, true, true, true, false, true};
    boolean[][] mines = new boolean[][]{{true, true, true, true, true, false}, {true, true, false, false, false}, {true, false, false, false, false}};

    public U571() {
        String submarineName = "Submarine U-571";
        int submarineXCoordinate = 15;
        int submarineYCoordinate = 15;
        int depth = 0;
    }

    @Override
    public int dive(int deltaDepth) {
        return 0;
    }

    @Override
    public int emmersion(int deltaDepth) {
        return 0;
    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public void reconnaissance() {
    }

    public void torpedoAmmoInterrogate(boolean torpedo, boolean mine) {
        System.out.println("...Опрос вооружения...");
        if (torpedo) {
            System.out.println("");
            System.out.println("Торпеды");
            System.out.println("=======");

            for (int i = 0; i < torpedoSingle.length; i++) {
                if (torpedoSingle[i] == true) {
                    System.out.printf("%d отсек: торпеда заряжена %n", i + 1);
                } else {
                    System.out.printf("%d отсек: пусто %n", i + 1);
                }
            }
        }
        if (mine) {
            System.out.println("");
            System.out.println("Мины");
            System.out.println("=======");
            for (int x = 0; x < mines.length; x++) {
                System.out.printf("|");
                for (int y = 0; y < mines[0].length - 1; y++) {

                    if (mines[x][y]) {
                        System.out.printf("o|");
                    } else {
                        System.out.printf("x|");
                    }
                }
                System.out.printf("%n");
            }
        }
    }


    @Override
    public boolean isReadyToFire() {
        return false;
    }

    @Override
    public void fireTorpedo(int prepTorp) {
        if (torpedoSingle[prepTorp]) {
            torpedoSingle[prepTorp - 1] = !torpedoSingle[prepTorp - 1];
            System.out.println("");
            System.out.printf("%d отсек: Торпеда ушла... %n", prepTorp);
            System.out.printf("%n");
            torpedoAmmoInterrogate(true, false);
        } else {
            System.out.printf("%d отсек: Ошибка! Торпеда отсутствует... %n", prepTorp);
            System.out.printf("%n");
        }
    }
}
