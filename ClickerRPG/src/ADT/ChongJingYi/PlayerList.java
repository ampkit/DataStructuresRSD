package ADT.ChongJingYi;

import clickerrpg.Player;

public class PlayerList<T extends Comparable<T>> implements PlayerListInterface<T> {

    private Node firstNode;
    private int length;

    public PlayerList() {
    }

    
    public void add(T newEntry) {
        // create new node
        Node newNode = new Node(newEntry);  

        if (isEmpty()) {
            firstNode = newNode;
        } 
        else {
            // traverse linked list with p pointing to the current node
            Node currentNode = firstNode; 
            // while have not reached the last node
            while (currentNode.next != null) {  
                currentNode = currentNode.next;
            }
            // make last node reference new node
            currentNode.next = newNode;  
        }
        length++;
    }


    public void clear() {
        firstNode = null;
        length = 0;
    }

    
    public boolean isEmpty() {
        return length == 0;
    }

    
    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= length)) {
            Node currentNode = firstNode;
            for (int i = 0; i < givenPosition - 1; ++i) {
                // advance currentNode to next node
                currentNode = currentNode.next;  
            }
            // currentNode is pointing to the node at givenPosition
            result = currentNode.data;  
        }

        return result;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(T anEntry) {
        boolean found = false;

        Node currentNode = firstNode;

        while (!found && (currentNode != null)) {
            if (currentNode.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }

    public void addDescendingSortedNode(T newEntry) {

        Node currentNode = firstNode;
        //add at beginning
        if (firstNode == null) {
            firstNode = new Node(newEntry);
        } 
        // newEntry > firstNode.data
        else if (newEntry.compareTo(firstNode.data) > 0) {

            Node newNode = new Node(newEntry);
            newNode.next = firstNode;
            firstNode = newNode;
        }
        //add in the middle or at the end
        else {
            Node previousNode = currentNode;
            currentNode = currentNode.next;
            while (currentNode != null) {
                if (newEntry.compareTo(currentNode.data) > 0) {
                    Node tempNode = currentNode;
                    Node newNode = new Node(newEntry);
                    previousNode.setNext(newNode);
                    newNode.setNext(tempNode);
                    break;
                }
                previousNode = previousNode.next;
                currentNode = currentNode.next;
            }
            if (currentNode == null) {
                previousNode.setNext(new Node(newEntry));
            }
        }
        length++;

    }

    public void sortList() {
        PlayerList temp = new PlayerList();
        for (int i = 1; i <= length; i++) {
            temp.addDescendingSortedNode(getEntry(i));
        }

        this.firstNode = temp.firstNode;
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

        public void setNext(Node next) {
            this.next = next;
        }
    }// node

}
