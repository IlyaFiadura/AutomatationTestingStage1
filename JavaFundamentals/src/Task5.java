import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] array = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        Scanner in = new Scanner(System.in);
        System.out.print("\nInput number of the month: ");
        int numberOfTheMonth = in.nextInt();

        int i = numberOfTheMonth - 1;
        if (numberOfTheMonth >0 && numberOfTheMonth <13){
            System.out.print(array[i]);}
        else {
            System.out.print("There is no such a month with number: "+ numberOfTheMonth);
        }
    }
}