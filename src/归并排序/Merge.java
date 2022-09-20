package 归并排序;

public class Merge {

    //辅助数组
    private static  Comparable[] assist;

    // 对数组a中的元素进行排序
    public static void sort(Comparable[] a){
        assist = new Comparable[a.length];
        int lo =0;
        int hi = a.length -1 ;

        sort(a,lo,hi);
    }

    // 排序主代码
    public static void sort(Comparable[] a, int lo , int hi) {
        if(hi<=lo) {
            return;
        }


        int mid = lo + (hi - lo )/2;

        // 分别对每一组数据进行排序
        sort(a,lo,mid);
        sort(a, mid+1 , hi);


        // 再把两个组中的数据进行归并
        merge(a, lo, mid, hi);



    }


    // 归并
    public static void merge(Comparable[] a, int lo , int mid, int hi) {
        int i = lo;
        int p1 = lo;
        int p2 = mid +1 ;

        while(p1<=mid && p2<=hi) {
            if(less(a[p1],a[p2])){
                assist[i++] = a[p1++];

            }else {
                assist[i++] = a[p2++];

            }

        }

        while(p1<=mid){
            assist[i++] = a[p1++];
        }


        while(p2 <= hi) {
            assist[i++] = a[p2++];

        }

        for(int index = lo ; index<= hi ; index ++){
            a[index] = assist[index];
        }


    }

    // 比较 元素v 是否大于 元素w
    private static boolean less(Comparable v, Comparable w){
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
