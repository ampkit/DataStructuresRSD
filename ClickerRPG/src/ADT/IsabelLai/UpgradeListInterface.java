package ADT.IsabelLai;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface UpgradeListInterface<T> {
    
    void add(T newElement);
    
    public T remove(int selection);
    
    public boolean replace(int selection, T newData);
    
    public boolean search(T catchValue);
    
    public T getEntry(int selection);
    
    public String toString();

    public T get(int index);
    
    public void clear();

    public int getLength();

    public boolean isEmpty();
    
    public boolean isArrayFull();
    
    
}
