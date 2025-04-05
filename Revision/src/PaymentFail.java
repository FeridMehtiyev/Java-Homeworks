public class PaymentFail extends Exception
{
    String logmessage;
    PaymentFail()
    {
        logmessage = "Payment failed!";
    }
}
