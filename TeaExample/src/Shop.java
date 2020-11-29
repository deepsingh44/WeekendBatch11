import java.util.Scanner;

public class Shop {
	private Milk milk;
	private Tea tea;
	private Coffee coffee;

	public Shop(Milk milk, Tea tea, Coffee coffee) {
		this.milk = milk;
		this.tea = tea;
		this.coffee = coffee;
	}

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public Tea getTea() {
		return tea;
	}

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public static void main(String[] args) {

		Milk milk = new Milk();
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		Shop shop = new Shop(milk, tea, coffee);

		ShopService shopService = new ShopService(shop);

		Scanner scanner = new Scanner(System.in);
		String callback = "";
		do {
			System.out.println("Menu Here....");
			System.out.println("press 1 for Tea");
			System.out.println("press 2 for Coffee");

			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				shopService.makeTea();
				break;
			case 2:
				shopService.makeCoffee();
				break;
			default:
				System.out.println("Sorry this is not available");
			}
			System.out.println("Do you want anything else? (y/n)");
			callback = scanner.next();
		} while (callback.equalsIgnoreCase("y"));
		System.out.println("Thanks for using our Services.");
	}
}
