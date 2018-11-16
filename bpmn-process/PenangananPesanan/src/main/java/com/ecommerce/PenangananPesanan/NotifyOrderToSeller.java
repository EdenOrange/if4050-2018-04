package com.ecommerce.PenangananPesanan;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class NotifyOrderToSeller implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// Send notification to deliver order to seller
		// Seller then interacts with logistic service to deliver order
	}

}
