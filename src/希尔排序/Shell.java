package 希尔排序;

public class Shell {

    // 排序主代码
    public static void sort(Comparable[] a) {
        //先判断h
        int h = 1;
        while( h < a.length / 2) {
            h = 2 * h + 1;
        }



        //循环
        while(h>=1) {

            //排序
            for (int i = h ; i< a.length   ; i++) {


                for(int j = i ; j >= h ; j-=h) {
                    if(greater(a[j-h],a[j])){
                        exch(a,j-h,j);
                    }else {
                        break;
                    }
                }


            }



            //h减少法则
            h = h / 2 ;
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
