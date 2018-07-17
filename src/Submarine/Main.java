package Submarine;

import java.util.Scanner;
import java.lang.String;

/**
 * Created by ivfe0316 on 12.07.2018.
 */
public class Main {
    public static void main(String[] args) {

        String submarineName = "Submarine";
        int submarineXCoordinate = 1;
        int submarineYCoordinate = 1;
        int depth = 0;
        //u571.lever = Submarine.Lever.DOWN;
        boolean[] torpedo = new boolean[]{true, true, true, true, true, false, false, false, true, false};
        boolean isLeft = true;

        U534 sub534 = new U534();

        sub534.torpedoAmmoInterrogate(torpedo, isLeft);


//        u571.controlPeriscope(Submarine.Lever.DOWN);
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите дельту X для нового положения: ");
//        int init_x_coord = in.nextInt();
//        System.out.print("Введите дельту X для нового положения: ");
//        int init_y_coord = in.nextInt();
//        System.out.print("Введите дельта-глубину: ");
//        int sdepth = in.nextInt();
//
//
//        u571.move (init_x_coord, init_y_coord);
//        u571.dive(sdepth);
//        u571.accelerate(10);
//        u571.interrogatePeriscope();
//        u571.move(-3, -3);
//        u571.emersion(3);
//        u571.controlPeriscope(Submarine.Lever.CENTER);
//        u571.interrogatePeriscope();

    }
}