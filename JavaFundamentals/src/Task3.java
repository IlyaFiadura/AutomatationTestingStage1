import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input numbers of elements: ");
        int kolvo = scan.nextInt();
        int[] array = new int[kolvo];

        Random rnd = new Random();
        System.out.print("Numbers in line: ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=rnd.nextInt();
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nNumbers in column: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
