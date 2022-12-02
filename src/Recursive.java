public class Recursive {

    public static int sumArray(int[] array, int index) {

        if (index <= 0) {
            return array.length + array[index] - 1;
        }
        return array[index - 1] + sumArray(array, index - 1);

    }

    public static int maxComumFatorial(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return maxComumFatorial(num2, num1 % num2);
    }
}
