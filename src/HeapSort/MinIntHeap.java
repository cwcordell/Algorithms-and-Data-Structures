/**
 * Created by Cory W. Cordell on 2/19/17.
 *
 * This is a reproduction of the algorithm from
 * the HackerRank Data Structures: Heaps Youtube
 * video, https://youtu.be/t0Cq6tVNRBA.
 *
 * The difference is the added methods sortArray, getHeapArray,
 * and getSortedArray.
 */

package HeapSort;

import java.util.Arrays;

public class MinIntHeap {
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
        while (hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if( items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
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
