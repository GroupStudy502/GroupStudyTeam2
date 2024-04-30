package basicConstructorTest;

public class Inherit {
    public static void main(String[] args) {
        Parent basicCon1 = new Parent();
        System.out.printf("basicCon1: %s%n", basicCon1);

        Child basicCon2 = new Child();
        System.out.println(basicCon2);
    }
}
