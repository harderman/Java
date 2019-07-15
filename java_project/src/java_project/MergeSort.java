package DS;

import java.util.Arrays;
import java.util.Random;

class MyMergeSort{
    //递归
    private void merge(int[] array, int start,int mid, int end,int[] tmpArray) {
     //   int[] tmpArray = new int[array.length];
        int tmpIndex = start;
        int i = start;
        int s2 = mid+1;
        //有俩个归并段
        while(start<=mid && s2<=end){
            //俩个归并段都从头开始比较
            // 小的拉到创建好的数组里
            //再将索引++；直到有一个归并段没数据，跳出循环
            if (array[start] <= array[s2]){
                tmpArray[tmpIndex++] = array[start++];
            }else{
                tmpArray[tmpIndex++] = array[s2++];
            }
        }
        //说明第一个归并段有数据
        while (start <= mid){
            tmpArray[tmpIndex++] = array[start++];
        }
        //第二个归并段有数据
        while (s2 <= end){
            tmpArray[tmpIndex++] = array[s2++];
        }
        //把排好序的数据从tmpArray拷贝array
        while (i<=end){
            array[i] = tmpArray[i];
            i++;
        }
    }


    void mergeSort(int[] array, int start, int end,int[] tmpArray){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(array,start,mid,tmpArray);
        mergeSort(array,mid+1,end,tmpArray);
        merge(array,start,mid,end,tmpArray);
    }
    //非递归



}

public class MergeSort {
    public static void main(String[] args) {
        MyMergeSort myMergeSort = new MyMergeSort();
        int[] array = new int[100000];
        Random random = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(100000)+1;
        }
        int[] tmpArray = new int[array.length];
        myMergeSort.mergeSort(array,0,array.length-1,tmpArray);
        System.out.println(Arrays.toString(array));
    }
}
