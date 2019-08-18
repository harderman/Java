public class SearchArray {
    public boolean Find(int target, int [][] array) {
        //行
        int cows = array.length;
        //列
        int cols = array[0].length;
        if(cows == 0){
            return false;
        }
        if(cols == 0){
            return false;
        }
        int col = 0;
        int cow = cows - 1;
        while(cow >= 0 && col < cols){
            if(array[cow][col] < target){
                col++;
        }
           else if(array[cow][col] > target){
                cow--;
            }
            else{
                return true;
            }
    }
        return false;
}
}