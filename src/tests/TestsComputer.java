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
    private static Computer corsair;
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
		corsair = new Desktop( "Corsair", "APCOGMR93900XN2080S",  3000, 4.6f, 32)
				.withVideoRAMMemory(8)
				.withPowerSupplyWatts(750);
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


}
