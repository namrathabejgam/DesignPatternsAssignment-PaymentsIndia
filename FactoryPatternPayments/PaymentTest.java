package FactoryPatternPayments;
import java.util.Scanner;
public class PaymentTest {
    public static void main(String[] args)
    {
        Payments payments=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("How would you like to pay?(Credit/Debit/Wallets/COD)");
        String mode=sc.nextLine();
        if(mode.equalsIgnoreCase("credit"))
        {
            payments=new CreditCard();
        }
        else if(mode.equalsIgnoreCase("debit"))
        {
            payments=new DebitCard();
        }
        else if(mode.equalsIgnoreCase("wallets"))
        {
            payments=new Wallets();
        }
        else if(mode.equalsIgnoreCase("cod"))
        {
            payments=new COD();
        }
        nowTestIt(payments);
    }
    public static void nowTestIt(Payments sample)
    {
        sample.displayPaymentMethod();
    }
}
