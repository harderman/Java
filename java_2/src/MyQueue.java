package com.bittech.hello;
/*
直接插入排序
1. 元素集合越接近有序，直接插入排序算法的时间效率越高
2. 时间复杂度：O(N^2)
3. 空间复杂度：O(1)，它是一种稳定的排序算法
4. 稳定性：稳定

 */
public class MyQueue {
    public static void insertSort(int[] array){
        for(int i =1;i < array.length;i++){
            int tmp = array[i];
            int j;
            for( j= i-1;j>=0;j--){
                if(array[j] > tmp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
/*
希尔排序
1. 希尔排序是对直接插入排序的优化。
2. 当gap > 1时都是预排序，目的是让数组更接近于有序。当gap == 1时，
    数组已经接近有序的了，这样就 会很快。这样整体而言，可以达到优化的效果。
    我们实现后可以进行性能测试的对比。
3. 希尔排序的时间复杂度不好计算，需要进行推导，推导出来平均时间复杂度： O(N^1.3—N^2）
4. 稳定性：不稳定
 */
    public  static void shell(int[] array,int agp){
        for(int i =1+agp;i < array.length;i++){
            int tmp = array[i];
            int j;
            for( j= i-agp;j>=0;j = j-agp){
                if(array[j] > tmp){
                    array[j+agp] = array[j];
                }else{
                    break;
                }
            }
            array[j+agp] = tmp;
        }
    }
    public static void shellSort(int array[]){
        int[] dir = {5,3,1};
        for(int i= 0;i<3;i++){
            shell(array,dir[i]);
        }
    }
/*
选择排序
不稳定
时间复杂度O（n^2）
 */
    public static void selectSort(int[] array) {
        int temp = 0;
        for(int i = 0;i< array.length;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[j] < array[i]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }
            }
        }
    }
/*
冒泡排序

 */
public static void bubble (int[] array) {
    int temp = 0;
    int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }
}
    public static void main(String[] args) {
        int array[] = {4,10,8,2,16,20};
        for (int anArray : array) {
            System.out.println(anArray);
        }
        insertSort(array);
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }
}
