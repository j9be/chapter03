package packt.java9.by.example.ch03;

/**
 * Sort a collection that contains elements. The primitive operations 'swap' and 'compare' have to be
 * implemented by the caller and provided by means of class implementations or lambda to the actual sorter
 * via the setters before calling the method {@code sort()}.
 *
 * @param <COLLECTION>
 * @param <ELEMENT>
 */
public interface Sort<ELEMENT, COLLECTION extends SortableCollection<ELEMENT>> {
    void sort(COLLECTION collection);
    void setSwap(Swap<COLLECTION> swap);
    void setCompare(Compare<ELEMENT> compare);
}
