package 快速排序;


import java.util.Arrays;

public class QuickTest {

    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
