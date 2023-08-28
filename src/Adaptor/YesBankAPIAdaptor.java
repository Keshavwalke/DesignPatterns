package Adaptor;

import Adaptor.thirdPartyAPI.YesBankAPI;

public class YesBankAPIAdaptor implements BankAPI{
    // Adaptor class -> or a Wrapper class that uses YesBank to do all the banking work
    private YesBankAPI yesBankAPI=new YesBankAPI();

    public double getBalance(String accountNumber){
        return yesBankAPI.checkBalance(accountNumber);
    }

    public boolean sendMoney(String fromAccount, String toAccount, double amount){
        return yesBankAPI.sendMoney(fromAccount,toAccount, amount);
    }

}
