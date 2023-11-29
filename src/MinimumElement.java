import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static int[] readElements(int amount){
        int[] intArr = new int[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amount; i++){
            intArr = Arrays.copyOf(intArr, intArr.length + 1);
            intArr[intArr.length - 1] = Integer.parseInt(scanner.nextLine());
        }

        return intArr;
    }

    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
