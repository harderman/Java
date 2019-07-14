package DS;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

//当待排序序列为有序时，快排退化为冒泡排序。
class MyQuickSort{
    //一趟快排
    //以low号下标为基准的一趟快排，，排完之后基准左边比他小，右边比他大
    private int FindPartion(int[] array, int low, int high){
        int temp = array[low];
        while(low<high){
            while( low<high && array[high] >= temp){
                high--;
            }
            if(low>=high){
              // array[low] = temp;与28行重复执行
               break;
            }
            else{
                array[low] = array[high];
            }

            while( low<high && array[low] <= temp){
                low++;
            }
            if(low>=high){
              //  array[low] = temp; 与28行重复执行
                break;
            }
            else{
                array[high] = array[low];
            }
        }
        array[low] = temp;
        return low;
    }

    //将输入的俩个下标对应的值交换
    private void swap(int[] array, int low, int high){
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
    //快排优化：三数取中法，这个优化只是优化找基准的方法，
    // 此法以mid为基准，每次都可把待排序数组分为俩波；很得劲！
    //还有一种叫随机选取基准法，但由于是随机的最坏情况仍为O（n^2），所以有了三数取中
    private void medianOfThree(int[] array, int low, int high){
        int mid = (low+high)/2;
        if(array[mid] > array[low]){
            swap(array,mid,low);
        }
        if(array[low]>array[high]){
            swap(array,low,high);
        }
        //此处要确保array[mid]<array[low]<array[high]
    }
    private void insertSort2(int[] array, int start, int end) {
        for(int i = start+1;i<=end;i++){
            int j;
            int temp = array[i];
            for( j = i-1;j>=start;j--){
                if(array[j]>temp){
                    array[j+1] = array[j];
                }
                else{
                    break;
                }
            }
            array[j+1] = temp;
        }
    }

    //以下是快排
    private void quick(int[] array, int start, int end){
        medianOfThree(array,start,end);
        int par = FindPartion(array,start,end);
        //快排优化2：当递归到后期的时候数组越趋于有序化，被分割而成的每一小个数组如继续用快排
        //效率会退化为冒泡，此时用直接插入排序会更好
        if(end-start+1<16){
            //
            insertSort2(array,start,end);
            return;
        }
        //递归左边
        if(par>start+1){
            quick(array,start,par-1);
        }
        //递归右边
        if(par<end-1){
            quick(array,par+1,end);
        }
    }
    void quickSort(int[] array){
        quick(array,0,array.length-1);
    }
 /*非递归的
递归转非递归一般会用到栈

*/
public void quickSort_1(int[] array){
    Stack<Integer> stack = new Stack<>();
    int low = 0;
    int high = array.length-1;
    int par = FindPartion(array,low,high);
    if(par > low+1){
        stack.push(low);
        stack.push(par-1);
    }
    if(par < high-1){
        stack.push(par+1);
        stack.push(high);
    }
    while(!stack.empty()){
        high = stack.pop();
        low = stack.pop();
        par = FindPartion(array,low,high);
        if(par > low+1){
            stack.push(low);
            stack.push(par-1);
        }
        if(par < high-1){
            stack.push(par+1);
            stack.push(high);
        }
    }
  }
}
//快排为分治算法
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(100000)+1;
        }
        MyQuickSort myQuickSort = new MyQuickSort();
        myQuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
        myQuickSort.quickSort_1(array);
        System.out.println(Arrays.toString(array));
    }
}
