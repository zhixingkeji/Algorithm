package 冒泡排序;

public class Bubble {

    // 排序主代码
    public static void sort(Comparable[] a) {
        for (int i = a.length - 1 ; i> 0 ; i--) {
            for(int j = 0 ; j< i ;j ++) {
                if(greater(a[j],a[j+1])){
                    exch(a, j , j+1);
                }
            }
        }

    }


    // 比较 元素v 是否大于 元素w
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0 ;

    }

    //数组元素 i 和 j 交换位置
    private static void exch(Comparable[] a , int i , int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }
}
