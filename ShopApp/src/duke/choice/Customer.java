package duke.choice;

public class Customer {
	private String name, size;
	private Clothing[] items;

	public Customer(String name, int measurement) {
		this.name = name;
		setSize(measurement);
	}

	public void addItems(Clothing[] someItems) {
		items = someItems;
	}

	public Clothing[] getItems() {
		return items;
	}

	public double getTotalClothingCost() {
		double total = 0.0;
		for (Clothing item : items) {
			// if (c1.getSize() == item.getSize()) {
			total = total + item.getPrice();
			// System.out.println("Item "+item.getDescription()+", "+item.getPrice()+",
			// "+item.getSize());
			// total=total+total*tax;
			// if (total>15) {break;}
			// }
		}
		// System.out.println ("Total is "+total);
		return total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setSize(int size) {
		switch (size) {
		case 1:
		case 2:
		case 3:
			this.size = "S";
			break;
		case 4:
		case 5:
		case 6:
			this.size = "M";
			break;
		case 7:
		case 8:
		case 9:
			this.size = "L";
			break;
		default:
			this.size = "XL";
		}
	}
}
