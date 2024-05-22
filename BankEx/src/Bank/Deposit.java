package Bank;

public class Deposit extends AccountProduct {
    protected int payment;

    Deposit(String name){
        this.name = name;
        rate = 0.045;
    }
    @Override
    public int basicInterest(int payment, int period) {
        this.payment = payment;
        this.period = period;
        interestMoney = (int)(payment * rate) * period / 12;
        return interestMoney;
    }
    @Override
    public int maturityAmount() {
        maturityAmount = payment + interestMoney;
        return maturityAmount;
    }
    @Override
    public int realInterest(int monthPayment, int period) {
        realInterestMoney = interestMoney - (int)(interestMoney * 0.154);
        return realInterestMoney;
    }
    @Override
    public int realMaturityAmount() {
        realMaturityAmount = payment + realInterestMoney;
        return realMaturityAmount;
    }
}
