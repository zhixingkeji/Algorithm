package 插入排序;

public class Insertion {

    // 排序主代码
    public static void sort(Comparable[] a) {
        for (int i = 0 ; i< a.length   ; i++) {

            int minIndex = i;

            for(int j = i ; j>0 ; j--) {
                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else {
                    break;
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
