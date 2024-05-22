package q5myself;

public class Customer {
    private String name;
    private String menu;
    private int money;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String toString() {
        return String.format("%s님의 남은 금액은 %d원 입니다.%n", name, money);
    }
}
