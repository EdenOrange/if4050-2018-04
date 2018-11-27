package com.ecommerce.PembelianProduk;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MakeOrder implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		int orderId = Integer.parseInt(execution.getBusinessKey());
		
		int buyerId = (int) execution.getVariable("buyerId");
		int sellerId = (int) execution.getVariable("sellerId");
		
		int itemId = (int) execution.getVariable("itemId");
		int itemQuantity = (int) execution.getVariable("itemQuantity");
		double itemPrice = (double) execution.getVariable("itemPrice");
		
		int paymentMethodId = (int) execution.getVariable("paymentMethodId");
		int paymentRecipientId = (int) execution.getVariable("paymentRecipientId");
		double paymentTotal = (double) execution.getVariable("paymentTotal");
		
		int shipmentMethodId = (int) execution.getVariable("shipmentMethodId");
		String shipmentAddress = (String) execution.getVariable("shipmentAddress");
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("ReceiveOrder")
		.setVariable("orderId", orderId)
		.setVariable("buyerId", buyerId)
		.setVariable("sellerId", sellerId)
		.setVariable("itemId", itemId)
		.setVariable("itemQuantity", itemQuantity)
		.setVariable("itemPrice", itemPrice)
		.setVariable("paymentMethodId", paymentMethodId)
		.setVariable("paymentRecipientId", paymentRecipientId)
		.setVariable("paymentTotal", paymentTotal)
		.setVariable("shipmentMethodId", shipmentMethodId)
		.setVariable("shipmentAddress", shipmentAddress)
		.processInstanceBusinessKey(execution.getBusinessKey())
		.correlate();
	}

}
