package com.ecommerce.RefundProduk;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RefundPaymentToBuyer implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// Ask payment service to return money to buyer
	}

}
