import java.util.Scanner;
public class maindomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ("! Now tell me your age: "));
        int age = scanner.nextInt();
        if  (age < 18) {
            System.out.println("You are too young");

        if (age >= 18) {
            System.out.println("You are too old");
        }    
        }
    }
}
