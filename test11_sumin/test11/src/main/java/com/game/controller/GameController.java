package com.game.controller;

import com.game.main.MainView;

public class GameController {

    private int num;

    public GameController() {
    }
// ??? 너는 왜 여깄냐


    //1~3 난수 만드는 기능 메소드

    public int random() {//랜덤 int num을 리턴하는 메소드

        return (int) (Math.random() * 3) + 1;
        //(Math.random()) -> 0~1미만에 난수가 나온다 (랜덤 숫자변환)
        //(Math.random()*3) 0~2미만에 난수가 나옴
        //1~3사이에 난수가 나와야하니까 +1 한것임.

    }

    //가위바위보 비교하는 기능

    public void pare(int su) {

        MainView v = new MainView();

        num = random();
//su는 사용자가 입력하는 숫자를 뜻함
        if (su == 1) {//나 가위

            switch (num) {//컴퓨터가 랜덤으로 고른 수 1번은 가위 2번 바위 3번 보자기

                case 1:
                    System.out.println("나 : 가위 ");
                    System.out.println("컴퓨터 : 가위 ");
                    v.draw();
                    return;

                case 2:
                    System.out.println("나 : 가위 ");
                    System.out.println("컴퓨터 : 바위 ");
                    v.lose();
                    return;

                case 3:
                    System.out.println("나 : 가위 ");
                    System.out.println("컴퓨터 : 보 ");
                    v.win();
                    return;
            }
        }


        if (su == 2) {//나 바위
            switch (num) {

                case 1:
                    System.out.println("나 : 바위 ");
                    System.out.println("컴퓨터 : 바위 ");
                    v.draw();
                    return;

                case 2:
                    System.out.println("나 : 바위 ");
                    System.out.println("컴퓨터 : 가위 ");
                    v.win();
                    return;

                case 3:
                    System.out.println("나 : 바위 ");
                    System.out.println("컴퓨터 : 보 ");
                    v.lose();
                    return;

            }
        }

        if (su == 3) {//나 보
            switch (num) {

                case 1:
                    System.out.println("나 : 보 ");
                    System.out.println("컴퓨터 : 보 ");
                    v.draw();
                    return;


                case 2:
                    System.out.println("나 : 보 ");
                    System.out.println("컴퓨터 : 가위 ");
                    v.lose();
                    return;


                case 3:
                    System.out.println("나 : 보 ");
                    System.out.println("컴퓨터 : 바위 ");
                    v.win();
                    return;

            }
        }

    }

    //이겼을때 내가 선 묵찌빠

    public void winpare(int su) {
        MainView v = new MainView();

        num = random();

        System.out.println();

        if (su == 1) {//나 묵

            switch (num) {

                case 1:
                    System.out.print("나 : 묵 ");
                    System.out.println("컴퓨터 : 묵 ");
                    return;


                case 2:
                    System.out.print("나 : 묵 ");
                    System.out.println("컴퓨터 : 찌 ");
                    v.win();
                    return;


                case 3:
                    System.out.print("나 : 묵 ");
                    System.out.println("컴퓨터 : 빠 ");
                    v.lose();
                    return;

            }

        }

        if (su == 2) {//나 찌

            switch (num) {

                case 1:
                    System.out.print("나 : 찌 ");
                    System.out.println("컴퓨터 : 묵 ");
                    v.lose();
                    return;


                case 2:
                    System.out.print("나 : 찌 ");
                    System.out.println("컴퓨터 : 찌 ");
                    return;


                case 3:
                    System.out.print("나 : 찌 ");
                    System.out.println("컴퓨터 : 빠 ");
                    v.win();
                    return;

            }
        }

        if (su == 3) {//플레이어 : 빠

            switch (num) {

                case 1:
                    System.out.print("나 : 빠 ");
                    System.out.println("컴퓨터 : 묵 ");
                    v.win();
                    return;


                case 2:
                    System.out.print("나 : 빠 ");
                    System.out.println("컴퓨터 : 찌 ");
                    v.lose();
                    return;


                case 3:
                    System.out.print("나 : 빠 ");
                    System.out.println("컴퓨터 : 빠 ");
                    return;
            }

        }

    }


    //졌을때 컴퓨터 선 묵찌빠

    public void losepare(int su) {

        MainView v = new MainView();

        num = random();

        System.out.println();

        if (su == 1) {//나 묵

            switch (num) { //질문 비긴거 이긴거 진거 순서 바꿔도 되나용?

                case 1:
                    System.out.print("나 : 묵 ");
                    System.out.println("컴퓨터 : 묵 ");
                    return;


                case 2:
                    System.out.print("나 : 묵 ");
                    System.out.println("컴퓨터 : 찌 ");
                    v.win();
                    return;


                case 3:
                    System.out.print("나 : 묵 ");
                    System.out.println("컴퓨터 : 빠 ");
                    v.lose();
                    return;

            }

        }

        if (su == 2) {//나 찌

            switch (num) {

                case 1:
                    System.out.print("나 : 찌 ");
                    System.out.println("컴퓨터 : 묵 ");
                    v.lose();
                    return;


                case 2:
                    System.out.print("나 : 찌 ");
                    System.out.println("컴퓨터 : 찌 ");
                    return;


                case 3:
                    System.out.print("나 : 찌 ");
                    System.out.println("컴퓨터 : 빠 ");
                    v.win();
                    return;

            }

        }

        if (su == 3) {//나 빠

            switch (num) {

                case 1:
                    System.out.print("나 : 빠 ");
                    System.out.println("컴퓨터 : 묵 ");
                    v.win();
                    return;

                case 2:
                    System.out.print("나 : 빠 ");
                    System.out.println("컴퓨터 : 찌 ");
                    v.lose();
                    return;

                case 3:
                    System.out.print("나 : 빠 ");
                    System.out.println("컴퓨터 : 빠 ");
                    return;

            }

        }

    }
}
