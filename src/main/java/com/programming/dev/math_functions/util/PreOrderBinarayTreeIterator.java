package com.programming.dev.math_functions.util;

import java.util.Iterator;

/**
 * Description.
 * @author Your Name
 */
public interface PreOrderBinarayTreeIterator extends Iterator<Integer> {

    public boolean hasNext();

    public Integer next();

    public void remove();

}
