package 堆排序;


import java.util.Arrays;

public class HeapTest {
    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Heap.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
