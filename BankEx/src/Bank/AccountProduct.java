package Bank;

public class AccountProduct {
    protected double rate;
    protected int period;
    protected int payment;
    protected int interestMoney;
    protected int realInterestMoney;
    protected int maturityAmount;
    protected int realMaturityAmount;
    protected double realRate;
    protected String name;

    public String getName() {
        return name;
    }
    public int basicInterest(int monthPayment, int period) {
        this.payment = monthPayment;
        this.period = period;
        int sum = 0;
        for(int i = period; i > 0; i--) {
            interestMoney = (int)(monthPayment * rate) * i / period;
            sum += interestMoney;
        }
        return sum;
    }
    public int maturityAmount() {
        maturityAmount = payment * period + basicInterest(payment, period);
        return maturityAmount;
    }
    public int realInterest(int monthPayment, int period) {
        this.payment = monthPayment;
        this.period = period;
        int sum = 0;
        for(int i = period; i > 0; i--) {
            realInterestMoney = (int)(monthPayment * realRate(period)) * i / period;
            sum += realInterestMoney;
        }
        return sum;
    }
    public int realMaturityAmount() {
        realMaturityAmount = payment * period + realInterest(payment, period);
        return realMaturityAmount;
    }
    public double realRate(int period) {
        realRate = (rate * (period + 1) / 24) * (1 - 0.154);
        return realRate;
    }
}
