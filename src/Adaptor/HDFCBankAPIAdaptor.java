package Adaptor;

import Adaptor.thirdPartyAPI.HDFCBankAPI;

public class HDFCBankAPIAdaptor implements BankAPI {
    private HDFCBankAPI hdfcBankAPI=new HDFCBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
