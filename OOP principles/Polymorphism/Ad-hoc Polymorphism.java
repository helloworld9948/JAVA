import java.util.Arrays;

public class AdhocPolymorphismExample {

    public static void sorting(int[] arr) {
        Arrays.parallelSort(arr);
        System.out.println("Integers after sort - Array Story: " + Arrays.toString(arr));
    }

    public static void sorting(String[] arr) {
        Arrays.parallelSort(arr);
        System.out.println("Names after sort: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        String[] names = {"John", "Alice", "Bob", "David", "Eva"};

        sorting(numbers);

        sorting(names);
    }
}
