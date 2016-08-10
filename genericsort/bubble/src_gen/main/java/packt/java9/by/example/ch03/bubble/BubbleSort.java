package packt.java9.by.example.ch03.bubble;

import packt.java9.by.example.ch03.*;

public class BubbleSort<ELEMENT, COLLECTION extends SortableCollection<ELEMENT>> extends AbstractSort<ELEMENT, COLLECTION> {
    public void sort(COLLECTION collection) {
        int n = collection.size();
        while (n > 1) {
            for (int j = 0; j < n - 1; j++) {
                if (compare.compare(collection.get(j), collection.get(j + 1)) > 0) {
                    swap.swap(collection, j, j + 1);
                }
            }
            n--;
        }
    }
}
