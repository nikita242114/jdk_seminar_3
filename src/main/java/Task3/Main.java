package Task3;

public class Main {
    public static void main(String[] args) {
        String[] strings1 = {"Word", "Some", "Generate", "Next"};
        String[] strings2 = {"Word", "Some", "Generate"};
        String[] strings3 = {"Word", "Some", "Generate"};
        Integer[] integers1 = {4, 3, 4};
        Integer[] integers2 = {4, 3, 4};
        Integer[] integers3 = {4, 3, 4, 45};

        System.out.println(compareArray(strings3, strings2));
    }

    static <T> boolean compareArray(T[] array1, T[] array2) {
        if (array1.length != array2.length || !array1.getClass().equals(array2.getClass())) {
            System.out.println("Arrays with different lengths or types");
            return false;
        }
        int i2 = 0;
        for (T t : array1) if (!t.equals(array2[i2++])) return false;
        return true;
    }
}