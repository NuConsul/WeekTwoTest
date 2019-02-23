package com.chemwater.weektwotest;

import java.util.Iterator;
import java.util.function.BinaryOperator;

public interface SearchTreeInterface<T extends Comparable<? super T>> extends TreeInterface<T> {

    /** Searches for a specific entry in this tree.
     * @param entry An object to be found.
     * @return True if the object was found in the tree.
     */

    public boolean contains(T entry) ;

    public T getEntry(T entry) ;

    public T add(T newEntry) ;

    public T remove(T entry) ;

    public Iterator<?> getInorderIterator() ;

}