package packt.java9.by.example.ch03;

/**
 * Created by verhasp on 2016. 08. 09..
 */
public abstract class AbstractSort
        <ELEMENT, COLLECTION extends SortableCollection<ELEMENT>> implements Sort<ELEMENT, COLLECTION> {
    public abstract void sort(COLLECTION collection);

    protected Swap<COLLECTION> swap = null;

    public void setSwap(Swap<COLLECTION> swap) {
        this.swap = swap;
    }

    protected Compare<ELEMENT> compare = null;

    public void setCompare(Compare<ELEMENT> compare) {
        this.compare = compare;
    }
}
