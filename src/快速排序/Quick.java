package 快速排序;

public class Quick {

    // 对数组a中的元素进行排序
    public static void sort(Comparable[] a){
//        assist = new Comparable[a.length];
        int lo =0;
        int hi = a.length -1 ;

        sort(a,lo,hi);
    }

    // 排序主代码
    public static void sort(Comparable[] a, int lo , int hi) {
        if(hi<=lo) {
            return;
        }

        int partition = partition(a, lo, hi);

        sort(a,lo,partition -1 );

        sort(a, partition + 1 , hi);




    }


    // 归并
    public static int partition(Comparable[] a, int lo , int hi) {
        Comparable key = a[lo];
        int left = lo ;
        int right = hi +1;
        while(true) {
            while(less(key,a[--right])){
                if(right==lo){
                    break;
                }
            }


            while(less(a[++left],key)){
                if(left == hi) {
                    break;
                }
            }



            if(left >= right) {
                break;
            }else {
                exch(a,left, right);

            }
        }


        exch(a,lo,right);

        return right;



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
