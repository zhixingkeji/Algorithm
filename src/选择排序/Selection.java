package 选择排序;

public class Selection {

    // 排序主代码
    public static void sort(Comparable[] a) {
        for (int i = 0 ; i< a.length -1  ; i++) {

            int minIndex = i;

            for(int j = i+1 ; j< a.length ;j ++) {
                if(greater(a[minIndex],a[j])){
                    minIndex = j;
                }
            }

            exch(a,i,minIndex);
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


