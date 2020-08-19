package ADT.ChongJingYi;


public interface PlayerListInterface<T> {
    
    public void add(T newEntry);
    
    public T remove(int position);
    
    public void clear();
    
    public boolean isEmpty();
    
    public T getEntry(int givenPosition);
    
    public int getLength();
    
    public boolean contains(T anEntry);
    
}
