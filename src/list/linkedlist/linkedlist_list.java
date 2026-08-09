package list.linkedlist;

import java.util.LinkedList;

public class linkedlist_list {
    public static void main(String[] args) {
//        Node node1=new Node();
//        Node node2=new Node();
//        node1.value=1;
//        node1.next=node2;
//        node2.value=2;
//        node2.next=null;

//        this is in linkedlist


//        ============================
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addFirst(0);
        list.addLast(6);
        System.out.println(list);

    }

}
//class Node{
//    public int value;
//    public Node next;
//}
