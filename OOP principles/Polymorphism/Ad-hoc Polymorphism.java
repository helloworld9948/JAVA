import java.util.Arrays;

public class AdHocPolymorphismExample {
    void sorting(int[] list) {
        Arrays.parallelSort(list);
        System.out.println("Integers after sort: " + Arrays.toString(list));
    }

    void sorting(String[] names) {
        Arrays.parallelSort(names);
        System.out.println("Names after sort: " + Arrays.toString(names));
    }

    public static void main(String[] args) {
        AdHocPolymorphismExample obj = new AdHocPolymorphismExample();
        int list[] = {2, 3, 1, 5, 4};
        obj.sorting(list);  // Calling with integer array
        String[] names = {"preetham", "charan", "sadvika", "gayatri"};
        obj.sorting(names); // Calling with String array
    }
}
