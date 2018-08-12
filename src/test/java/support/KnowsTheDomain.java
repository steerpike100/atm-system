package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.AutomatedTeller;
import nicebank.Teller;

public class KnowsTheDomain {
    private Account myAccount;
    private CashSlot cashSlot;
    private AutomatedTeller automatedTeller;
    private Teller teller;

    public Account getMyAccount() {
        if (myAccount == null) {
            myAccount = new Account();
        }
        return myAccount;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public AutomatedTeller getAutomatedTeller() {
        if (automatedTeller == null) {
            automatedTeller = new AutomatedTeller(getCashSlot());
        }
        return automatedTeller;
    }

    public Teller getTeller(){
        if(teller == null){
            teller = new AtmUserInterface();
        }
        return teller;
    }
}