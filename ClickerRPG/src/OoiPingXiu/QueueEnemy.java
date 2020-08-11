package OoiPingXiu;

public class QueueEnemy <T> implements QueueEnemyInterface<T> {
  
  private T[] array;
  private final static int front = 0;
  private int rear;
  private static final int DEFAULT_SIZE = 10;
  
  public QueueEnemy(){
      this(DEFAULT_SIZE);
  }
  
   public QueueEnemy(int size) {
    array = (T[]) new Object[size];
    rear = -1;
  } //end constructor
   
   // add in new entry 
  public void enqueue(T newEntry){
      if (!isArrayFull()) {
      rear++;
      array[rear] = newEntry;
    }
  }
  
   private boolean isArrayFull() {
      return rear == array.length - 1;    
   }
   
   // removes the new entry to the front
    public T dequeue() {
        T start = null;
       
       if(!isEmpty()){
           start = array[front];
           
         //shift remaining array items forward one position
         for(int i = front; i < rear; i++){
             array[i] = array[i + 1];
         }
         rear --;
       }
       return start;
    }
    
    
   // check the data at the front of queue
   public T getFront(){
       T start = null;
       
       if(!isEmpty()){
           start = array[front];
       }
     return start;
   }
   
   
   public boolean isEmpty(){
       // check whether the queue is empty
       return front > rear;
   } 
   
   public void clear() {
    // deallocates only the used portion
    if (!isEmpty()) { 
      for (int index = front; index <= rear; index++) {
        array[index] = null;
      } 
      rear = -1;
    } 
   }
}

