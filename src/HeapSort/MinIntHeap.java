/**
 * Created by Cory W. Cordell on 2/19/17.
 *
 * This is a reproduction of the algorithm from the HackerRank Data Structures:
 * Heaps Youtube video, https://youtu.be/t0Cq6tVNRBA.
 *
 * The difference is that the base functionality for the algorithm is provided
 * in the base class IntHeapAbstract along with the additional methods
 * sortArray, getHeapArray, and getSortedArray to allow for HeapSort like
 * functionality of the algorithm.
 */

package HeapSort;

public class MinIntHeap extends IntHeapAbstract {
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
}
