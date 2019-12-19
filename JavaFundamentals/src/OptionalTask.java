import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of elements: ");

        int lengthOfArray = scan.nextInt();
        int[] arrayOfElements = new int[lengthOfArray];
        int[] arrayOfLengthOfElements = new int[lengthOfArray];

        System.out.print("Input elements: ");
        for (int i = 0; i < lengthOfArray; i++) {
            arrayOfElements[i] = scan.nextInt();
            arrayOfLengthOfElements[i] = (arrayOfElements[i] + "").length();
        }
        scan.close();

        getSmallestAndBiggestNumbers(arrayOfElements, lengthOfArray);
        getNumbersInAscendingOrderOfTheyLength(arrayOfElements, arrayOfLengthOfElements, lengthOfArray);
        getNumbersWithLengthBelowAverage(arrayOfElements, arrayOfLengthOfElements, lengthOfArray);
    }

    private static void getSmallestAndBiggestNumbers(int[] arrayOfElements, int lengthOfArray) {
        System.out.print("\nСамое большое число: ");
        int smallestOrBiggerNumber = arrayOfElements[0];
        for (int i = 0; i < lengthOfArray; i++) {
            if (arrayOfElements[i] > smallestOrBiggerNumber) {
                smallestOrBiggerNumber = arrayOfElements[i];
            }
        }
        System.out.println(smallestOrBiggerNumber);
        System.out.println("Количество цифр в большем числе = " + String.valueOf(smallestOrBiggerNumber).length());

        System.out.print("\nСамое маленькое число: ");
        smallestOrBiggerNumber = arrayOfElements[0];
        for (int i = 0; i < lengthOfArray; i++) {
            if (arrayOfElements[i] < smallestOrBiggerNumber) {
                smallestOrBiggerNumber = arrayOfElements[i];
            }
        }
        System.out.println(smallestOrBiggerNumber);
        System.out.println("Количество цифр в малом числе = " + String.valueOf(smallestOrBiggerNumber).length());
    }

    private static void getNumbersInAscendingOrderOfTheyLength(int[] arrayOfElements, int[] arrayOfLengthOfElements, int lengthOfArray) {
        System.out.println("\nЧисла в порядке возрастания их длины: ");
        for (int i = lengthOfArray - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayOfLengthOfElements[j] < arrayOfLengthOfElements[j + 1]) {
                    int tempValueForElementInArray = arrayOfElements[j];
                    arrayOfElements[j] = arrayOfElements[j + 1];
                    arrayOfElements[j + 1] = tempValueForElementInArray;
                    int tempValueForLengthOfElementInArray = arrayOfLengthOfElements[j];
                    arrayOfLengthOfElements[j] = arrayOfLengthOfElements[j + 1];
                    arrayOfLengthOfElements[j + 1] = tempValueForLengthOfElementInArray;
                }
            }
        }
        for (int i = lengthOfArray - 1; i >= 0; i--) {
            System.out.println(arrayOfElements[i]);
        }
    }

    private static void getNumbersWithLengthBelowAverage(int[] arrayOfElements, int[] arrayOfLengthOfElements, int lengthOfArray) {
        int sumOfLengthOfElemets = 0;
        int checkingForSameLength = 0;
        float averageLengthOfElement;
        for (int i = 0; i < lengthOfArray; i++) {
            sumOfLengthOfElemets = sumOfLengthOfElemets + arrayOfLengthOfElements[i];
        }
        averageLengthOfElement = sumOfLengthOfElemets / lengthOfArray;

        System.out.print("\nЧисла, длина которых меньше средней: ");

        for (int i = 0; i < lengthOfArray; i++) {
            if (averageLengthOfElement > arrayOfLengthOfElements[i]) {
                System.out.print("\n"+arrayOfElements[i] + " с количеством цифр равным " + arrayOfLengthOfElements[i]);
            }
            else {
                checkingForSameLength = checkingForSameLength + 1;
            }
            if (checkingForSameLength==lengthOfArray) {
                System.out.println("Отсутствуют, все числа одной длинны");
            }
        }
    }
}
