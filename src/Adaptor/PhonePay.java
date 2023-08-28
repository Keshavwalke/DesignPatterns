package Adaptor;

public class PhonePay {
    private BankAPI bankAPI;

    public PhonePay(BankAPI bankAPI){
        this.bankAPI=bankAPI;
    }

    public PhonePay(){}

    double doSomething(){
        double currentBalance= bankAPI.getBalance("AccountNumber");
        return currentBalance*2;
    }

    void showBalance(){

    }
}
