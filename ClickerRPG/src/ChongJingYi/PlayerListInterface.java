package ChongJingYi;


public interface PlayerListInterface<T> {
    
    public void add(T newEntry);
    
    public T remove(int position);
    
    public boolean contains(T anEntry);
    
    public boolean isEmpty();
    
    public T getEntry(int givenPosition);
    
    public int getLength();
    
}
