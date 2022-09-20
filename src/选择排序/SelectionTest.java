package 选择排序;

import java.util.Arrays;

public class SelectionTest {

    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
