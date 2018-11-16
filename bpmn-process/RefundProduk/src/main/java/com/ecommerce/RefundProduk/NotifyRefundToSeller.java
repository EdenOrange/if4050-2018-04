package com.ecommerce.RefundProduk;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class NotifyRefundToSeller implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// Notify product refunded to seller
	}

}
