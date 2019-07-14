package DS;
class MyInsertSort{
    void insertSort(int[] arrays){
        for(int i = 1;i<arrays.length;i++){
            int j;
            int temp = arrays[i];
            for( j = i-1;j>=0;j--){
                if(arrays[j]>temp){
                    arrays[j+1] = arrays[j];
                }
                else{
                    break;
                }
            }
            arrays[j+1] = temp;
        }
    }
}
public class InsertSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{1,5,8,7,4,9,3};
        MyInsertSort myInsertSort = new MyInsertSort();
        myInsertSort.insertSort(arrays);
        for (int text:arrays) {
            System.out.print(text);
        }
    }
}
