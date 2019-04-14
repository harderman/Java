//@Deprecated
class sum{
    public void Sum(int[] nubs , int target){
        for(int i = 0 ;i<nubs.length;i++) {
            for (int j = i+1;j<nubs.length;j++) {
                if (nubs[i] + nubs[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
public class tow_sun_text {
    public static void main(String[] args) {
        int[] nubs = new int[]{2,7,11,5};
        sum sums = new sum();
        sums.Sum(nubs,9);
    }
}
