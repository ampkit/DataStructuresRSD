package ADT.ChongJingYi;


public interface PlayerListInterface<T extends Comparable<T>> {
    
    public void add(T newEntry);
    
    public void clear();
    
    public boolean isEmpty();
    
    public T getEntry(int givenPosition);
    
    public int getLength();
    
    public boolean contains(T anEntry);
    
    public void addDescendingSortedNode(T newEntry);
    
    public void sortList();
    
}
