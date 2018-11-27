package com.ecommerce.PenangananPesanan;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckOrderStatus implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		int orderId = (int) execution.getVariable("orderId");
		
		// Check order status from logistic service
	}

}
