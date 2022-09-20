package 归并排序;


import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
