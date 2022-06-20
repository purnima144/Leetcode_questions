package LinkedList;

import static LinkedList.middleOfLL_876.head;

public class removeNthNode_19 {
    public static Node removeNode(Node head, int n){
        Node slow, fast;
        slow = head;
        fast = head;
        int i = 0;
        //corner case 1, when there is one node
        if(head.next == null && n == 1){
            return null;
        }
        //update fast pointer by n times
        while(i < n){
            fast = fast.next;
            i++;
        }

        //corner case 2,if length of list = n, means delete the last element from list from back very first from front
        if(fast == null){
            return head.next;
        }

        //else move slow and fast both
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }


    public static void main(String[] args) {
        middleOfLL_876 list = new middleOfLL_876();
        list.addNode(5);
        list.addNode(15);
        list.addNode(35);
        list.addNode(25);
        list.addNode(45);
        list.addNode(65);

        list.display();

        removeNode(head,2);
        System.out.println();

        list.display();

    }
}
