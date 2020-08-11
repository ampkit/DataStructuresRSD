package ChongWaiKit;

/**
 * @author Chong Wai Kit
 */

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
    
}
