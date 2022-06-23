package LinkedList;

public class insertion_in_singly_ll {
    public static void main(String [] args){
        LL_singly list = new LL_singly();
        list.insertNode(3);
        list.insertNode(13);
        list.insertNode(23);
        list.insertNode(33);
        list.insertNode(43);
        System.out.println("After adding nodes");
        list.display(list.head);

        list.insertAfterN(list.head,3, 5);//insertion after n nodes
        System.out.println("Insertion after n nodes");
        list.display(list.head);
        System.out.println();

        list.insertAtLast(list.head,25); //insertion at last
        System.out.println("Insertion at last");
        list.display(list.head);
        System.out.println();

        //deletion at first
        list.deleteAtFirst();
        System.out.println("Deletion of first node");
        list.display(list.head);
        System.out.println();

        //deletion after n nodes
        list.deleteAfterN(3);
        System.out.println("Deletion after n node");
        list.display(list.head);
        System.out.println();

        //deletion at last
        list.deleteAtLast();
        System.out.println("Deletion at last");
        list.display(list.head);
        System.out.println();

    }

}


