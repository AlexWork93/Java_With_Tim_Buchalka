import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        String[] stringArray = Arrays.copyOf(sc.nextLine().split(" "), size);
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public static int[] sortIntegers(int[] arr){
        Arrays.sort(arr);
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Element %s contents %s%n", i, arr[i]);
        }
    }
}
