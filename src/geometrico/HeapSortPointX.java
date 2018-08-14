package geometrico;

public class HeapSortPointX {

    public static void heapSort(Ponto[] array) {
        int length = array.length;

        buildMaxHeap(array, length);
        for (int i = length - 1; i > 0; i--) {
            Ponto temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeapify(array, 1, i);
        }
    }

    private static void buildMaxHeap(Ponto[] array, int heapSize) {
        if (array == null) {
            throw new NullPointerException("null");
        }
        if (array.length <= 0 || heapSize <= 0) {
            throw new IllegalArgumentException("illegal");
        }
        if (heapSize > array.length) {
            heapSize = array.length;
        }

        for (int i = heapSize / 2; i > 0; i--) {
            maxHeapify(array, i, heapSize);
        }
    }

    private static void maxHeapify(Ponto[] array, int index, int heapSize) {
        int l = index * 2;
        int r = l + 1;
        int largest;

        if (l <= heapSize && array[l - 1].getX() > array[index - 1].getX()) {
            largest = l;
        } else {
            largest = index;
        }

        if (r <= heapSize && array[r - 1].getX() > array[largest - 1].getX()) {
            largest = r;
        }

        if (largest != index) {
            Ponto temp = array[index - 1];
            array[index - 1] = array[largest - 1];
            array[largest - 1] = temp;
            maxHeapify(array, largest, heapSize);
        }
    }
}