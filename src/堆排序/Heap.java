package 堆排序;

public class Heap {

    // 对数组a中的元素进行排序
    private static void creatHeap (Comparable[] source, Comparable[] heap) {
        System.arraycopy(source,0,heap,1,source.length);
        for(int i = (heap.length)/2 ; i>0 ; i--) {
            sink(heap,i , heap.length -1);
        }

    }

    public static void sort (Comparable[] source ){
        Comparable[] heap = new Comparable[source.length +1];
        creatHeap(source,heap);
        int N = heap.length -1 ;
        while(N!=1) {
            exch(heap,1,N);
            N--;
            sink(heap,1,N);
        }

        System.arraycopy(heap,1,source,0,source.length);

    }


    private static void sink(Comparable[] heap, int target, int range){
        while(2* target <= range) {
            int max;
            if(2*target + 1 <= range){
                if(less(heap, 2*target, 2*target+1)){
                    max = 2*target +1;
                }else {
                    max = 2*target;
                }

            }else {
                max = 2*target;
            }

            if(!less(heap,target,max)) {
                break;
            }

            exch(heap,target,max);

            target = max;

        }
    }

    // 比较 元素v 是否大于 元素w
    private static boolean less(Comparable[] heap , int i , int j){
        return heap[i].compareTo(heap[j])< 0;

    }

    //数组元素 i 和 j 交换位置
    private static void exch(Comparable[] heap , int i , int j){
        Comparable temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;


    }
}
