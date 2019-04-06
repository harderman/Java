class hungryMan{
   private static hungryMan man  = new hungryMan();
   private hungryMan(){ }
   final static hungryMan getInstance(){
       return man;
   }
   public void print(){
       System.out.println("hello hungryMan");
   }
}

public class text_0406 {

    public static void main(String[] args) {
        hungryMan hungry = hungryMan.getInstance();
        hungry.print();
    }
}
