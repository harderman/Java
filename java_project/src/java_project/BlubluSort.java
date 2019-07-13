package DS;
class MyBlubluSort{
    void blubluSort(int[] array){
        //外层控制循环次数
        for(int i = 0;i<array.length-1;i++){
            //内层才做比较
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    //冒泡优化
    void BetterBluluSort(int[] array){
        Boolean flag = false;
        for(int i = 0;i<array.length-1;i++){
            //内层才做比较
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
public class BlubluSort {
    public static void main(String[] args) {
        MyBlubluSort myBlubluSort = new MyBlubluSort();
        int[] array = new int[]{1,5,8,7,4,9,3};
        myBlubluSort.blubluSort(array);
        show(array);
        System.out.println();
        myBlubluSort.BetterBluluSort(array);
        show(array);
    }
    public static void show(int[] array){
        for (int text:array) {
            System.out.print(text);
        }
    }
}
