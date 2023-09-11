package com.app.rule.impliments;

import com.app.RtoRule;
import com.app.TaxpayerRule;

public class Citizen implements RtoRule, TaxpayerRule {

	@Override
	public void payRoadtax() {
		System.out.println("invoking payroadtax");

	}

	@Override
	public int taxPayable() {
		

		System.out.println("invoking main in taxPayablerule");

		return 0;
	}
	public void payCess() {
		System.out.println("invoking paycess in Citizen");
		RtoRule.super.payCess();
	}

}
