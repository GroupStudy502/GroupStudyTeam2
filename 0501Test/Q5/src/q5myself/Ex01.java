package q5myself;

public class Ex01 {
    public static void main(String[] args) {
        BaeksCoffee baeks = new BaeksCoffee();
        MegaCoffee mega = new MegaCoffee();

        Customer jon = new Customer("john", 15000);
        Customer min = new Customer("mason", 10000);

        jon.setMenu("라떼");
        min.setMenu("아메리카노");
    }
}
