import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 1; i < 5; i++) {

            arr[i] = arr[i-1];
        }

        System.out.println(Arrays.toString(arr));
    }
}