package com.prsolutions.freshveggiescatalog.model;

public class Vegetable {

	private int vegetableId;
	private String vegetableName;
	private String vegetableDescription;
	
	public Vegetable() {
		super();
	}

	public Vegetable(int vegetableId, String vegetableName, String vegetableDescription) {
		super();
		this.vegetableId = vegetableId;
		this.vegetableName = vegetableName;
		this.vegetableDescription = vegetableDescription;
	}
	
	public int getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
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

	@Override
	public String toString() {
		return "Vegetable [vegetableId=" + vegetableId + ", vegetableName=" + vegetableName + ", vegetableDescription="
				+ vegetableDescription + "]";
	}
}
