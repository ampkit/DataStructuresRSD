package CheongKaMeng;

//adt interface class
public interface SortedHelperListInterface<T extends Comparable<T>> {

    public boolean add(T newEntry);

    public boolean remove(T newEntry);

    public void clear();

    public int getLength();

    public boolean isEmpty();

    public T get(int index);
    
}
