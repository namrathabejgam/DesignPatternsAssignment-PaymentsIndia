package FactoryPatternPayments;

public class DebitCard extends Payments {
    public DebitCard()
    {
        setPaymentmethod("Debit Card");
    }
}
