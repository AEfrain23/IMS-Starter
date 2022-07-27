package com.qa.ims.persistence.domain;

public class Order {


	private Long orderId;
	private Long customerId;
//	private Double orderTotal;
	
	// Constructor
	
	public Order(Long customerId) {
		this.setCustomerId(customerId);
	}
	
	public Order(Long orderId, Long customerId) {
		this.setOrderId(orderId);
		this.setCustomerId(customerId);
	}
	
	
	// Getters and Setters
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	@Override
	public String toString() {
		return "order id:" + orderId + "customer id:" + customerId;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		return true;
	}

}
