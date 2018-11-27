package com.ecommerce.PembelianProduk;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GetPaymentStatus implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// Get payment status from payment gateway
	}

}
