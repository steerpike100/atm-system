package nicebank;

    public class AutomatedTeller {
        private CashSlot cashSlot;

        public AutomatedTeller(CashSlot cashSlot) {
            this.cashSlot = cashSlot;
        }

        public void withdrawFrom(Account account, int dollars) {
            account.debit(dollars);
            cashSlot.dispense(dollars);
        }
    }
