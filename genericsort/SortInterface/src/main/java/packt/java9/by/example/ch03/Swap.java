package packt.java9.by.example.ch03;

public interface Swap<COLLECTION> {
    /**
     * Swap two elements
     * @param collection the collection in which to swap the two elements
     * @param i index of the first element to swap
     * @param j index of other element to swap the first with
     */
    void swap(COLLECTION collection, int i, int j);
}
