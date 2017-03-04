/**
 * Created by corycordell on 2/20/17.
 *
 * This is the base class for IntHeap classes
 * such as MaxIntHeap and MinIntHeap.
 */

package Sorts.HeapSort;

import java.util.Arrays;

public abstract class IntHeapAbstract {
    protected int capacity = 5;
    protected int size = 0;

    protected int[] items;

    public abstract void heapifyUp();
    public abstract void heapifyDown();

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item) {
        if(items == null) items = new int[capacity];
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void sortArray(int[] ar) {
        capacity = ar.length;
        for(int i : ar)
            add(i);
    }

    public int[] getSortedArray() {
        int[] sortedArray = new int[size];
        for(int i = 0; i < sortedArray.length; i++)
            sortedArray[i] = poll();

        return sortedArray;
    }

    protected int[] getHeapArray() {
        return items;
    }

    protected int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; };
    protected int getRightChildIndex(int parentIndex) { return 2 * parentIndex + 2; };
    protected int getParentIndex(int childIndex) { return (childIndex - 1) / 2; };

    protected boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; };
    protected boolean hasRightChild(int index) { return getRightChildIndex(index) < size; };
    protected boolean hasParent(int index) { return getParentIndex(index) < size; };

    protected int leftChild(int index) { return items[getLeftChildIndex(index)]; }
    protected int rightChild(int index) { return items[getRightChildIndex(index)]; }
    protected int parent(int index) { return items[getParentIndex(index)]; }

    protected void swap ( int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
}
