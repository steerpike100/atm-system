package nicebank;

import cucumber.api.java.en.When;
import support.KnowsTheDomain;

public class TellerSteps {

    KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper){
        this.helper = helper;
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars)  {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);

    }
}
