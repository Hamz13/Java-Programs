public class Numberspractice {
    public static void main(String[] args) {
        String itemName = "Widget"; // Example item name
double itemPrice=10.0; //Example item price
int quantity = 10;           // Example quantity

double totalExpenses = itemPrice * quantity;

if (totalExpenses > 100) {
    // Apply a 10% discount for total expenses >= $100
    totalExpenses *= 0.9;
}

System.out.println("Receipt:");
 System.out.println("Item: " + itemName);
System.out.println("Price per item: $" + itemPrice);
System.out.println("Quantity: " + quantity);
System.out.println("Total expenses: $" + totalExpenses);
}








    }

