import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] randomArr = getArray(10);
        System.out.println(Arrays.toString(randomArr));
        int[] sortedArr = Arrays.copyOf(randomArr, randomArr.length);
        Arrays.sort(sortedArr);
        System.out.println(Arrays.toString(sortedArr));
        int[] reversedArr = new int[sortedArr.length];
        for (int i = 0 ; i < reversedArr.length; i++ ){
            reversedArr[i] = sortedArr[reversedArr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArr));

    }


    public static int[] getArray(int length){
        Random random = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(-100, 100);
        }
        return arr;
    }
}