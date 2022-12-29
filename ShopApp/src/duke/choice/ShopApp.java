package duke.choice;

import java.util.Arrays;
/*import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;*/
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class ShopApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double tax = 0.2;
//		double total = 0.0;
		System.out.println("Welcome to Duke Choice Shop");
		Customer c1 = new Customer("Pinky", 14);
		// c1.setName("Pinky");
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
		Clothing[] items = { item1, item2, new Clothing("Green Scarf", 5.0, "S"),
				new Clothing("Blue T-Shirt", 10.5, "S") };
		/*
		 * item1.setDescription("Blue Jacket"); item1.setPrice(20.9);
		 * item1.setSize("M"); item2.setDescription("Orange T-Shirt");
		 * item2.setPrice(10.5); item2.setSize("S");
		 * items[2].setDescription("Green Scarf"); items[2].setPrice(5.0);
		 * items[2].setSize("S"); items[3].setDescription("Blue T-Shirt");
		 * items[3].setPrice(10.5); items[3].setSize("S");
		 */
		// total = (item1.price + 2*item2.price)*(1+tax);
		// System.out.println(item1.description+", "+item1.price+", "+item1.size);
		// System.out.println(item2.description+", "+item2.price+", "+item2.size);
		// int measurement = 3;
		// c1.setSize(measurement);
		System.out.println("Minimum Price is " + Clothing.MIN_PRICE);
		c1.addItems(items);
		System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());
		// System.out.println("Customer is wearing size "+c1.size);
		// System.out.println(items[0].size+" "+items[1].size);
		// for (Clothing item : c1.getItems()) {
		// System.out.println(item.getDescription()+", "+item.getSize()+",
		// "+item.getPrice());
		// System.out.println("Item " + item);
		// }
		// try {} catch {};
		int average = 0;
		int count = 0;
		for (Clothing item : c1.getItems()) {
			if (item.getSize().equals("S")) {
				count++;
				average += item.getPrice();
			}
		}
		try {
			average = (count == 0) ? 0 : average / count;
			// average = average / count;
			System.out.println("Average price " + average + ", Count " + count);
		} catch (ArithmeticException e) {
			System.out.println("Don't divide by 0");
		}
		Arrays.sort(c1.getItems());
		for (Clothing item : c1.getItems()) {
			// System.out.println(item.getDescription()+", "+item.getSize()+",
			// "+item.getPrice());
			System.out.println("Item " + item);
		}
		/*try {
			itemList list = new itemList(items);
			Routing routing = Routing.builder().get("/items", list).build();
			ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost())
					.port(8889).build();
			WebServer ws = WebServer.create(config, routing);
			ws.start();
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		}*/
	}
}