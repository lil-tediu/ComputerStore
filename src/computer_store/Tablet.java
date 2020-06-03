package computer_store;

public class Tablet extends Computer {
	private String operatingSystem;
	private int storageInGb;
	private boolean hasMemoryCardSlot;
	
	public Tablet(String manufacturer, String model, int price, float CPUSpeed, int RAMMemory) {
		super(manufacturer, model, price, CPUSpeed, RAMMemory);
	}
	
	public Tablet withOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		return this;
	}
	
	public Tablet withStorage(int storageInGb) {
		this.storageInGb = storageInGb;
		return this;
	}
	
	public Tablet  withMemoryCardSlot(boolean hasMemoryCardSlot) {
		this.hasMemoryCardSlot = hasMemoryCardSlot;
		return this;
	}

	@Override
	public String toString() {
		return "Tablet [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", CPUSpeed="
				+ CPUSpeed + ", RAMMemory=" + RAMMemory + ", operatingSystem=" + operatingSystem + ", storageInGb="
				+ storageInGb + ", hasMemoryCardSlot=" + hasMemoryCardSlot + "] \n";
	}

	
	
}
