package computer_store;

public class Desktop extends Computer {	
	private int videoRAMMemory;
	private int powerSupplyWatts;
	
	public Desktop(String manufacturer, String model, int price, float CPUSpeed, int RAMMemory) {
		super(manufacturer, model, price, CPUSpeed, RAMMemory);
	}
	
	public Desktop withVideoRAMMemory(int videoRAMMemory) {
		this.videoRAMMemory = videoRAMMemory;
		return this;
	}
	
	public Desktop withPowerSupplyWatts(int powerSupplyWatts) {
		this.powerSupplyWatts = powerSupplyWatts;
		return this;
	}

	@Override
	public String toString() {
		return "Desktop [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", CPUSpeed="
				+ CPUSpeed + ", RAMMemory=" + RAMMemory + ", powerSupplyWatts=" + powerSupplyWatts + ", videoRAMMemory="
				+ videoRAMMemory + "] \n";
	}

	


	
	
}
