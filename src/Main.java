public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 11, 7, 8, 9, 10};
        Recursive recursive = new Recursive();
        System.out.println(Recursive.sumArray(myArray, myArray.length - 1));
        System.out.println(Recursive.maxComumFatorial(20, 5));
        System.out.println(Recursive.maxNumber(myArray, myArray.length));
        String string="pedro";
        System.out.println(Recursive.numbOfC("Pedro",string.length()));

    }
}