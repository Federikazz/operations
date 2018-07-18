package Submarine;

import java.util.Scanner;
import java.lang.String;

/**
 * Created by ivfe0316 on 12.07.2018.
 */
public class Main {
    public static void main(String[] args) {

        U571 sub571 = new U571();

        System.out.println("Выберите действие:");
        System.out.println("Опрос аппарата - 1, enter");
        System.out.println("Запуск торпеды - 2, enter");

        Scanner interrogateScaner = new Scanner(System.in);
        int mainDecidion = interrogateScaner.nextInt();
        if (mainDecidion == 1) {
            sub571.torpedoAmmoInterrogate(true, true);
        }
        if (mainDecidion == 2) {
            System.out.println("Выберите номер торпеды для пуска: [1 - " + sub571.torpedoSingle.length + "]");
            Scanner torpedoFire = new Scanner(System.in);
            int torpedoToFireNumber = torpedoFire.nextInt();
            sub571.fireTorpedo(torpedoToFireNumber);
        }
    }
}



//        sub571.torpedoAmmoInterrogate(true,true);
//        sub571.fireTorpedo(4);
//        sub571.fireTorpedo(12);



















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