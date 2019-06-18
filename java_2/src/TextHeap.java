package com.bittech.hello;

import java.util.Arrays;

public class TextHeap implements IHeap{
    private int[] elem;
    private int usedSize;
    private static final int  DEFAULT_SIZE = 10;

    public TextHeap(){
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
//向下调整
    @Override
    public void AdjustDown(int root, int len) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len){
            if(this.elem[child] < this.elem[child+1]&&child+1<len){
                ++child;
            }
            //到此出来的是最大的孩子
            if(this.elem[child] > this.elem[parent]){
             int a = 0;
            a = this.elem[child];
            this.elem[child] = this.elem[parent];
            this.elem[parent] = a;
            parent = child;
            child = parent*2+1;
            }else {
                break;
            }
        }
    }
//创建一个大根堆
    @Override
    public void initHeap(int[] array) {
        for(int i = 0;i<array.length;i++){
            this.elem[i] = array[i];
            this.usedSize++;
        }
        for(int i = (array.length-1-1)/2; i >= 0 ; i--){
            AdjustDown(i,this.usedSize);
        }
    }
//向上调整
    @Override
    public void AdjustUp(int child, int len) {
        int parent = (child-1)/2;
        while(child>0){
            if(elem[child]<elem[parent]){
                break;
            }
            else{
                int cur = elem[child];
                elem[child] = elem[parent];
                elem[parent] = cur;
            }
            child = parent;
            parent = (child-1)/2;
        }
    }

    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }
//最后一个插入
    @Override
    public void pushHeap(int item) {
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        AdjustUp(item,this.usedSize-1);
    }

    public boolean isEmpty(){
        return this.usedSize==0;
    }
//删除
    @Override
    public int popHeap() {
        if(isEmpty()){
            throw new UnsupportedOperationException("为空");
        }
        int oldData = elem[0];
        //头尾交换
        int cur = elem[0];
        elem[0] = elem[this.usedSize-1];
        elem[this.usedSize-1] = cur;
        this.usedSize--;
        //向下调整
//        int parent = 0;
//        int child = 2*parent+1;
//        while(child < usedSize){
//            if(this.elem[child] < this.elem[child+1]&&child+1<usedSize){
//                ++child;
//            }
//            //到此出来的是最大的孩子
//            if(this.elem[child] > this.elem[parent]){
//                int a = 0;
//                a = this.elem[child];
//                this.elem[child] = this.elem[parent];
//                this.elem[parent] = a;
//                parent = child;
//                child = parent*2+1;
//            }else {
//                break;
//            }
//        }
        AdjustDown(0,this.usedSize);
        return oldData;
    }
//得到顶元素
    @Override
    public int getHeapTop() {
        if(isEmpty()){
            throw new UnsupportedOperationException("为空");
        }
        return elem[0];
    }
//堆排序
    /*
    时间复杂度n*log2（n）
    空间复杂度O（1）
    不稳定
     */
    @Override
    public void HeapSort() {
        int end = this.usedSize-1;
        while(end > 0){
            int cur = elem[0];
            elem[0] = elem[end];
            elem[end] = cur;
            AdjustDown(0,end);
            end--;
        }
    }

    @Override
    public void show() {

    }
}
