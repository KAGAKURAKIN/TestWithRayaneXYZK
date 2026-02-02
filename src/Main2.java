import java.util.Scanner;

void main() throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    int quantity;

    while(true){
        System.out.println("Choose an item (pizza or bread)");
        String choice = sc.nextLine();

        double price;
        String itemname;

        if (choice.equalsIgnoreCase("pizza")){
            price = 15.99;
            itemname = "pizza";

        } else if (choice.equalsIgnoreCase("bread")){
            price = 5.99;
            itemname = "bread";
        } else  {
            System.out.println("Invalid choice");
            continue;
        }


        System.out.println(itemname + " Costs $" + price);
        System.out.println("How much do you want?");

        if (sc.hasNextInt()){
            quantity = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Invalid choice");
            sc.nextLine();
            continue;
        }
        double total = quantity * price;
        System.out.println("Total Costs $" + total + " Are you sure? (yes/no)");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Thank you for using our service, you bought $" + total + " Worth of " + itemname + ".");
            break;
        } else {
            System.out.println("Rechoose please.");
        }

    }
}
