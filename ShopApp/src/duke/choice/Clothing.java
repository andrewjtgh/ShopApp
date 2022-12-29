package duke.choice;

public class Clothing implements Comparable<Clothing> {
	private String description, size;
	private Double price;
	public final static double MIN_PRICE = 10.0;
	public final static double TAX_RATE = .2;

	public Clothing(String description, Double price, String aSize) {
		this.description = description;
		this.price = price;
		size = aSize;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getPrice() {
		return price + price * TAX_RATE;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getDescription() + ", " + getSize() + ", " + getPrice();
	}

	@Override
	public int compareTo(Clothing c) {
		return this.description.compareTo(c.description);
	}
}
