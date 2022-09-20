package 插入排序;


import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
