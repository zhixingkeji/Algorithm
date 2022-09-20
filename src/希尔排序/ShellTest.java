package 希尔排序;



import java.util.Arrays;

public class ShellTest {

    public static void main(String[] args) {
        Integer[] arr = {4,25,1,9,6,15};

        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
