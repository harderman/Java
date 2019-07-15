package DS;
class MySelectSort{
    void selectSort(int[] array){
        int temp = 0;
      for(int i = 0;i<array.length;i++){
          for(int j = i+1;j<array.length;j++){
              if(array[j]<array[i]){
                   temp = array[j];
                  array[j] = array[i];
                  array[i] = temp;
              }
          }
      }
    }
}
public class SelectSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{1,5,8,7,4,9,3};
        MySelectSort mySelectSort = new MySelectSort();
        mySelectSort.selectSort(arrays);
        for (int text:arrays) {
            System.out.print(text);
        }
    }
}
