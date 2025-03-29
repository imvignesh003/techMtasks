import java.util.*;

public class ProductInventory {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> productList=new ArrayList<>();
		productList.add("Television");
        productList.add("Mixer Grinder");
		productList.add("IronBox");
		productList.add("Washing Machine");
		productList.add("DVD Player");
		productList.add("Playstation");
		productList.add("Coffee Mixer");
		productList.add("Microwave Oven");
		productList.add("Refrigerator");
        productList.add("DVD Player");
		productList.add("Mixer Grinder");
		productList.add("Laptop");
        productList.add("Refrigerator");
		productList.add("Desktop");
		System.out.println("THE ORIGINAL LIST IS "+productList);
		HashSet<String> duplicateunorderedset =new HashSet<>(productList);
		System.out.println("DUPLICATES REMOVED UNORDERED SET IS "+duplicateunorderedset);
		LinkedHashSet<String> duplicateorderedset = new LinkedHashSet<>(productList);
		System.out.println("DUPLICATES REMOVED ORDERED SET IS "+duplicateorderedset);
		System.out.print("Enter the product to be added : ");
		String name=sc.next();
        productList.add(name);
		System.out.println("THE MODIFIED LIST IS "+productList);
		System.out.print("Enter the fruit to be removed from the available fruits : ");
		String name1=sc.next();
		if(productList.contains(name1)) {
			productList.remove(name1);
			System.out.println("THE MODIFIED LIST IS "+productList);
		} else {
			System.out.println("Enter the fruits that is available");
		}
		System.out.print("Total available Fruits are "+duplicateorderedset.size());
        sc.close();
	}
}