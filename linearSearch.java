import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, -9, 0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -9) {
                System.out.println("9 found at index " + i);
                break;
            }
        }
        // slicing
        int[] newArr = new int[arr.length - 2];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == arr.length - 1) {
                continue;
            }
            newArr[count] = arr[i];
            count++;
        }
        Arrays.stream(arr)
            .filter(e -> (e != 2 && e != 0))
            .map(e -> e * 2)
            .forEach(System.out::println);
    }
}
