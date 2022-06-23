package LinkedList;
public class linkedList {
    //represent a node of singly linked list
    public static class Node{
        int data;
        Node next;
        Node(){}
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null, tail = null; //start and end of linked-list
    //________________InsertNode___________
    public static void addNode(int data){
        Node newNode = new Node(data); //a node is created
        //if list is empty, head and tail will point to same node
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;//tail will be newly added node
        }
        tail = newNode;
    }

    //--------------to display-----------
    public static void display(){
        Node temp;
        temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("END");
        }
    }

    public static void main(String [] args){
        linkedList sList = new linkedList();
        sList.addNode(5);
        sList.addNode(15);
        sList.addNode(25);
        sList.addNode(35);
        sList.addNode(45);
        sList.addNode(55);

        sList.display();


    }

}
