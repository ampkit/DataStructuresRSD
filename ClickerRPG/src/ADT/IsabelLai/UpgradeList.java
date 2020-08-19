/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT.IsabelLai;

/**
 *
 * @author User
 */
public class UpgradeList<T> implements UpgradeListInterface<T> {
    private T[] array = (T[]) new Object[50];
    private int length;
    
    public UpgradeList()
    {
        length = 0;
    }
    
     public void add(T newElement)
     {
        array[length] = newElement;
         length++;
     }
     
     public T remove(int selection) 
     {
         T result = null;
            if ((selection >= 1) && (selection <= length)) 
            {
              result = array[selection - 1];

              if (selection < length) 
              {
                int removedIndex = selection - 1;
                int lastIndex = length - 1;

                    for (int index = removedIndex; index < lastIndex; index++)
                    {
                      array[index] = array[index + 1];
                    }
              }
              length--;
            }
            return result;
     } 
    
   public boolean replace(int selection, T newData)
   {
       boolean isSucess = true;
       if ((selection >= 1) && (selection <= length)) 
       {
           newData = array[selection -1];
       }
       else
       {
           isSucess = false;
       }
       return isSucess;
   }
     
    public boolean search(T catchValue) {
    boolean found = false;
    for (int i = 0; !found && (i < length); i++) {
      if (catchValue.equals(array[i])) {
        found = true;
      }
    }

    return found;
    }
    
    public T getEntry(int selection) {
        if ((selection >=0) && (selection <= length)) {
          return array[selection];
        }
        else 
        {
            return null;
        }
    }
    
    public String toString() {
    String output = "";
    for (int i = 0; i < length; ++i) {
      output += array[i] + "\n";
    }

    return output;
  }
         
     public T get(int index)
     {
         return array[index];
     }
     
     public void clear() 
    {
        length = 0;
    }

    public int getLength() 
    {
        return length;
    }

    public boolean isEmpty() 
    {
        return length == 0;
    }
    
    public boolean isArrayFull() 
    {
    return length == array.length;
    }
    
 
}
