package com.ecommerce.PenangananPesanan;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendPaymentToSeller implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// Ask payment service to send payment to seller
	}

}
