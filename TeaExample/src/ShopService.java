
public class ShopService {
	private Shop shop;

	public ShopService(Shop shop) {
		this.shop = shop;
	}

	public void makeTea() {
		if (shop.getMilk() == null) {
			System.out.println("Sorry milk is not available");
		} else if (shop.getTea() == null) {
			System.out.println("Tea is not available");
		} else {
			System.out.println("Enjoy Tea.....");
		}
	}

	public void makeCoffee() {
		if (shop.getMilk() == null) {
			System.out.println("Sorry milk is not available");
		} else if (shop.getCoffee() == null) {
			System.out.println("Coffee is not available");
		} else {
			System.out.println("enjoy coffee....");
		}
	}

}
