package TestQ5;

import java.util.Map;
// 하위클래스 (StarBucks, TwoSomePlace) 공통적인 객체 자원 정의
public abstract class AbstractCoffeeShop implements CoffeeShop {
    private String name; // 커피숍 이름
    private Map<String, Integer> meuns; // 메뉴
    private Person person; // person객체 할당

    public AbstractCoffeeShop(String name, Map<String, Integer> menus) {
        this.name = name; // 추상 클래스 메서드 정의
        this.meuns = menus;
    }

    @Override
    public CoffeeShop enter(Person person) {
        this.person = person;
        System.out.printf("%s님이 %s에 입장하였습니다.%n", person.getName(), name);

        return this;
    }

    @Override
    public CoffeeShop order() {
        String menu = person.getMenu();

        int money = person.getMoney();
        person.setMoney(money);

        System.out.printf("%s님이 %s에서 %s를 %d원에 주문했습니다.%n", person.getName(), name, menu, person.getMoney());

        return this;
    }

    public String getName() {
        return name;
    }



}
