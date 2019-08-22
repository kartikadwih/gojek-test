package id.tika.test.coba;

public class Car {
	
	private String numberPlate;
	private String color;
	private Integer slot;
	
	@Override
	public String toString() {
		return "Car [numberPlate=" + numberPlate + ", color=" + color + ", slot=" + slot + "]";
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	
	
	
}
