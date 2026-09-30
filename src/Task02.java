import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your birth month 1-12: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12){
            System.out.print("You entered a incorrect month value: " + month);
        }
        else{
            System.out.print("Your birth month is: " + month);
        }

    }
}
