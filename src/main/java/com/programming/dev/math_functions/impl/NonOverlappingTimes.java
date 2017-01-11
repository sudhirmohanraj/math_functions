package com.programming.dev.math_functions.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by wyh669 on 1/10/17.
 */
public class NonOverlappingTimes {
    //given a list of meeting  and their timings,
    // Write a program to find out the minimum number of conference rooms required without overlapping the meetings.
    // input (1, 3), (1, 5), (6, 7), (4, 7)
    // One object for room time and availability

    public static void main(String[] args) {
        List<Timings> timingsList = new ArrayList<Timings>();
        Timings timings1 = new Timings();
        timings1.setStartTime(1);
        timings1.setEndTime(4);
        Timings timings2 = new Timings();
        timings2.setStartTime(5);
        timings2.setEndTime(6);
        Timings timings3 = new Timings();
        timings3.setStartTime(8);
        timings3.setEndTime(9);
        Timings timings4 = new Timings();
        timings4.setStartTime(2);
        timings4.setEndTime(6);
        timingsList.add(timings4);
        timingsList.add(timings3);
        timingsList.add(timings2);
        timingsList.add(timings1);
        Collections.sort(timingsList,new TimingsComparator());
        minNonOverlappingRooms(timingsList);

    }

    public static int minNonOverlappingRooms(List<Timings> timingsList) {
        if (timingsList.isEmpty()) {
            return 0;
        }
        Integer minRooms =1;
        HashSet<Integer> availability = new HashSet<Integer>();
        for (Timings timings:timingsList) {
            if(!availability.contains(timings.startTime)) {
                Integer endTime = timings.getEndTime();
                while (endTime != timings.getStartTime()){
                    availability.add(endTime-1);
                    endTime = endTime-1;
                }
            } else {
                minRooms += 1;
            }
        }

        return minRooms;
    }
}
