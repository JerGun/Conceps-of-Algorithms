import java.util.Scanner;

public class Workshop {

	public static void main(String[] args) {
		double beforeVat = 0;
		double discount = 0;
		double vat, total;
		Integer menu, amount, memberId, price;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Southwest Grilled Chicken 479 Baht");
		System.out.println("2. Hibachi Chicken 385 Baht");
		System.out.println("3. Spicy Grilled Chicken 369 Baht");
		System.out.println("4. Chinese Noodle Salad 189 Baht");
		System.out.println("5. Teriyaki Chopped Steak 219 Baht");
		System.out.println("6. Coca Cola Light 29 Baht");
		System.out.println("0. End");
		
		while(true) {
			System.out.print("Enter menu (1 - 6 or 0) : ");
			menu = scanner.nextInt();
			System.out.print("Enter amount : ");
			amount = scanner.nextInt();
			if(menu == 1) {
				price = 479 * amount;
				beforeVat = beforeVat + price;
			} else if(menu == 2) {
				price = 385 * amount;
				beforeVat = beforeVat + price;
			} else if(menu == 3) {
				price = 369 * amount;
				beforeVat = beforeVat + price;
			} else if(menu == 4) {
				price = 189 * amount;
				beforeVat = beforeVat + price;
			} else if(menu == 5) {
				price = 219 * amount;
				beforeVat = beforeVat + price;
			} else if(menu == 6) {
				price = 29 * amount;
				beforeVat = beforeVat + price;
			} else if(menu == 0) {
				break;
			}
		}
		scanner.close();
		System.out.print("Member ID (0 is not member) : ");
		memberId = scanner.nextInt();
		vat = beforeVat * 7 / 100;
		if(memberId != 0) {
			discount = (beforeVat + vat) * 3 / 100;
		}
		total = beforeVat + vat - discount;
		System.out.println("Before VAT : " + String.format("%.2f", beforeVat));
		System.out.println("VAT 7% : " + String.format("%.2f", vat));
		System.out.println("Discount : " + String.format("%.2f", discount));
		System.out.println("Total : " + String.format("%.2f", total));
	}

}
