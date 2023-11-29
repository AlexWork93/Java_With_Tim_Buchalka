import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMin(readIntegers()));
    }

    public static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        String[] string = sc.nextLine().split(",");
        int[] intArr = new int[string.length];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(string[i]);
        }
        return intArr;
    }

    public static int findMin(int[] intArr){
        Arrays.sort(intArr);
        return intArr[0];
    }
}