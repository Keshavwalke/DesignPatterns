package Adaptor;

public class Client {
    public static void main(String[] args) {
        PhonePay pp=new PhonePay(new ICICIBankAPIAdaptor());
        pp.doSomething();
    }
}
