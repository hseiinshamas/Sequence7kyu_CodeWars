import java.util.Arrays;
public class Main {

    public static int[] sumOfN(int n) {
        int[] arr = new int[Math.abs(n + 1)];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + (n > 0 ? i : -i);
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(3)));
    }

}

