package DS;
//二叉树（正确版）
//二叉树的顺序结构及实现
import Interface.Heap;

import java.util.Arrays;

public class TextHeap  implements Heap {
    private int[] elem;
    private int usedSize;
    private static final int DEFAULT_SIZE  = 10;
    public TextHeap(){
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
    @Override
    public void AdjustDown(int root, int len) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len){
            if(child+1<len&&elem[child]<elem[child+1]){
                ++child;
            }
            //child存放的是左右孩子的最大值
            if(elem[child]>elem[parent]){
                //交换
                int temp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = temp;
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
    }
//创建一个大根堆
/*
子推父：子：n  父：（n-1）/2
父推子： 父：n  子： （2n+1），（2n+2）
 */
    @Override
    public void initHeap(int[] array) {
        for(int i = 0;i<array.length;i++){
            this.elem[i] = array[i];
            this.usedSize++;
        }

        for(int i = (array.length-1-1)/2;i >= 0;i--){
            AdjustDown(i,this.usedSize);
        }
    }
//向上调整
    @Override
    public void AdjustUp(int child, int len) {
        int parent = (child-1)/2;
        while(child > 0){
            if(elem[child]<elem[parent]){
                break;
            }else{
                int temp = elem[child];
               elem[child] = elem[parent];
               elem[parent] = temp;
            }
            child = parent;
            parent = (child-1)/2;
        }
    }

    public boolean isFll(){
        return this.elem.length>=this.usedSize;
    }
// 插入 item 到堆中
    @Override
    public void pushHeap(int item) {
        if(isFll()){
           this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.usedSize] = item;
        this.usedSize++;
        AdjustUp(this.usedSize-1,this.usedSize);
    }
    public boolean isEmpty(){
        return this.usedSize == 0;
    }
// 返回堆顶元素，删除数据元素
    @Override
    public int popHeap() {
        if(isEmpty()){
            throw new UnsupportedOperationException("空堆");
        }
        int oldData = elem[0];
        elem[0] = elem[usedSize - 1];
        elem[usedSize - 1] = elem[0];
        this.usedSize--;
        AdjustDown(0,this.usedSize);
        return oldData;
    }
 // 返回堆顶元素，不删除数据元素
     @Override
    public int getHeapTop() {
         if(isEmpty()){
             throw new UnsupportedOperationException("空堆");
         }
        return elem[0];
    }
    //堆排序
    /*
    时间复杂度：O（n *log  2n）
    空间复杂度O（1）；
    稳定性：不稳定
     */
    @Override
    public void  HeapSort() {
        int end = this.usedSize - 1;
        while(end > 0){
            int temp =  this.elem[0];
            elem[0] = elem[end];
            elem[end] = temp;
            AdjustDown(0,end);
            end--;
        }
    }

    @Override
    public void show() {
        for(int i =0;i<this.usedSize;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TextHeap textHeap = new TextHeap();
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        textHeap.initHeap(array);
        textHeap.show();
        textHeap.AdjustDown(1,10);
        textHeap.show();
        textHeap.pushHeap(11);
        textHeap.show();
        textHeap.popHeap();
        textHeap.show();
        textHeap.HeapSort();
        textHeap.show();
    }
}
