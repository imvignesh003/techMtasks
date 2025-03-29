import java.util.*;
public class UnitConversion {
	public void checkprice(Scanner sc,Map<String, Integer> productPrices) {
		System.out.println("Available Products : ");
		for (String product : productPrices.keySet()) {
            System.out.println("- " + product);
        }
		System.out.print("Enter product name: ");
		String productname=sc.next();
		if (productPrices.containsKey(productname)) {
            System.out.println("Price of " + productname + ": Rs" + productPrices.get(productname));
        } else {
            System.out.println("Product not found.");
        }		}

	public void CalculateSalesTotal(Scanner sc) {
		System.out.print("Enter the no of entry : ");
		int noofentry=sc.nextInt();
		int totalsales=0;
		if(noofentry<=0) {
			System.out.println("No Sales as of Now !!!");
		} else {
			for(int i=1;i<=noofentry;i++) {
				System.out.print("Enter the Price of Sales "+i+" : ");
				totalsales+=sc.nextInt();
			}
			System.out.println("Total Sales : "+totalsales);
		}
	}

	public void convertUnits(Scanner sc) {
		System.out.print("Enter the Weight in grams ");
		int unit=sc.nextInt();
		if(unit<0) {
			System.out.println("Enter the valid Weight");
		} else {
			System.out.println("Here "+unit+" g = "+(int)(unit/1000)+" kg");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("       MENU    ");
			System.out.println("1 . Check Price");
			System.out.println("2 . Calculate Sales Total");
			System.out.println("3 . Convert Units");
			System.out.println("4 . Exit");
			System.out.print("Enter your choice: ");
			int input=sc.nextInt();
			UnitConversion u1=new UnitConversion();
			Map<String, Integer> productPrices = new HashMap<>();
	        productPrices.put("Milk", 50);
	        productPrices.put("Bread", 80);
	        productPrices.put("Eggs", 12);
	        productPrices.put("Rice", 100);
			if(input == 1) {
				u1.checkprice(sc,productPrices);
			} else if(input == 2) {
				u1.CalculateSalesTotal(sc);
			} else if(input == 3) {
				u1.convertUnits(sc);
			} else if(input == 4) {
				System.out.println("!!! THANK YOU !!!");
				break;
			} else {
				System.out.println("Please enter the valid number !!!");
			}
		}
	}
}