package TestQ5;

public class Ex01 {
    public static void main(String[] args) {
        Starbucks starBucks = new Starbucks();
        TwoSomePlace twoSome = new TwoSomePlace();

        Person kim = new Person("김씨", 4000);
        Person lee = new Person("이씨", 4500);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");



            starBucks.enter(kim);
            starBucks.order();

            // 메서드 연결 = 메서드 체이닝을 통해 더 간단한 코드 표현 가능
            twoSome.enter(lee).order();



    }
}
