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

    public static int maxNumber(int[] array, int maxNum) {
        if (maxNum == 1) {
            return array[0];
        }
        if (array[0] < array[maxNum - 1]) {
            array[0] = array[maxNum - 1];
            return maxNumber(array, maxNum - 1);
        }
        return maxNumber(array, maxNum - 1);
    }
    public static int numConsoantes(String name, int num) {
        if (num == 1) {
            if (!Character.toString(name.charAt(0)).equals("a") && !Character.toString(name.charAt(0)).equals("e") && !Character.toString(name.charAt(0)).equals("i") &&
                    !Character.toString(name.charAt(0)).equals("o") && !Character.toString(name.charAt(0)).equals("u")) {
                return 1;
            } else {
                return 0;
            }
        }
        if (!Character.toString(name.charAt(num - 1)).equals("a") && !Character.toString(name.charAt(num - 1)).equals("e") && !Character.toString(name.charAt(num - 1)).equals("i") &&
                !Character.toString(name.charAt(num - 1)).equals("o") && !Character.toString(name.charAt(num - 1)).equals("u")) {
            return numConsoantes(name, num - 1) + 1;
        } else {
            return numConsoantes(name, num - 1);
        }
    }
}


/*int count = 0;
        if (Character.toString(name.charAt(count)).equals("a")) {
            return sumConsoantes("ana" + count) - 1;
        }

        return 0;*/