package ADT.OoiPingXiu;

// adt interface class
public interface QueueEnemyInterface<T> {
        
    public void enqueue(T newEntry) ;
    
    public T dequeue();
    
    public T getFront();
    
    public boolean isEmpty();
    
    public void clear(); 
}
