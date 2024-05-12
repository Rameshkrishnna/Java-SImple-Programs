package javasimpleprograms;

import java.util.Arrays;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        Random random=new Random();
        int b=array.length;
        for (int i = 0; i < array.length; i++) {
            int rnd=random.nextInt(b);
            int temp=array[rnd];
            array[rnd]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
