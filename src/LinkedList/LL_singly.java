package LinkedList;

public class LL_singly {
    public class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
           // this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    //insertion after nth position
    public void insertAfterN(Node head, int n, int data){
        Node newNode = new Node(data);
        Node curr;
        curr = head;
        for(int i = 1; i < n ; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    //insertion after at last
    public void insertAtLast(Node head,int data){
        Node newNode = new Node(data);
        Node curr;
        curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    //deletion at first
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }
    }

    //deletion after n nodes
    public void deleteAfterN(int n){
        Node temp;
        temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            for(int i = 1; i < n; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    //deletion at last
    public void deleteAtLast(){
        Node temp;
        temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null ;
        }
    }
    public void  display(Node Head){
        Node curr;
        curr = head;
        if(head == null){
            System.out.println("The list is empty");
        }
        else{
            while(curr != null){
                System.out.print(curr.data+ "->");
                curr = curr.next;
            }
            System.out.print("END");
        }
    }
}
