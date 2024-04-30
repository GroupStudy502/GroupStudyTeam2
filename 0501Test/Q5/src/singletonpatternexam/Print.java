package singletonpatternexam;

public class Print {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();
        Card card1 = company.createCard();
        Card card2 = company.createCard();
        System.out.println("Card 1 number: " + card1.getCardNumber());
        System.out.println("Card 2 number: " + card2.getCardNumber());

        Card card3 = company.createCard();
        Card card4 = company.createCard();
        System.out.println("Card 3 number: " + card3.getCardNumber());
        System.out.println("Card 4 number: " + card4.getCardNumber());


    }
}
