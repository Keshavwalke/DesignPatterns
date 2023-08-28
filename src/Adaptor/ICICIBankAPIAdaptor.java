package Adaptor;

import Adaptor.thirdPartyAPI.ICICIBankAPI;

public class ICICIBankAPIAdaptor implements BankAPI{
    private ICICIBankAPI iciciBankAPI=new ICICIBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
