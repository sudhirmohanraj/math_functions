package com.programming.dev.math_functions.hackerrank.linkelist;

/**
 * Created by wyh669 on 1/19/17.
 */
public class CycleDetection {

    int data;
    CycleDetection next;

    public static void main(String[] args) {
        CycleDetection node = new CycleDetection();
        node.data =1;
        CycleDetection node1 = new CycleDetection();
        node1.data =3;
        CycleDetection node2 = new CycleDetection();
        node2.data =5;
        CycleDetection node3 = new CycleDetection();
        node3.data =6;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;
        hasCycle(node);

    }

    // slow and fast pointer.
    static boolean hasCycle(CycleDetection head) {
        if(head==null || head.next==null) {
            return false;
        }

        CycleDetection sp = head;
        CycleDetection fp = head.next.next;

        while(sp!=null  && fp!=null ) {
            if(sp==fp) {
                return true;
            } else {
                sp = sp.next;
                fp = fp.next.next;
            }
        }
        return false;
    }
}

