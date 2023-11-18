import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        addItemToShop(shop);
        shop.printShopItems();
    }

    public static void addItemToShop(Shop shop) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter item type (R - regular, M - medicine, A - alcohol, V - vine) " +
                    "(to exit press enter):");
            String itemType = scan.nextLine();

            if (itemType.isEmpty()) {
                break;
            }

            if (itemType.equalsIgnoreCase("r") || itemType.equalsIgnoreCase("m")) {
                System.out.println("Enter item name:");
                String itemName = scan.nextLine();
                System.out.println("Enter item price before taxes:");
                double priceBeforeTax = Double.parseDouble(scan.nextLine());

                if (itemType.equalsIgnoreCase("r")) {
                    shop.addItem(new RegularItem(itemName, priceBeforeTax));
                } else {
                    shop.addItem(new Medicine(itemName, priceBeforeTax));
                }
            }

            if (itemType.equalsIgnoreCase("a") || itemType.equalsIgnoreCase("v")) {
                System.out.println("Enter item name:");
                String itemName = scan.nextLine();
                System.out.println("Enter item price before taxes:");
                double priceBeforeTax = Double.parseDouble(scan.nextLine());
                System.out.println("Enter alcohol volume:");
                double alcoholVolume = Double.parseDouble(scan.nextLine());
                System.out.println("Enter packageSize:");
                double packageSize = Double.parseDouble(scan.nextLine());


                if (itemType.equalsIgnoreCase("a")) {
                    shop.addItem(new Alcohol(itemName, priceBeforeTax, alcoholVolume, packageSize));
                } else {
                    shop.addItem(new Vine(itemName, priceBeforeTax, alcoholVolume, packageSize));
                }
            }
        }
    }
}
