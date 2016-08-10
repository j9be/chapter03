package packt.java9.by.example.ch03;

public interface Compare<ELEMENT> {
    /**
     * Compare two elements
     *
     * @param first element to compare
     * @param second element to compare the first to
     * @return any negative value of the first element precedes the second
     * any positive value when the second element precedes the first
     * zero if the two elements are equal
     */
    int compare(ELEMENT first, ELEMENT second);
}
