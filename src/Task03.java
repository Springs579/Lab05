import java.util.Scanner;
public class Task03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your party affiliation D, R, I: ");
        char party = scanner.next().charAt(0);
        if (party == 'D'){
            System.out.print("You get a Democratic Donkey");
        }
        else if (party == 'R'){
            System.out.print("You get a Republican Elephant");
        }
        else if (party == 'I'){
            System.out.print("You get a Independent Person");
        }
        else{
            System.out.print("You get a Other Ostrich");
        }
    }
}
