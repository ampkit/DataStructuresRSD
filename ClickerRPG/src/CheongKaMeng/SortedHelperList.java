package CheongKaMeng;

//adt implementation class

import CheongKaMeng.SortedHelperListInterface;

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
        int i = 0;
        while (i < length && newEntry.compareTo(dataList[i]) > 0) {
            i++;
        }
        makeSpace(i);
        dataList[i] = newEntry;
        length++;
        return true;
    }

    public boolean remove(T target) {
        int i = 0;
        while (target.compareTo(dataList[i]) > 0 && i < length) {
            i++;
        }
        if (target == dataList[i]) {
            removeSpace(i);
            length--;
            return true;
        }
        return false;
    }

    public void clear() {
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
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
    }

}
