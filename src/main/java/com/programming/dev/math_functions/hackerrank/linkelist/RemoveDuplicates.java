package com.programming.dev.math_functions.hackerrank.linkelist;

/**
 * Created by wyh669 on 1/19/17.
 */
public class RemoveDuplicates {

    int data;
    RemoveDuplicates next;

    public static void main(String[] args) {
        RemoveDuplicates node = new RemoveDuplicates();
        node.data =3;
        RemoveDuplicates node1 = new RemoveDuplicates();
        node1.data =3;
        RemoveDuplicates node2 = new RemoveDuplicates();
        node2.data =3;
        RemoveDuplicates node3 = new RemoveDuplicates();
        node3.data =6;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        removeV2(node);
    }

    // Wrong thought process.
   public static RemoveDuplicates remove(RemoveDuplicates head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        int previous_value = 0;
        boolean initial = true;
        RemoveDuplicates output = new RemoveDuplicates();
       int size =0;
        while(head!=null) {
            if (initial) {
                previous_value = head.data;
                head = head.next;
                initial=false;
                output.data = previous_value;
                size+=1;
            } else {
                if (previous_value == head.data) {
                    RemoveDuplicates temp = head.next;
                    if(temp!=null && temp.next!=null) {
                        head.next = temp.next;
                    } else {
                        head.next = null;
                        head = head.next;
                    }
                } else {
                    previous_value = head.data;
                    RemoveDuplicates iterator = new RemoveDuplicates();
                    iterator= output;
                    int i=0;
                    while(i<size-1) {
                        iterator=iterator.next;
                    }
                    RemoveDuplicates tempNode = new RemoveDuplicates();
                    tempNode.data = head.data;
                    iterator.next = tempNode;
                    output=iterator;
                    head = head.next;
                    size+=1;
                }
            }

        }
        return output;
    }


    public static RemoveDuplicates removeV2(RemoveDuplicates head) {

        // addressing the current and next node.
        if(head==null || head.next==null ) {
            return head;
        }
        // How is it doing this?
        RemoveDuplicates p = head;

        while(p!=null && p.next!=null) {
            if(p.data == p.next.data) {
                p.next= p.next.next;
            } else {
                p = p.next;
            }
        }
        return  head;
    }
}
