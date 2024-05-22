package q5myself;

import java.util.HashMap;
import java.util.Map;

public class MegaCoffee extends AbsCoffeeshop {

    private static Map<String, Integer> menu;

    static {
        menu = new HashMap<>();
        menu.put("아메리카노", 4000);
        menu.put("라떼", 4500);
    }

    public MegaCoffee() {
        super("메가커피", menu);

    }
}
