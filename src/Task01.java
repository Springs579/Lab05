import java.util.Scanner;
public class Task01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your price: ");
        double price = scanner.nextDouble();
        if (price >= 100){
            System.out.println("Your Total is: $" + price);
            System.out.print("Your shipping cost is: $0.00");
        }
        else {
            double shipping = price *.02;
            double total = shipping + price;
            System.out.println("Your Total is: $" + total);
;            System.out.print("Shipping cost: $" + shipping);
        }
    }
}
