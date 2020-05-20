
public abstract class Computer {
	protected String manufacturer;
	protected String model;
	protected int price;
	protected float CPUSpeed;
	protected int RAMMemory;

	public Computer(String manufacturer, String model,
					int price, float CPUSpeed,
					int RAMMemory) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.CPUSpeed = CPUSpeed;
		this.RAMMemory = RAMMemory;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Float.floatToIntBits(price);
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
		Computer other = (Computer) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", CPUSpeed="
				+ CPUSpeed + ", RAMMemory=" + RAMMemory + "]";
	}
	
	


}
