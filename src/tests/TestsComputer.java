package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import computer_store.Computer;
import computer_store.Desktop;
import computer_store.Laptop;
import computer_store.Tablet;

public class TestsComputer {
    private static Computer lenovo;
    private static Computer asus;
    private static Computer acer;
	
	@Before
	public void setUp() {
		asus = new Laptop("Asus", "K50IJ", 1000, 3.4f, 8)
				.withColour("Black")
				.withScreenSize(15.4f)
				.withBatteryCapacity(4200);
		acer = new Desktop( "Acer", "Nitro N50-600",  3000, 4, 16)
				.withVideoRAMMemory(4)
				.withPowerSupplyWatts(500);
		lenovo = new Tablet("Lenovo", "Tab E8", 215, 1.3f, 1)
				.withMemoryCardSlot(true)
				.withOperatingSystem("Andorid");
	}

	@Test
	public void testNotEqualsComputers() {
		assertNotEquals(lenovo, acer);
	}
	
	@Test
	public void testEqualsComputers() {
		Computer lenovoCopy = new Tablet("Lenovo", "Tab E8", 215, 1.3f, 1);
		assertEquals(lenovo, lenovoCopy);
	}
	
	@Test
	public void testToStringTabletEquals() {
		String lenovoPrinted = lenovo.toString();
		String answer = "Tablet [manufacturer=" + "Lenovo" + ", model=" + "Tab E8" + 
						", price=" + 215 + ", CPUSpeed=" + 1.3f + 
						", RAMMemory=" + 1 + ", operatingSystem=" + "Andorid" + 
						", storageInGb=" + 0 + ", hasMemoryCardSlot=" +
						true + "] \n";
		
		assertEquals(lenovoPrinted, answer );
	}
	
	@Test
	public void testToStringTabletNotEquals() {
		String lenovoPrinted = lenovo.toString();
		String answer = "Tablet [manufacturer=" + "Samsung" + ", model=" + "SM-T295" + 
						", price=" + 215 + ", CPUSpeed=" + 1.3f + 
						", RAMMemory=" + 1 + ", operatingSystem=" + "Andorid" + 
						", storageInGb=" + 0 + ", hasMemoryCardSlot=" +
						true + "] \n";
		
		assertNotEquals(lenovoPrinted, answer );
	}
	
	@Test
	public void testToStringLaptopEquals() {
		String asusPrinted = asus.toString();
		String answer = "Laptop [manufacturer=" + "Asus" + ", model=" + "K50IJ" + 
						", price=" + 1000 + ", CPUSpeed=" + 3.4f + 
						", RAMMemory=" + 8 + ", colour=" + "Black" + ", screenSize=" + 15.4f
						+ ", batteryCapacictymAh=" + 4200 + "] \n";
		
		assertEquals(asusPrinted, answer );
	}
	
	@Test
	public void testToStringLaptopNotEquals() {
		String asusPrinted = asus.toString();
		String answer = "Laptop [manufacturer=" + "Lenovo" + ", model=" + "Legion Y520" + 
						", price=" + 1500 + ", CPUSpeed=" + 3.4f + 
						", RAMMemory=" + 8 + ", colour=" + "Red" + ", screenSize=" + 17.4f
						+ ", batteryCapacictymAh=" + 4200 + "] \n";
		
		assertNotEquals(asusPrinted, answer );
	}
	
	@Test
	public void testToStringDesktopEquals() {
		String acerPrinted = acer.toString();
		String answer = "Desktop [manufacturer=" + "Acer" + ", model=" + "Nitro N50-600" +
				", price=" + 3000 + ", CPUSpeed=" + 4f + ", RAMMemory=" + 16 + 
				", powerSupplyWatts=" + 500 + ", videoRAMMemory=" + 4 + "] \n";
		assertEquals(acerPrinted, answer );
	}
	
	@Test
	public void testToStringDesktopNotEquals() {
		String acerPrinted = acer.toString();
		String answer = "Laptop [manufacturer=" + "Acer" + ", model=" + "Nitro N50-600" +
				", price=" + 3000 + ", CPUSpeed=" + 4.0 + ", RAMMemory=" + 16 + 
				", powerSupplyWatts=" + 500 + ", videoRAMMemory=" + 4 + "] \n";
		assertNotEquals(acerPrinted, answer );
	}




}
