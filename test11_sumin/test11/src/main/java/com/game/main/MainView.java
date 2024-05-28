package com.game.main;

import com.game.controller.GameController;

import java.util.Objects;
import java.util.Scanner;

public class MainView {

    //여기 이해안됨
    GameController ct = new GameController();//컨트롤러로 return해야하니까 객체선언함


    public void mainMenu() {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("-------묵찌빠 게임을 시작합니다-------");

            System.out.println();

            System.out.println("1.게임 시작  2.게임 종료");

            System.out.print("입력 : ");


            int su = sc.nextInt();


            switch (su) {

                case 1:
                    gameStart();
                    break;

                case 2:
                    System.out.println("게임을 종료합니다.");
                    return;

            }


        } while (true);


    }

    //게임시작 출력화면 가위바위보 먼저시작
    //순서가 이게 맞나요?? 게임스타트가 위로 가야하지 않나요?
    public void gameStart() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("-------가위 바위 보 시작-------");

            System.out.println("1.가위 2.바위 3.보");

            System.out.print("입력 : ");


            int num = sc.nextInt();


            switch (num) {
//컴퓨터가 낸거랑 내가 낸 거랑 비교하는 pare
                case 1:
                    ct.pare(1);
                    return;//비교하는 controller에 pare로감

                case 2:
                    ct.pare(2);
                    return;

                case 3:
                    ct.pare(3);
                    return;

            }

        } while (true);

    }

    public void draw() {//비겼으니까 가위바위보 다시시작

        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("****결과는 비겼습니다****" + "\n" + "-------다시 가위바위보!--------");

            System.out.println("1.가위 2. 바위 3.보");

            System.out.print("입력 : ");

            // System.out.println();

            int num = sc.nextInt();


            switch (num) {

                case 1:
                    ct.pare(1);
                    return;

                case 2:
                    ct.pare(2);
                    return;

                case 3:
                    ct.pare(3);
                    return;

            }

        } while (true);

    }


    //가위바위보 이겼으니까 내가 먼저 묵찌빠 시작

    public void win() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("****결과는 이겼습니다!!****");

            System.out.println("\n" + "------묵찌빠 시작!!(내가 공격)------");


            process(sc, "WIN");



        } while (true);

    }


    //가위바위보 졌으니까 컴퓨터가 먼저 묵찌빠 시작

    public void lose() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("****결과는 이겼습니다!!*****");

            System.out.println("\n" + "------묵찌빠 시작!!(컴퓨터가 공격)------");

            process(sc, "LOSE");


        } while (true);


    }

    public void process(Scanner sc, String mode) {
        mode = Objects.requireNonNullElse(mode, "WIN");

        System.out.println("\n" + "1.묵 2.찌 3.빠");

        System.out.print("입력 : ");

        //System.out.println();

        int num = sc.nextInt();

        if (mode.equals("WIN")) {
            switch (num) {

                case 1:
                    ct.winpare(1);
                    return;

                case 2:
                    ct.winpare(2);
                    return;
                case 3:
                    ct.winpare(3);
                    return;
            }


        } else {
            switch (num) {

                case 1:
                    ct.losepare(1);
                    return;

                case 2:
                    ct.losepare(2);
                    return;

                case 3:
                    ct.losepare(3);
                    return;

            }

        }
    }
}
