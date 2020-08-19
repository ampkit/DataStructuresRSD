package ADT.ChongWaiKit;

/**
 * @author Chong Wai Kit
 */
public class SortedLinkedList<T extends Comparable<T>> implements SLListInterface<T>{
    
    private Node firstNode;
    private int length;
    
    public SortedLinkedList(){
        firstNode = null;
        length = 0;
    }
    
    //adds new node in sorted position
    public boolean add(T newEntry) {
        Node prevNode = null;
        Node newNode = new Node(newEntry);
        
        //checks if list is empty
        if (isEmpty())
        {
            firstNode = newNode;
            length++;
            return true;
        }
        
        //starts checking from firstNode
        Node currentNode = firstNode;
        
        while (currentNode != null && newEntry.compareTo(currentNode.data) > 0 )
        {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        
        //Case 1 : Add at beginning
        if (prevNode == null)
        {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        //Case 2 : Add in middle / end
        else 
        {
            newNode.next = currentNode;
            prevNode.next = newNode;
        }
        
        length++;
        return true;
    }
    
    //removes node
    public boolean remove(T anEntry) {
        boolean found = false;
        
        Node prevNode = null;
        Node currentNode = firstNode;
        
        while (!found && currentNode != null)
        {
            if (anEntry.compareTo(currentNode.data) == 0)
            {
                //Case 1 : Remove first node
                if (prevNode == null)
                {
                    firstNode = currentNode.next;
                }
                //Case 2 : Remove non-first node
                else
                {
                    prevNode.next = currentNode.next;
                }
                length--;
                return true;
            }
            else
            {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        
        return false;
    }
    
    //removes node at position
    public T removeAt(int givenPosition) {
        //check if givenPosition is valid
        if (givenPosition < 0 || givenPosition > length - 1)
        {
            return null;
        }
        
        int currentPosition = 0;
        Node prevNode = null;
        Node currentNode = firstNode;
        
        while (currentPosition != givenPosition)
        {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentPosition++;
        }
        
        //Case 1 : Remove first node
        if (prevNode == null)
        {
            firstNode = currentNode.next;        
        }
        //Case 2 : Remove not first node
        else
        {
            prevNode.next = currentNode.next;
        }
        
        length--;
        return currentNode.data;
    }

    //clears the list
    public void clear() {
        firstNode = null;
        length = 0;    
    }
    
    //gets position
    public int getPosition(T anEntry) {
        boolean found = false;
        
        Node currentNode = firstNode;
        int currentPosition = 0;
        
        while (!found && currentNode != null)
        {
            if (anEntry.compareTo(currentNode.data) > 0)
            {
                return currentPosition * -1;
            } 
            else if (anEntry.compareTo(currentNode.data) == 0)
            {
                return currentPosition;
            }
            
            currentNode = currentNode.next;
            currentPosition++;
        }
        
        return -1;
    }
    
    //gets entry at position
    public T getEntry(int givenPosition) {
        //check if givenPosition is valid
        if (givenPosition < 0 || givenPosition > length - 1)
        {
            return null;
        }
        
        int currentPosition = 0;
        Node currentNode = firstNode;
        
        while (currentPosition != givenPosition)
        {
            currentNode = currentNode.next;
            currentPosition++;
        }
        
        return currentNode.data;    
    }
    
    //check whether list  contains entry
    public boolean contains(T anEntry) {
        boolean found = false;
        
        Node tempNode = firstNode;
        
        while (!found && tempNode != null)
        {
            if (tempNode.data.equals(anEntry))
            {
                return true;
            }
            else
            {
                tempNode = tempNode.next;
            }
        }
        
        return false;    
    }

    public int getLength() {
        return length;    
    }
    
    public boolean isEmpty() {
        return (length == 0);    
    }
    
    public void sortItem(T anEntry){
        remove(anEntry);
        add(anEntry);
    }

    private class Node{
        private T data;
        private Node next;
        
        private Node(T data){
            this.data = data;
            next = null;
        }
        
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    
}
