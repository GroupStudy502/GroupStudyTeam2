package q5myself;

import java.util.Map;

public abstract class AbsCoffeeshop implements Coffeeshop {
    private String name;
    private Map<String, Integer> menu;
    private Customer p1 ;

    public AbsCoffeeshop(String name, Map<String, Integer> menu){
        this.name = name;
        this.menu = menu;
    }

    @Override
    public Coffeeshop enter(Customer p1) {
        this.p1 = p1;
        System.out.printf("%s님이 %s에 입장하였습니다.%n", p1.getName(), name);

        return this;
    }

    @Override
    public Coffeeshop order() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }
}
