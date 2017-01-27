package com.programming.dev.math_functions.impl;

import java.util.Comparator;

/**
 * Created by wyh669 on 1/10/17.
 */
public class TimingsComparator implements Comparator<Timings> {
    @Override
    public int compare(Timings o1, Timings o2) {
        if(o1.startTime==o2.startTime)
            return 0;
        else if(o1.startTime>o2.startTime)
            return 1;
        else
            return -1;

    }
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((Timings) o1).getStartTime() > ((Timings) o2).getStartTime() ? 0:1;
//    }
}
