import java.util.Arrays;

public class MySequenceImpl implements ISequence {
        private Object[] elem;
        private int usedSize;//有效数据个数
        private static final int DEFAULT_SIZE = 10;

        public MySequenceImpl() {
            this.elem = new Object[DEFAULT_SIZE];
            this.usedSize = 0;
        }

        private boolean isFull() {
        /*if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
            return this.usedSize == this.elem.length;
        }
//指定位置插入数据
        @Override
        public boolean add(int pos, Object data) {
            //1、pos位置的合法性进行判断
            //2、判断是否为满。
            if (pos < 0 || pos > this.usedSize) {
                return false;
            }
            if (isFull()){
                //二倍扩容
                //System.arraycopy();也可以拷贝，且更快，无返回值
                this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
                for(int i = this.usedSize-1 ;i>pos;i--){
                    this.elem[i+1] = this.elem[i];
                }
                this.elem[pos] = data;
                this.usedSize++;
                return true;
            }
            return true;
        }
        private boolean isEmpty(){
            return this.usedSize == 0;
        }
        @Override
        public int search(Object key) {
            if (isEmpty()){
                return -1;
            }
            for(int i = 0;i <= this.usedSize;i++){
                if( this.elem[i].equals(key)){
                    return i;
                }
            }
            return -1;
        }
//是否包含关键字
        @Override
        public boolean contains(Object key) {
            if (isEmpty()){
                return false;
            }
            for(int i = 0;i <= this.usedSize;i++){
                if( this.elem[i].equals(key)){
                    return true;
                }
            }
            return false;
        }
//返回指定pos下标的内容
        @Override
        public Object getPos(int pos) {
            if(pos < 0||pos >=this.usedSize) {
                return null;
            }

            return this.elem[pos];
        }
//删除
        @Override
        public Object remove(Object key) {
            int index = search(key);
            if(index == -1){
                return null;
            }
            int i;
            Object data = this.elem[index];
            for( i = index;i < this.usedSize-1;i++){
                this.elem[i] = this.elem[i+1];

            }
            this.usedSize--;
            this.elem[i+1] = null;
            return data;
        }
//返回有用数据的长度
        @Override
        public int size() {

            return 0;
        }
//打印
        @Override
        public void display() {

        }
//防止内存泄漏
        @Override
        public void clear() {
            for(int i =0;i<this.usedSize;i++){
                this.elem[i] = null;
            }

        }
}
