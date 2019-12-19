import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input numbers of elements: ");

        int numberOfElements = scan.nextInt();
        int[] array = new int[numberOfElements];

        System.out.print("Input elements: ");
        for (int i=0; i<numberOfElements; i++){
            array[i] = scan.nextInt();
        }
        scan.close();

        int sumOfElements = 0;
        int multiplicationOfElements =1;
        for (int i=0; i<numberOfElements; i++){
            sumOfElements = sumOfElements + array[i];
            multiplicationOfElements = multiplicationOfElements*array[i];
        }
        System.out.println("Sum of array elements: "+sumOfElements);
        System.out.print("Multiplication of array elements: "+multiplicationOfElements);
    }
}
