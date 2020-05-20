
public class Laptop extends Computer {
	private String colour;
	private float screenSize;
	private int batteryCapacictymAh;
	
	public Laptop(String manufacturer, String model, int price,
				  float CPUSpeed,
				  int RAMMemory) {
		super(manufacturer, model, price, CPUSpeed, RAMMemory);
	}
	
	public Laptop withColour(String colour) {
		this.colour = colour;
		return this;
	}

	public Laptop withScreenSize(float screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Laptop withBatteryCapacity(int batteryCapacity) {
		this.batteryCapacictymAh = batteryCapacity;
		return this;
	}

	@Override
	public String toString() {
		return "Laptop [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", CPUSpeed="
				+ CPUSpeed + ", RAMMemory=" + RAMMemory + ", colour=" + colour + ", screenSize=" + screenSize
				+ ", batteryCapacictymAh=" + batteryCapacictymAh + "] \n";
	}

	

	
	
	

}
