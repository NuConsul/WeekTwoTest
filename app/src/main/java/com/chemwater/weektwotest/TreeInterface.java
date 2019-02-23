package com.chemwater.weektwotest;

/**
 * Created by dariuswalker on 2/22/19.
 */

public interface TreeInterface<T> {
    public T getRootData() ;
    public int getHeight() ;
    public int getNumberOfNodes() ;
    public boolean isEmpty();
    public void clear() ;
}
