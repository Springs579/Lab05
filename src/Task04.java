import java.util.Scanner;
public class Task04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your age: ");
        int age = scanner.nextInt();
        if (age >= 21){
            System.out.print("You get a paper wrist band!");
        }
        else {
            System.out.print("");
        }
    }
}
