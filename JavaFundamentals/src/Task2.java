public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 55, 474};
        System.out.print("\tNormal array: ");
        for (int a : array){
            System.out.print("\t"+a);}
        System.out.print("\n\tOpposite direction: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("\t"+array[i]);
        }
    }

}

