package ADT.CheongKaMeng;

//adt implementation class
import ADT.CheongKaMeng.SortedHelperListInterface;

public class SortedHelperList<T extends Comparable<T>> implements SortedHelperListInterface<T> {

    private T[] dataList;
    private int length;
    private static final int DEFAULT_SIZE = 25;

    public SortedHelperList() {
        this(DEFAULT_SIZE);
    }

    public SortedHelperList(int size) {
        length = 0;
        dataList = (T[]) new Comparable[size];
    }

    public T get(int index) {
        return dataList[index];
    }

    public boolean add(T newEntry) {
        if (isFull()) {
            expandArray();
        }
        int i = 0;
        while (i < length && newEntry.compareTo(dataList[i]) > 0) {
            i++;
        }
        makeSpace(i);
        dataList[i] = newEntry;
        length++;
        return true;
    }

    public boolean remove(T anEntry) {
        int i = 0;
        while (i < length && anEntry.compareTo(dataList[i]) > 0) {
            i++;
        }
        if (anEntry.equals(dataList[i])) {
            removeSpace(i);
            length--;
            return true;
        }
        return false;
    }

    public void clear() {
        length = 0;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean contains(T anEntry) {
        int i = 0;
        while (i < length && anEntry.compareTo(dataList[i]) > 0) {
            i++;
        }
        if (anEntry.equals(dataList[i])) {
            return true;
        }
        return false;
    }

    public boolean containsArray(T[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (!contains(anArray[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isFull() {
        return length == dataList.length;
    }

    private void expandArray() {
        T[] oldList = dataList;
        int oldSize = dataList.length;

        dataList = (T[]) new Comparable[oldSize * 2];

        for (int i = 0; i < oldSize; i++) {
            dataList[i] = oldList[i];
        }
    }

    private void makeSpace(int newSpaceIndex) {
        int lastIndex = length - 1;

        for (int i = lastIndex; i >= newSpaceIndex; i--) {
            dataList[i + 1] = dataList[i];
        }
    }

    private void removeSpace(int targetIndex) {
        int lastIndex = length - 1;

        for (int i = targetIndex; i < lastIndex; i++) {
            dataList[i] = dataList[i + 1];
        }
        dataList[lastIndex] = null;
    }

}
