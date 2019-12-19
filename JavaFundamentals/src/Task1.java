import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("\nIntroduce yourself: ");
        Scanner scan = new Scanner (System.in);
        String yourName = scan.nextLine();
        System.out.printf("Greetings " + yourName);
    }
}
