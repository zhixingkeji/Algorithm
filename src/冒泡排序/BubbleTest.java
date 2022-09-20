package 冒泡排序;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
