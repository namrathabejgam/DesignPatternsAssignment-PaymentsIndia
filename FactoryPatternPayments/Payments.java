package FactoryPatternPayments;

public class Payments {
    private String paymentmethod;
    public String getPaymentmethod()
    {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod=paymentmethod;
    }
    public void displayPaymentMethod()
    {
        System.out.println("Payment has been done through "+getPaymentmethod());
    }
}
