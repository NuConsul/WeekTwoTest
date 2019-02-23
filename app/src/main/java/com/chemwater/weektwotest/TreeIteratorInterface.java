package com.chemwater.weektwotest;

/**
 * Created by dariuswalker on 2/22/19.
 */
import java.util.Iterator ;

public interface TreeIteratorInterface<T> {
    public Iterator<T> getPreorderIterator() ;
    public Iterator<T> getPostorderIterator() ;
    public Iterator<T> getInorderIterator() ;
    public Iterator<T> getLevelOrderIterator() ;
}
