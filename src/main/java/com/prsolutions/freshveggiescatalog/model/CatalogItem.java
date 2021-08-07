package com.prsolutions.freshveggiescatalog.model;

public class CatalogItem {
	
	private String vegetableName;
	private String vegetableDescription;
	private int vegetablePrice;
	private String vegetableQuantity;
	private String vegetableShopName;
	private String vegetableShopContact;
	
	public CatalogItem(String vegetableName, String vegetableDescription, int vegetablePrice, String vegetableQuantity, String vegetableShopName, String vegetableShopContact) {
		super();
		this.vegetableName = vegetableName;
		this.vegetableDescription = vegetableDescription;
		this.vegetablePrice = vegetablePrice;
		this.vegetableShopName = vegetableShopName;
		this.vegetableShopContact = vegetableShopContact;
		this.vegetableQuantity = vegetableQuantity;
	}
	
	public String getVegetableName() {
		return vegetableName;
	}
	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}
	public String getVegetableDescription() {
		return vegetableDescription;
	}
	public void setVegetableDescription(String vegetableDescription) {
		this.vegetableDescription = vegetableDescription;
	}
	public int getVegetablePrice() {
		return vegetablePrice;
	}
	public void setVegetablePrice(int vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}
	public String getVegetableQuantity() {
		return vegetableQuantity;
	}
	public void setVegetableQuantity(String vegetableQuantity) {
		this.vegetableQuantity = vegetableQuantity;
	}

	public String getVegetableShopName() {
		return vegetableShopName;
	}
	public void setVegetableShopName(String vegetableShopName) {
		this.vegetableShopName = vegetableShopName;
	}
	public String getVegetableShopContact() {
		return vegetableShopContact;
	}
	public void setVegetableShopContact(String vegetableShopContact) {
		this.vegetableShopContact = vegetableShopContact;
	}

	@Override
	public String toString() {
		return "CatalogItem [vegetableName=" + vegetableName + ", vegetableDescription=" + vegetableDescription
				+ ", vegetablePrice=" + vegetablePrice + ", vegetableQuantity=" + vegetableQuantity
				+ ", vegetableShopName=" + vegetableShopName + ", vegetableShopContact=" + vegetableShopContact + "]";
	}
}
