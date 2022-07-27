package com.qa.ims.persistence.domain;

public class Item {

	private Long itemId;
	private String itemName;
	private Double itemCost;
	
	
	public Item(Long itemId, String itemName, double itemCost) {
		this.setItemId(itemId);
		this.setItemName(itemName);
		this.setItemCost(itemCost);
	}
		
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	@Override
	public String toString() {
		return "item id:" + itemId + " item name:" + itemName + " item cost:" + itemCost;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((itemCost == null) ? 0 : itemCost.hashCode());
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
		Item other = (Item) obj;
		if (getItemName() == null) {
			if (other.getItemName() != null)
				return false;
		} else if (!getItemName().equals(other.getItemName()))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemCost == null) {
			if (other.itemCost != null)
				return false;
		} else if (!itemCost.equals(other.itemCost))
			return false;
		return true;
	}


}
