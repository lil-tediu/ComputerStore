package computer_store;

public class Demo {
	public static void main(String[] args) {
		Computer asus = new Laptop("Asus", "K50IJ", 1000, 3.4f, 8)
				.withColour("Black")
				.withScreenSize(15.4f)
				.withBatteryCapacity(4200);
		Computer acer = new Desktop( "Acer", "Nitro N50-600",  3000, 4, 16)
				.withVideoRAMMemory(4)
				.withPowerSupplyWatts(500);
		Computer corsair = new Desktop( "Corsair", "APCOGMR93900XN2080S",  3000, 4.6f, 32)
				.withVideoRAMMemory(8)
				.withPowerSupplyWatts(750);
		Computer lenovo = new Tablet("Lenovo", "Tab E8", 215, 1.3f, 1)
				.withMemoryCardSlot(true)
				.withOperatingSystem("Andorid");
		
		ComputerStore cs = new ComputerStore("Ardes");
		cs.addCîmputer(asus);
		cs.addCîmputer(acer);
		cs.addCîmputer(corsair);
		cs.addCîmputer(lenovo);
		
		System.out.println(cs.sortByPriceAscending());
		
		System.out.println(cs.sortByPriceDescending());
		
		cs.sellComputer(acer);
		cs.sellComputer(lenovo);
		cs.printAllComputers();
		
		System.out.println(cs.getBankBalance());
	}
}
