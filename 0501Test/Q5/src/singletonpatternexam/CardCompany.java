package singletonpatternexam;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private int cardNumber = 10000;

    private CardCompany() {}

    public static CardCompany getInstance() {
        if(instance == null)
            instance = new CardCompany();
        return instance;
    }

    public Card createCard() {
        Card card = new Card();
        card.setCardNumber(++cardNumber);
        return card;
    }
}
