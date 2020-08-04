package CheongKaMeng;

//adt interface class
public interface SortedHelperListInterface<T extends Comparable<T>> {

    public boolean add(T newEntry);

    public boolean remove(T anEntry);

    public void clear();

    public int size();

    public boolean isEmpty();
    
    public T get(int index);
    
    public boolean contains(T anEntry);
    
    public boolean containsArray(T[] anArray);
    
}
