package ADT.ChongJingYi;


public class PlayerList<T> implements PlayerListInterface<T> {
    
    private Node firstNode;
    private int length;

    public PlayerList() {
    }

    // create new node
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        
        if(isEmpty()){
            firstNode = newNode;
        }
        else{
            Node currentNode = firstNode;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        
        length++;
    }

    @Override
    public T remove(int position) {
        T result = null;
        
        if((position >= 1) && (position <= length)){
            //case 1: remove 1st entry
            if(position == 1){
                result = firstNode.data;
                firstNode = firstNode.next;
            }
            //case 2: position > 1
            else{
                Node nodeBefore = firstNode;
                for(int i = 1; i < position - 1; ++i){
                    nodeBefore = nodeBefore.next;
                }
                result = nodeBefore.next.data;
            }
            length--;
        }
        return result;
    }
    
    public void clear() {
        firstNode = null;
        length = 0;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    public T getEntry(int givenPosition) {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= length)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        currentNode = currentNode.next;	
      }
      result = currentNode.data;
    }

    return result;
  }

    @Override
    public int getLength() {
        return length;
    }
    
    public boolean contains(T anEntry) {
        boolean found = false;
        
        Node currentNode = firstNode;
        
        while(!found && (currentNode != null)){
            if(currentNode.equals(currentNode.data)){
                found = true;
            }
            else{
                currentNode = currentNode.next;
            }
        }
        return found;
    }
    
    //inner class
  private class Node {

    private T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }

    private Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }// node
    
}
