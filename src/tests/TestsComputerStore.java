package tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import computer_store.Computer;
import computer_store.ComputerStore;
import computer_store.Desktop;
import computer_store.Laptop;
import computer_store.Tablet;

public class TestsComputerStore {
	
	private static ComputerStore cs = new ComputerStore("Ardes");
	
	@Before
	public void setUp() {
		Computer asus = new Laptop("Asus", "K50IJ", 1000, 3.4f, 8)
				.withColour("Black")
				.withScreenSize(15.4f)
				.withBatteryCapacity(4200);
		Computer acer = new Desktop( "Acer", "Nitro N50-600",  3000, 4, 16)
				.withVideoRAMMemory(4)
				.withPowerSupplyWatts(500);
		Computer lenovo = new Tablet("Lenovo", "Tab E8", 215, 1.3f, 1)
				.withMemoryCardSlot(true)
				.withOperatingSystem("Andorid");
		
		cs.addCîmputer(asus);
		cs.addCîmputer(acer);
		cs.addCîmputer(lenovo);
	}

	@Test
	public void testSortByPriceAscending() {
		Set<Computer> result = cs.sortByPriceAscending();
		String ascendingPricesString = "";
		
		for (Computer c : result) {
			String priceInString = Integer.toString(c.getPrice());
			ascendingPricesString+=priceInString;
		}
		
		assertEquals("21510003000", ascendingPricesString);
	}
	
	@Test
	public void testSortByPriceDescending() {
		Set<Computer> result = cs.sortByPriceDescending();
		String descendingPricesString = "";
		
		for (Computer c : result) {
			String priceInString = Integer.toString(c.getPrice());
			descendingPricesString+=priceInString;
		}
		
		assertEquals("30001000215", descendingPricesString);
	}
	
	@Test
	public void testSellComputerIncreaseBalance() {
		Computer asusCopy = new Laptop("Asus", "K50IJ", 1000, 3.4f, 8)
				.withColour("Black")
				.withScreenSize(15.4f);
		
		cs.sellComputer(asusCopy);
		assertEquals(cs.getBankBalance(), 1000);
	}
	
	@Test
	public void testSellComputer() {
		Computer asusCopy = new Laptop("Asus", "K50IJ", 1000, 3.4f, 8)
				.withColour("Black")
				.withScreenSize(15.4f);
		
		cs.sellComputer(asusCopy);
		assertEquals(cs.getComputers().size(), 2);
	}
	
	@After
	public void tearDownAfterClass() {
		cs.setBankBalance(0);
	}

}
