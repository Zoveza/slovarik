import java.util.Random;
import java.util.Scanner;
import java.util.Map;

public class methods {
    static int[] fillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(10);
        }

        return array;
    }

    static int inputNum(String msg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(msg);
        int num = iScanner.nextInt();
        iScanner.close();
        return num;
    }

    static void showArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }

    static Map<Integer, Integer> fillDict(Map<Integer, Integer> dict, int[] array){
        for (int i = 0; i < array.length; i++) {
            dict.put(array[i], 0);
        }
        for (int i = 0; i < array.length; i++) {
            int temp = dict.get(array[i]);
            temp++;
            dict.put(array[i], temp);   
        }
        return dict;
    }
}
