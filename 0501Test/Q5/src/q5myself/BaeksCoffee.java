package q5myself;

import java.util.HashMap;
import java.util.Map;

public class BaeksCoffee extends AbsCoffeeshop{
    private static Map<String, Integer> menu;

    static {
        menu = new HashMap<>();
        menu.put("아메리카노", 3800);
        menu.put("라떼", 4300);
    }

    public BaeksCoffee() {
        super("빽스", menu);
    }
}
