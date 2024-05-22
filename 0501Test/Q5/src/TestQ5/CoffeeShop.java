package TestQ5;

// 커피숍에 대한 설계
public interface CoffeeShop {

    CoffeeShop enter(Person person);
    CoffeeShop order(); // 커피숍 매출 증가, 주문한 사람 비용 차감
    String getName(); // 커피숍 이름 조회

}
