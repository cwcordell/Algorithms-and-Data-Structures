/**
 * Created by Cory W. Cordell on 2/19/17.
 *
 * This is a max heap implementation based on its counterpart of MinIntHeap.
 *
 * The base functionality for the algorithm is provided
 * in the base class IntHeapAbstract along with the additional methods
 * sortArray, getHeapArray, and getSortedArray to allow for HeapSort like
 * functionality of the algorithm.
 */

package HeapSort;

public class MaxIntHeap extends IntHeapAbstract {

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
}
