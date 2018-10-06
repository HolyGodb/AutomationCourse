import java.util.Scanner;

public class main {
    public static int SumOfNumbersInArray(Integer[] array) {
        int sumOfNumbersInArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                if (array[i] % 5 != 0) {
                    sumOfNumbersInArray += array[i];
                }
            }
        }
        return sumOfNumbersInArray;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Integer startOfRange = 0;
        Integer endOfRange = 0;

        //Wait until "endOfRange - startOfRange >= 10"
        while (endOfRange - startOfRange < 10) {
            System.out.println("Please, enter first value (start of range).");
            startOfRange = in.nextInt();
            System.out.println("Please, enter second value (end of range).");
            endOfRange = in.nextInt();
        }

        //Calculate array length (+1 because we include boundary values to our range)
        Integer[] array = new Integer[endOfRange - startOfRange + 1];

        //Fill array with numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = startOfRange + i;
            System.out.println(array[i]);
        }

        System.out.println("Sum of numbers that divided on 3 but does not divided on 5: " + SumOfNumbersInArray(array));
    }
}
