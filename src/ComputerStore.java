import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComputerStore {
	private String name;
	private Set<Computer> computers;
	private int bankBalance;
	
	private Set<Computer> sortBy(Comparator<Computer> comparator) {
		Set<Computer> result = new TreeSet<>(comparator);
		for (Computer computer : this.computers) {
			result.add(computer);
		}
		return result;
	}
	
	
	
	public ComputerStore(String name) {
		this.name = name;
		this.computers = new HashSet<Computer>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public Set<Computer> getComputers() {
		Set<Computer> result = Collections.unmodifiableSet(computers);
		return result;
	}
	
	public void addCîmputer(Computer computer) {
		this.computers.add(computer);
	}
	
	public void sellComputer(Computer computer) {
		if (!this.computers.contains(computer)) {
			System.out.println("Sorry, this computer is not available");
		} else {
			this.bankBalance+=computer.price;
			this.computers.remove(computer);
		}
	}
	
	public Set<Computer> sortByPriceAscending(){
		Set<Computer> result = sortBy(new Comparator<Computer>() {
			@Override
			public int compare(Computer o1, Computer o2) {
				return o1.price >= o2.price? 1:-1;
			}
		});
		return result;
	}
	
	public Set<Computer> sortByPriceDescending(){
		Set<Computer> result = sortBy(new Comparator<Computer>() {
			@Override
			public int compare(Computer o1, Computer o2) {
				return o1.price <= o2.price? 1:-1;
			}
		});
		return result;
	}
	
	public int getBankBalance() {
		return this.bankBalance;
	}
	
	public void printAllComputers() {
		for (Computer computer : this.computers) {
			System.out.println(computer);
		}
	}
}
