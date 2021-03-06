package ADT.ChongWaiKit;

public interface SLListInterface<T extends Comparable<T>> {
    
    public boolean add(T newEntry);
    
    public boolean remove(T newEntry);
    
    public T removeAt(int givenPosition);
    
    public void clear();
    
    public int getPosition(T anEntry);

    public T getEntry(int givenPosition);

    public boolean contains(T anEntry);
    
    public int getLength();
    
    public boolean isEmpty();
    
    public void sortItem(T anEntry);

}