/**
 * Created by Cory W. Cordell on 2/19/17.
 *
 * This is a max heap implementation of MinIntHeap.
 */

package HeapSort;

import java.util.Arrays;

public class MaxIntHeap {
    private int capacity = 5;
    private int size = 0;

    private int[] items;

    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; };
    private int getRightChildIndex(int parentIndex) { return 2 * parentIndex + 2; };
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2; };

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; };
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; };
    private boolean hasParent(int index) { return getParentIndex(index) < size; };

    private int leftChild(int index) { return items[getLeftChildIndex(index)]; }
    private int rightChild(int index) { return items[getRightChildIndex(index)]; }
    private int parent(int index) { return items[getParentIndex(index)]; }

    private void swap ( int indexOne, int indexTwo) {
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

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) < items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }

            if( items[index] > items[largerChildIndex]) {
                break;
            } else {
                swap(index, largerChildIndex);
            }
            index = largerChildIndex;
        }
    }

    public void sortArray(int[] ar) {
        capacity = ar.length;
        for(int i : ar)
            add(i);
    }

    public int[] getHeapArray() {
        return items;
    }

    public int[] getSortedArray() {
        int[] sortedArray = new int[size];
        for(int i = 0; i < sortedArray.length; i++)
            sortedArray[i] = poll();

        return sortedArray;
    }
}
