package Submarine;

public class U534 implements Submarine {

    boolean[] torpedoleft = new boolean[] {true, true, true, true, true, false, false, false, true, false, true};
    boolean[] torpedoright = new boolean[] {false, true, true, false, false, false, true, true, true, false,false};
    boolean[][] mines = new boolean[][]{{true,true,true,true,true},{true,true,false,false}};


    public U534 () {
        String submarineName = "Submarine U-534";
        int submarineXCoordinate = 1;
        int submarineYCoordinate = 1;
        int depth = 0;
        boolean torpedoleft[] = this.torpedoleft;
        boolean torpedoright[] = this.torpedoright;
        boolean mine[][] = this.mines;
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
        System.out.println("Торпеды");
        System.out.println("=======");
        if (isLeft) {
            System.out.println("Левая сторона:");
            System.out.println("--------------");
            for (int i = 0; i < torpedoleft.length; i++) {
                if (torpedoleft[i] == true) {
                    System.out.printf("%d отсек: торпеда заряжена %n", i + 1);
                } else {
                    System.out.printf("%d отсек: пусто %n", i + 1);
                }
            }
        } else {
            System.out.println("Правая сторона:");
            System.out.println("--------------");
            for (int i = 0; i < torpedoright.length; i++) {
                if (torpedoright[i] == true) {
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
                for (int y = 0; y < mines[0].length - 1 ; y++) {

                    if ( mines[x][y]){
                        System.out.printf("o|");
                    }
                else{
                        System.out.printf("x|");
                    }
                }
                System.out.printf("%n");
            }
        }
    }

    @Override
    public boolean isReadyToFire() {return false;}

    @Override
    public void fire() {}
}




