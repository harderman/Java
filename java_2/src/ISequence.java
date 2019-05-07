public interface ISequence {
    public boolean add(int pos, Object data);
    public int search(Object key);
    public boolean contains(Object key);
    public Object getPos(int pos);
    public Object remove(Object key);
    public int size();
    public void display();
    public void clear();
}
